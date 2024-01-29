class Parent{
    void display(){
        System.out.println("Parent");
    }
}

class Child extends Parent{
    void display(){
        System.out.println("Class");
    }
}

class SuperClass{
    public static void main(String[] args){
        Child c =new Child();
        c.display();
        System.out.println(super.display());
    }
}