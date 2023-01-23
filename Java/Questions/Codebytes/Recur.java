package Questions.Codebytes;
import java.util.*; 
//import java.io.*;

class Recur {

  public static int ArrayChallenge(String ar) {
    String str[]=ar.split(" ");
    int arr[]=new int[str.length];
    for (int i=0;i<str.length;i++){
        arr[i]=Integer.parseInt(str[i]);
    }
    // code goes here  
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
          int sum=0;
            for(int k=j;k<=i;k++){
                sum=sum+arr[k];
            }
            if(sum>max){
                max=sum;
            }
        }
        
    }

    return max;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
    s.close();
  }

}