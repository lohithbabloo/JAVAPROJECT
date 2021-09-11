/* Five bikers compete in a race such that they drive in a constant speed which may or maynot
have the same speed as the other.To qualify the race,the speed of a racer must be greater than the average 
of the 5 racers.Take as input the speed of each racer and print back the soeed of qualifying racers */

// import java.util.Scanner;

// public class Ex_1_C {
//     public static void main(String[] args) {
//         int speeds[] = new int[5];
//         int average = 0;
//         Scanner sc = new Scanner(System.in);
//         for(int i=0;i<5;i++)
//         {
//             System.out.println("enter the speed of "+(i+1)+" player");
//             int speed = sc.nextInt();
//             speeds[i] = speed;
//             average = average+speeds[i];
//         }
//         average = average/speeds.length;
//         System.out.println("the average speed is:"+average);
//         for(int i=0;i<5;i++)
//         {
//             if(speeds[i]>average)
//             {
//                 System.out.println("Players to be qualify:"+(i+1));
//             }
//         }
//         sc.close();
//     }
    
// }
