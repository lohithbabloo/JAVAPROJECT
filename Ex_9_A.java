/**
Write a java program for creation and illustrating catch block 
*/


public class Ex_9_A {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("division by zero cause an error");
        } catch (Exception e) {
            System.out.println("exception found");
            System.out.println("cant divide by zero"+e.getMessage());
        }
    }
    
}
