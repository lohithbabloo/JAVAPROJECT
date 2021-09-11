import java.io.*;

/**
Write a java program for creation of java built-in exceptions
*/


public class Ex_9_C {
    public static void main(String[] args) {
        ArithmeticExceptiondmeo();
        ArrayIndexOutOfBoundsExceptiondemo();
        FileNotFoundExceptiondemo();
    }
    static void ArithmeticExceptiondmeo()
    {
        try {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println("result = "+c);
        } catch (Exception e) {
            System.out.println("exception occured"+e.getMessage());
        }
    }
    static void ArrayIndexOutOfBoundsExceptiondemo(){
        try {
            int arr[] = new int[5];
            arr[6] = 0;
            } catch (Exception e) {
            System.out.println("error found"+e.getMessage());
        }
    }
    static void FileNotFoundExceptiondemo(){
       try {
        File file = new File("E://file.txt");
        FileReader fileRead = new FileReader(file);
        System.out.println(fileRead);

       } catch (Exception e) {
           System.out.println("error"+e.getMessage());
       }
    }
}
