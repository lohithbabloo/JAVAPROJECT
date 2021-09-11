/*
Write a java program to implement constructor overloading
*/


public class Ex_4_A {
    int num1;
    int num2;
    String operation;
    public Ex_4_A(){
        num1 = 0;
        num2 = 0;
        operation = "nothing";
    }
    public Ex_4_A(int i)
    {
        num1 = i;
        num2 = 0;
        operation = "something";
    }
    public Ex_4_A(int i , int j)
    {
        num1 = i;
        num2 = j;
        operation = "everything";
    }
    public Ex_4_A(int i,int j,String op)
    {
        num1 = i;
        num2 = j;
        operation = op;
    }
}
class constructoroverloading
{
    public static void main(String[] args) {
        Ex_4_A obj = new Ex_4_A();
        System.out.println("num1: "+obj.num1+"\nnum2: "+obj.num2+"\noperation: "+obj.operation);
        Ex_4_A obj1 = new Ex_4_A(1);
        System.out.println("num1: "+obj1.num1+"\nnum2: "+obj1.num2+"\noperation: "+obj1.operation);
        Ex_4_A obj2 = new Ex_4_A(1,2);
        System.out.println("num1: "+obj2.num1+"\nnum2: "+obj2.num2+"\noperation: "+obj2.operation);
        Ex_4_A obj3 = new Ex_4_A(1,2,"add");
        System.out.println("num1: "+obj3.num1+"\nnum2: "+obj3.num2+"\noperation: "+obj3.operation);

    }
}