interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}
//main class
class TestInterface4 implements Printable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("welcome");
    }
    public static void main(String[] args){
        TestInterface4 obj=new TestInterface4();
        obj.print();
        obj.show();
    }
}
