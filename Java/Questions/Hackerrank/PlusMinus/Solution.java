package Questions.Hackerrank.PlusMinus;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float p=0;
    float n=0;
    float z=0;
    float c=0;
    for(int a:arr){
        c++;
        if(a<0)
        n++;
        else if(a>0)
        p++;
        else
        z++;
    }
    System.out.println(String.format("%.6f", p/c));
    System.out.println(String.format("%.6f", n/c));
    System.out.println(String.format("%.6f", z/c));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
