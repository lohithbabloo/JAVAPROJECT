/*
Write a java program to implement single inheritance
*/


public class Ex_5_A {
    protected String name = "LOHITH KUMAR";
    public void grades()
    {
        System.out.println("FIRST CLASS");
    }
}
class student extends Ex_5_A
{
    private String rollno = "19VV1A1256";
    public static void main(String[] args) {
        student s1 = new student();
        System.out.println(s1.name + " of roll number "+s1.rollno+" got passed in ");
        s1.grades();
    }
}
