/*
Write a java program using String buffer to delete,remove character
*/



public class Ex_2_D {
    public static void main(String[] args) {
        StringBuffer line = new StringBuffer("JAVA LAB PROGRAMS");
        line.deleteCharAt(9);
        System.out.println("by using deleteCharAt function"+line);
        line.delete(5, 12);
        System.out.println("by  using delete function"+line);
    }
}
