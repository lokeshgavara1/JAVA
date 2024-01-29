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

class D extends C{
    int c=30;
    void abc(){
        System.out.println("D class");
    }
}

class E extends D{
    int d=40;
    void xyz(){
        System.out.println("E class");
    }
}

 class SingleInheritance{
    public static void main(String[] args){
        C obj=new C();
        System.out.println("child class variable "+obj.b);
        obj.show();
        System.out.println("parent class variable"+obj.a);
        obj.display();
        System.out.println("D class "+obj.c);
        obj.abc();
        System.out.println("E class "+obj.d);
        obj.xyz();
    }
 }
