//Interface declaration
interface Drawable{
    void draw();
}
//implementation by user
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class Square implements Drawable{
    public void draw(){
        System.out.println("drawing square");
    }
}
//main class
class TestInterface1{
    public static void main(String[] args){
        Drawable d=new Square();
        d.draw();
    }
}
