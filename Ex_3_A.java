/*
Write a java program to  implement class mechanism 
-create a class,methods and invoke them inside main method
*/



public class Ex_3_A {
    int sum = 0;
    int addtwonumber(int a , int b)
    {
        sum = a+b;
        return sum;
    }
}
class example {
    public static void main(String[] args) {
        Ex_3_A obj = new Ex_3_A();
        int answer = obj.addtwonumber(2, 5);
        System.out.println(answer);    
    }
}

