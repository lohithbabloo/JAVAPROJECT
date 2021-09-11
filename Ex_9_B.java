/**
Write a java program for creation of illustrating finally
*/


public class Ex_9_B {
    public static void main(String[] args) {
        System.out.println("finally can be used after try block and catch block");
        finallyaftertry();
        finallyaftercatch();

    }
    static void finallyaftertry()
    {
        try
        {
            System.out.println("no operations done to show error");
        }
        catch(Exception e){
            System.out.println("gets executed when theres an error");
        }finally
        {
            System.out.println("this always executes");
        }
    }
    static void finallyaftercatch(){
        try {
            System.out.println("contains an exception");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("executes because there is an exception in try block");
        }finally
        {
            System.out.println("totally executes");
        }
    }
}
