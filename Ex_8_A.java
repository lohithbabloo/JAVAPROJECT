/**
Write a java program that implements run time polymorphism
*/
class school1
{
    void details()
    {
        System.out.println("Name is john\nrollnumber is  1234");
    }
}
class student_1 extends school1{
    void details()
    {
        System.out.println("Name is king \n rollnumber is 5678");
    }
}



public class Ex_8_A {
    public static void main(String[] args) {
        school1 obj = new school1();
        school1 obj1 = new student_1();
        obj.details();
        obj1.details();
    }
    
}
