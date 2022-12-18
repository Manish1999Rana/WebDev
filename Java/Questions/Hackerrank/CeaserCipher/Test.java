package Questions.Hackerrank.CeaserCipher;

public class Test {
   public static void main(String[] args) {
      
   String s="159357lcfd";
   int k=98;
   //int[] a=new int[s.length()];
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
      System.out.println(new String(b));
   }
}
