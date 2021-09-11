/*
Write a java program to implement interface.
what kind of inheritance can be achieved?

Interfaces can achieve multiple inheritance
*/
interface school
{
    public void name();
    public void rollno();
}
class student1 implements school
{
    public void name()
    {
        System.out.println("this is mine!!");
    }
    public void rollno()
    {
        System.out.println("1234");
    }
}


public class Ex_6_B {
    public static void main(String[] args) {
    student1 obj = new student1();
    obj.name();
    obj.rollno();
    }
}

