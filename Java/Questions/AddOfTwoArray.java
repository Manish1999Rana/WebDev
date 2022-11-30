package Questions;
import java.util.Scanner;

public class AddOfTwoArray {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter length of first array:");
      int a=sc.nextInt();
      Integer ar[]=new Integer[a];
      int sum1=0;
      for(int i=0;i<a;i++){
         ar[i]=sc.nextInt();
         sum1=sum1*10+ar[i];
      }
      System.out.print("Enter length of Second array:");
      int b=sc.nextInt();
      Integer arr[]=new Integer[b];
      int sum2=0;
      for(int i=0;i<b;i++){
         arr[i]=sc.nextInt();
         sc.close();
         sum2=sum2*10+arr[i];
      }
      int sum=sum1+sum2;
      int len=(String.valueOf(sum)).length();
      Integer array[]=new Integer[len]; 
      for(int i=len-1;i>=0;i--){
         array[i]=sum%10;
         sum=sum/10;
      }
      System.out.println("\n\nOutput Array:-");
      for (Integer integer : array) {
         System.out.println(integer);
      }
   }
}
