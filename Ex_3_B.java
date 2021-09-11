/*
Write a java program to implement constructor
*/


public class Ex_3_B {
    int num1;
    int num2;
    String operation;
    public Ex_3_B(){
        num1 = 5;
        num2 = 5;
        operation = "addition";
    }
}
class constructorexample
{
    public static void main(String[] args) {
        Ex_3_B obj = new Ex_3_B();
        System.out.println("num1: "+obj.num1+"\nnum2: "+obj.num2+"\noperation: "+obj.operation);
    }
}