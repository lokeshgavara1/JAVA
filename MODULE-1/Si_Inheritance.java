
class Abc{
    void screen(){
    System.out.println("ABC");
    }
}
class Def extends Abc{
    void show(){
    System.out.println("class DEF");
    }
}
class Ghi extends Abc{
    void display(){
    System.out.println("class Ghi");
    }
}

class Si_Inheritance{
    public static void main(String[] args){
        Def obj=new Def();
	Ghi obj1=new Ghi();
        obj1.display();
        obj.show();
        obj.screen();

    }
}

        
        