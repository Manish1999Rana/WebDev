package Questions.Hackerrank.SubarrayDivision1;

import java.util.ArrayList;
import java.util.*;

public class Test {
   public static void main(String[] args) {
   List<Integer> s=new ArrayList<>();
   s.add(2);
   s.add(2);
   s.add(1);
   s.add(3);
   s.add(2);
   int d=4;
   int m=2;
   
   int count=0;
   int sum;
   for(int i=0;i<=s.size()-m;i++){
     sum=0;
     for(int j=0;j<m;j++){
         sum=sum+s.get(i+j);
         System.out.println("i="+i+" j="+j+" sum="+sum);
     }
     if(sum==d){
         count++;
     }
   }
   System.out.println(count);
   }
}
