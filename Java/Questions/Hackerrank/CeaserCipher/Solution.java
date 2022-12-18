package Questions.Hackerrank.CeaserCipher;
import java.io.*;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

   public static String caesarCipher(String s, int k) {
      // Write your code here
      
      char[] b=new char[s.length()];
      for(int i=0;i<s.length();i++){
         if((int)s.charAt(i)<123&&(int)s.charAt(i)>96){
            b[i]=(char)((((int)(s.charAt(i))-97+k)%26)+97);
         }
         else if((int)s.charAt(i)<91&&(int)s.charAt(i)>64){
            b[i]=(char)((((int)(s.charAt(i))-65+k)%26)+65);
         }
         else{
            b[i]=s.charAt(i);
         }
      }
      return new String(b);

   }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
