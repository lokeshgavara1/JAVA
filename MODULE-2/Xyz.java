interface Printable{
    void print();
}
interface Showable{
    void print();
}
class Xyz implements Printable,Showable{
    public void print(){
        System.out.println("hello");
    }
    public static void main(String args[]){
        Xyz obj=new Xyz();
        obj.print();
    }
}