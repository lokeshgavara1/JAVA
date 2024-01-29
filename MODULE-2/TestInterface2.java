interface Bank{
    float roi();
}

class State implements Bank{
    public float roi(){
        return 9.15f;
    }
}
class Punjab implements Bank{
    public float roi(){
        return 9.7f;
    }
}

class TestInterface2{
    public static void main(String[] args){
        Bank b=new State();
        System.out.println("ROI:" + b.roi());
    }
}