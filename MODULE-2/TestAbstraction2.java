abstract class Bike {
    Bike(){//non-abstract method
        System.out.println("bike is created");
    }
    abstract void run();//abstract method
    void changeGear(){
        System.out.println("Gear changed");
    }
}
//creating child class
class Honda extends Bike{
    void run(){
        System.out.println("running safely");
    }
}
//main class
class TestAbstraction2{
    public static void main(String[] args){
        Bike obj=new Honda();
        obj.run();
        obj.changeGear();
    }
}
