//java program to swap two numbers;
public interface SwapNumber {
    public static void main(String[] args){
        float first=1.20f,second=2.45f;
        System.out.println("--before swap--");
        System.out.println("First number ="+first);
        System.out.println("Second number="+second);
        float temp=first;
        first=second;
        second=temp;
        System.out.println("--after swap--");
        System.out.println("First number ="+first);
        System.out.println("Second number="+second);

    }
    
}