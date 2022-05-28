import java.util.Scanner;

public class Search{
   public static void main(String[] args) {
      new Search();
   }
   Search(){
      System.out.println("Enter the length of the array");
      Scanner sc=new Scanner(System.in);
      int input=sc.nextInt();
      Integer a[]=new Integer[input];
      System.out.println("Enter the elements of the array");
      for(int i = 0 ; i < input; i++ ){
         a[i]=sc.nextInt();
      }
      System.out.println("Enter the key value");
      int key=sc.nextInt();
      System.out.print("Index- ");
      Boolean counter = true;
      for(int i = 0 ; i < input; i++ ){
         if(a[i]==key){
            System.out.print(i+" ");
            counter=false;
         }
      }
      if (counter){
         System.out.println("-1");
      }
   }
}