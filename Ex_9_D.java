/** 
Write a java program for creation of user defined exception
 */

class myexception extends Exception
{
    public myexception(String s)
    {
        super(s);
    }
}
public class Ex_9_D {
    public static void main(String args[])
    {
        try
        {
            throw new myexception("exception");
        }
        catch (myexception ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
    
}
