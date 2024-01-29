import java.util.Scanner;
class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of rectangle:");
        double length=sc.nextDouble();
        System.out.println("enter the width of the rectangle:");
        double width=sc.nextDouble();
        //Area=length*width
        double area=length*width;
        System.out.println("Area of rectangle is:"+area);
    }
    
}
