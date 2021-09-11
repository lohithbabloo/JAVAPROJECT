/*
Write a java program to implement method overloading
*/


public class Ex_4_B {
    void add()
    {
        int a = 3;
        int b = 4;
        int sum;
        sum = a+b;
        System.out.println(sum);
    }
    void add(int a,int b)
    {
        int sum;
        sum = a+b;
        System.out.println(sum);
    }
}
class methodoverloading
{
    public static void main(String[] args) {
        Ex_4_B obj1 = new Ex_4_B();
        obj1.add();
        Ex_4_B obj = new Ex_4_B();
        obj.add(1,2);
    }
} 
