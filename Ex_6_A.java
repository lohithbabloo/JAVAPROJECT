/*
Write a java program to give an example for "super" keyword
*/


public class Ex_6_A {
    void studentdetails(){
        System.out.println("this is me!!!");
    }
    public static void main(String[] args) {
        rollno obj = new rollno();
        obj.studentdetails();
    }
}
class rollno extends Ex_6_A
{
    void studentdetails(){
        super.studentdetails();
        System.out.println("1234");
    }
}
