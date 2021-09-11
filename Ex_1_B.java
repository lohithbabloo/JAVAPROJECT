/*
Write a java program that display the roots of a quadratic equation ax2+bx+c=0.Calculate the discriminant 
D and basing on value of D,describe the nature of roots
*/
import java.util.Scanner;

public class Ex_1_B{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        System.out.println("enter the value of c:");
        int c = sc.nextInt();
        double d = b*b -(4*a*c);
        double r1 = ((-b)+Math.pow(d, 0.5))/(2*a);
        double r2 = ((-b)-Math.pow(d, 0.5))/(2*a);
        if(d>0){
            System.out.println("roots are real and distinct:"+r1+r2);
        }
        if(d==0){
            System.out.println("roots are equal:"+r1+r2);
        }
        if(d<0){
            System.out.println("roots are imaginary:"+r1+r2);
        }
        sc.close();
    }
}