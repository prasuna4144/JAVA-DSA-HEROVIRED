3.SUB ARRAY
solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();

    List<Integer> inputList = new ArrayList<>();

    int count = 0;
    for(int i=0; i<size; i++) {
        inputList.add(scanner.nextInt());

        for(int j=0; j<=i; j++) {
            int sum = 0;
            sum += inputList.subList(j, i+1).stream().mapToInt(Integer::intValue).sum();
            if (sum < 0)
                count++;
        }
    }

    scanner.close();
    System.out.println(count);
}
