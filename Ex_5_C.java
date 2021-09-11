/*
Write a java program for abstract class to find areas of different shapes 
*/
abstract class shape
{
    private double length;
    private double breadth;
    
    public void togetvalues(double length,double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double getlength(){
        return length;
    }
    public  double getbreadth()
    {
        return breadth;
    }
    public abstract double getarea();      
}
class square extends shape{
    public double getarea(){
        return getlength() * getbreadth();
    }
}
class traingle  extends shape
{
    public double getarea(){
        return ((getlength() * getbreadth()))/2;
    }
}

public class Ex_5_C {
    public static void main(String[] args) {
        square obj1 = new square();
        obj1.togetvalues(5, 7);
        double area1 = obj1.getarea();
        System.out.println(area1);
        traingle obj2 = new traingle();
        obj2.togetvalues(8, 9);
        double area2 = obj2.getarea();
        System.out.println(area2);
    }
}
