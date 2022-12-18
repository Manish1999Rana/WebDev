package Questions.Hackerrank.SalesByMatch;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

   public static int sockMerchant(int n, List<Integer> ar) {
      // Write your code here
      int count=0;
      for(int i=0;i<ar.size()-1;i++){
         for(int j=i+1;j<ar.size();j++){
            System.out.println(ar+" i="+i+" j="+j);
            if(ar.get(i)==ar.get(j)){
               ar.remove(j);
               ar.remove(i);
               i=-1;
               count++;
               break;
            }
         }
      }
      return count;
   }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
