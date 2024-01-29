abstract class shape{
    abstract void draw();
}
class Rectangle extends shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("drawing circle");
    }
}

//Main class
class TestAbstraction{
    public static void main(String[] args){
        shape sc=new circle();
        sc.draw();
    }
}