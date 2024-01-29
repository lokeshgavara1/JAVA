class A{
    protected void msg(){
        System.out.println("hello java");
    }
}
public class Simple2 extends A{
    void msg(){
        System.out.println("hello java");//C.T error
    }
        public static void main(String []args){
            Simple2 obj=new Simple2();
            obj.msg();
    }
}