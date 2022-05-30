import java.util.Scanner;

public class PostFixExpSolver {
   public static void main(String[] args) {
      new PostFixExpSolver();
   }
   PostFixExpSolver(){
      System.out.println("Eneter the equation in Postfix expression:");
      try (Scanner sc = new Scanner(System.in)) {
         String s=sc.nextLine();
         //System.out.println(s);
         String input[]=s.split("\s+"); 
         
         /*for (String as : input) {
            System.out.println(as);
         }*/
         Integer stack[]=new Integer[10];
         int i=-1;
         for (int n=0;n<input.length;n++) {
            try {
               int a=Integer.parseInt(input[n].trim());
               i++;
               stack[i]=a;
            } catch (Exception e) {
               if(input[n].charAt(0)=='+'){
                  stack[i-1]=stack[i-1]+stack[i];
                  i--;
               }
               if(input[n].charAt(0)=='-'){
                  stack[i-1]=stack[i-1]-stack[i];
                  i--;
               }
               if(input[n].charAt(0)=='*'){
                  stack[i-1]=stack[i-1]*stack[i];
                  i--;
               }
               if(input[n].charAt(0)=='/'){
                  stack[i-1]=stack[i-1]/stack[i];
                  i--;
               }
            }
         }
         System.out.println(stack[i]);
      }
   }
}
