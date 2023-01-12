import java.util.*; 
//import java.io.*;

class Main {

  public static String ThirdGreatest(String sen) {
    // code goes here  
    String s="";
    sen=sen.replaceAll("[^a-zA-Z0-9]", " ");
    String[] res=sen.split(" ");
    for(int i=0;i<res.length;i++){
      if(res[i].length()>s.length()){
        s=res[i];
      }
    }

    return s;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ThirdGreatest(s.nextLine())); 
    s.close();
  }

}