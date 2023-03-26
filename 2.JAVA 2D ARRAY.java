2.JAVA 2D ARRAY
solution:
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
       int maxSum = 0;
    int currentSum = 0;

    for (int i=0; i < arr.size()-2; i++){
        for (int j = 0; j<arr.get(i).size()-2; j++){
            currentSum += arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
            currentSum += arr.get(i+1).get(j+1);
            currentSum += arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);

            maxSum = Math.max(currentSum, maxSum);
            currentSum=0;
        }
    }
    System.out.println(maxSum);

        bufferedReader.close();
    }
}
