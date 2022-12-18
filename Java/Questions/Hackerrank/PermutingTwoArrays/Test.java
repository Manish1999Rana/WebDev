package Questions.Hackerrank.PermutingTwoArrays;
import java.util.*;

public class Test {
   public static void main(String[] args) {
      
      int k=10;
      List<Integer> A=new ArrayList<Integer>();
      A.add(1);
      A.add(3);
      A.add(2);
      
      List<Integer> B=new ArrayList<Integer>();
      B.add(7);
      B.add(8);
      B.add(9);
      
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

      System.out.println(res);
   }
}
