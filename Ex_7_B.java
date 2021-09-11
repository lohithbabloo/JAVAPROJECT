/*
Write a java program on multiple catch clauses
*/


public class Ex_7_B {
    public static void main(String[] args) {
        try {
            int num[] = new int[5];
            num[10] = 6;
        } catch (ArithmeticException e) {
            System.out.println("ARTHMETIC EXPRESSION");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ARRAY INDEX OUT OF BOUND");
        }
        catch(Exception e)
        {
            System.out.println("parent error");
        }
    }
}
