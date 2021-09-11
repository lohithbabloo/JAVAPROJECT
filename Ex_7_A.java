/*
Write a java program that describes exceptional handling mechanism 
*/


public class Ex_7_A {
    public static void main(String[] args) {
        try {
            int a  = 1000/0;
            System.out.println(a);
        } catch (Exception e) {
            System.out.println("arithemtic exception occurs while dividing by zero"+e.getMessage());
        }
        finally
        {
            System.out.println("this is me finally statement");
        }
    }
}
