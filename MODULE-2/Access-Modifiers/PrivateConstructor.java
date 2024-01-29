class A{
    private A(){}//private constructor
    void msg(){
        System.out.println("hello java");
    }
}
public class PrivateConstructor{
    public static void main(String []args){
        A obj = new A();//compile time error
    }
}