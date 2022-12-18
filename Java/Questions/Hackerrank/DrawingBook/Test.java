package Questions.Hackerrank.DrawingBook;

public class Test {
   public static void main(String[] args) {
      int n=7;
      int p=4;
      
      int count=0;
      if(n%2==0){
         if((n+1)/2<p){
            count=((n+1)-p)/2;
         }
         else{
            count=p/2;
         }
      }
      else{
         if((n+1)/2<=p){
            count=((n)-p)/2;
         }
         else{
            count=p/2;
         }
      }
      System.out.println(count);
   }
}
