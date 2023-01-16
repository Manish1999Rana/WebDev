import java.util.*;

class Main {

  public static int ArrayChallenge(String str) {
    // code goes here








    
    String[] s=str.split(" ");
    int l=s.length;
    int arr[]=new int[l];
    for(int i=0;i<l;i++){
        arr[i]=Integer.parseInt(s[i]);
    }
    int []a=new int[arr[1]-arr[0]+1];
    int []b=new int[arr[3]-arr[2]+1];
    for(int i=arr[0];i<=arr[1];i++){
        a[i-arr[0]]=i;
    }
    for(int i=arr[2];i<=arr[3];i++){
        b[i-arr[2]]=i;
    }
    return 0;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayChallenge(s.nextLine())); 
    s.close();
  }

}