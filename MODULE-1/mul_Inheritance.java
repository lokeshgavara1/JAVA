
class Abc{
    void screen(){
    System.out.println("ABC");
    }
}
class Def {
    void show(){
    System.out.println("class DEF");
    }
}
class Ghi extends Abc,Def{
    void display(){
    System.out.println("class Ghi");
    }
}

class Si_Inheritance{
    public static void main(String[] args){
	Ghi obj1=new Ghi();
    obj1.display();

    }
}

        
        