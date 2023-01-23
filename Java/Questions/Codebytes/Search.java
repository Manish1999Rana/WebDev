package Questions.Codebytes;
import java.util.*; 
//import java.io.*;

class Search {

  public static String SearchingChallenge(String str) {
    // code goes here  
    String st[]=str.split(" ");
    int count=0;
    int index=0;
    
    for(int i=0;i<st.length;i++){
        int flag=0;
        for(int j=0;j<st[i].length();j++){
            for(int k=j+1;k<st[i].length();k++){
                if(st[i].charAt(j)==st[i].charAt(k)){
                    flag++;
                }
            }
        }
        if(flag>count){
            count=flag;
            index=i;
        }
    }
    String s="";
    String res[]=st[index].split("");
    for(int i=0;i<res.length;i++){
      if(res[i].matches("[b16fv0rneda]"))
      res[i]="--"+res[i]+"--";
      s=s+res[i];
    }
    return s;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SearchingChallenge(s.nextLine()));
    s.close(); 
  }

}