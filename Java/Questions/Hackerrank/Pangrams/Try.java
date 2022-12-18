package Questions.Hackerrank.Pangrams;

public class Try {
   public static void main(String[] args) {
      String s="The quick brown fox jumps over the lay dog";
      char[] a=s.toCharArray();
      String res="pangram";
      for(int j=97;j<=122;j++){
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
      System.out.println(res);
   }
}
