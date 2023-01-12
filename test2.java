import java.util.*; 
//import java.io.*;

class Main {

  public static String ThirdGreatest(String strArr) {
    // code goes here  
    strArr=strArr.replaceAll("[^a-zA-Z0-9]", " ");
    String[] res=strArr.split(" ");
    for(int i=0;i<res.length;i++){
      for(int j=0;j<res.length-i-1;j++){
        if(res[j].length()>res[j+1].length()){
          String t=res[j];
          res[j]=res[j+1];
          res[j+1]=t;
        }
      }
    }

    return res[res.length-3];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ThirdGreatest(s.nextLine())); 
    s.close();
  }

}