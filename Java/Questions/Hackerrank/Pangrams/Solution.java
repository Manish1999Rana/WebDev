package Questions.Hackerrank.Pangrams;

import java.io.*;

class Result {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

   public static String pangrams(String s) {
   // Write your code here
      char[] a=s.toCharArray();
      String res="pangram";
      for(int j=97;j<122;j++){
         int count=0;
         for(int i=0;i<a.length;i++){
            if(j==Character.toLowerCase(a[i])){
               count=1;
               continue;
            }
         }
         if(count==0){
            res="not pangram";
         }
      }
      
      
      return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
