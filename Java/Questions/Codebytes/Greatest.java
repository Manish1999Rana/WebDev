package Questions.Codebytes;
import java.util.*; 
//import java.io.*;

class Main {

  public static String StringChallenge(String sen) {
    // code goes here  
    sen=sen.replaceAll("[^a-zA-Z0-9 ]", "");
    String str[]=sen.split(" ");
    String st="";
    int count=0;
    int index=0;
    for(int i=0;i<str.length;i++){
      if(count<str[i].length()){
        count=str[i].length();
        index=i;
      }
    }
    String[] s=str[index].split("");
    for(int i=0;i<s.length;i++){
      if(s[i].matches("[b16fv0rneda]"))
      s[i]="--"+s[i]+"--";
      st=st+s[i];
    }
    return st;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StringChallenge(s.nextLine())); 
    s.close();
  }

}