interface Draw{
    void draw();
    static int cube(int x){
        return x*x*x;
    }
}
class Rectangle implements Draw{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}
class StaticMethodInterface{
    public static void main(String args[]){
        Draw obj=new Rectangle();
        obj.draw();
        System.out.println(Draw.cube(3));
    }
}
