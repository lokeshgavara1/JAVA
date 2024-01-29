package mypack;
import pack.*;
class ProtectedB extends ProtectedA{
    public static void main(String [] args){
        ProtectedB obj = new ProtectedB();
        obj.msg();
    }
}