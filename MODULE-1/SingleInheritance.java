class P{
    int a=10;
    void display(){
        System.out.println("parent class");
    }
}

class C extends P{
    int b=20;
    void show(){
        System.out.println("child class");
    }
}
 class SingleInheritance{
    public static void main(String[] args){
        C obj=new C();
        System.out.println("child class variable "+obj.b);
        obj.show();
        System.out.println("parent class variable"+obj.a);
        obj.display();
    }
 }