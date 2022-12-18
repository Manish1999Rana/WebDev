package Questions.Hackerrank.PermutingTwoArrays;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
    * Complete the 'twoArrays' function below.
    *
    * The function is expected to return a STRING.
    * The function accepts following parameters:
    *  1. INTEGER k
    *  2. INTEGER_ARRAY A
    *  3. INTEGER_ARRAY B
    */

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    // Write your code here
        String res="YES";
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.size()-i-1;j++){
                if(A.get(j)>A.get(j+1)){
                    int t=A.get(j);
                    A.set(j, A.get(j+1));
                    A.set(j+1, t);
                }
            }
        }
        for(int i=0;i<B.size();i++){
            for(int j=0;j<B.size()-i-1;j++){
                if(B.get(j)<B.get(j+1)){
                    int t=B.get(j);
                    B.set(j, B.get(j+1));
                    B.set(j+1, t);
                }
            }
        }
        System.out.println(B);
        for(int i=0;i<A.size();i++){
            if(A.get(i)+B.get(i)<k){
                res="NO";
            }
        }

        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                //int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result.twoArrays(k, A, B);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
