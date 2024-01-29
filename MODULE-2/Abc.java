interface Printable{
    void print();
}
interface Showable extends Printable{
    void show();
}
class Abc implements Showable{
    public void print(){
        System.out.println("hello");
    }
    public void show(){
        System.out.println("welcome");
    }
    public static void main(String args[]){
        Abc obj=new Abc();
        obj.print();
        obj.show();
    }
}
