public class Test{
    public static void main(String[] args) {
        B onj=new B();
        onj.display();
    }
}
class C{
    void display(){
        System.out.println("c");
    }
}
class B extends C{
}