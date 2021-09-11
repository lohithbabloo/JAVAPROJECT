/**
Write a java program illustrating class path 
*/


public class Ex_12_A {
    public static void main(String[] args) {
        String path = System.getProperty("java.class.path");
        System.out.println("class path:"+path);
    }
}
