package Questions.Hackerrank.SalesByMatch;

import java.util.*;

public class Test {
   public static void main(String[] args) {
      List<Integer> ar=new ArrayList<>();
      ar.add(10);
      ar.add(20);
      ar.add(20);
      ar.add(10);
      ar.add(10);
      ar.add(30);
      ar.add(50);
      ar.add(10);
      ar.add(20);
      ar.add(10);/*
      ar.add(10);
      ar.add(10);
      ar.add(10);
      ar.add(10);
      ar.add(10);
      ar.add(10);
      ar.add(10);
      ar.add(10);
      ar.add(10);
      ar.add(10);*/
      
      int count=0;
      for(int i=0;i<ar.size()-1;i++){
         for(int j=i+1;j<ar.size();j++){
            //System.out.println(ar+" i="+i+" j="+j);
            if(ar.get(i)==ar.get(j)){
               ar.remove(j);
               ar.remove(i);
               i=-1;
               count++;
               break;
            }
         }
      }
      System.out.println(count);
   }
}
