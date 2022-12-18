package Questions.Hackerrank.MinMaxSum;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    long mx=0;
    long mn=0;
    long sum=0;
    Byte c=0;
    for(int n:arr){
        sum=sum+n;
        if(c==0){
            mn=n;
            mx=n;
            c++;
        }
        else if(n<mn)
        mn=n;
        else if(n>mx)
        mx=n;
    }
    System.out.print((sum-mx)+" "+(sum-mn));

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
