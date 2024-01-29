interface Draw{
    void draw();
    default void msg(){
        System.out.println("default method");
    }
}
class Rectangle implements Draw{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class DefaultDemoInterface{
    public static void main(String args[]){
        Draw obj=new Rectangle();
        obj.draw();
        obj.msg();
    }
}