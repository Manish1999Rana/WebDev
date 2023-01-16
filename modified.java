import java.util.*;
public class modified {
    static int[] a;
    modified(int n){
        a=new int[n+1];
        a[1]=0;
        a[2]=1;
        a[3]=2;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n (no of fabonacii series):");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        new modified(n);
        for(int i=1;i<n+1;i++){
            System.out.println(fab(i));
        }
    }
    static int fab(int n){
        if(a[n]==0&&n>3){
            a[n]=fab(n-1)+fab(n-2)+fab(n-3);
        }
        return a[n];
    }
}
