/**
Write a java program that creates threads by extending thread class.First thread display "Good Morning"every 
1 sec, the second thread displays "Hello"every 2 seconds and the third displays "Welcome" every 3 seconds,
repeat the sameby implementing Runnable.
*/
public class Ex_10_A {
public static void main(String[] args) {
    Thread T1 = new Thread(new Runnable(){
        public void run()
        {
            for(int i = 0;i<10;i++)
            {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    });
    Thread T2 = new Thread(new Runnable(){
        public void run()
        {
            for(int i = 0;i<10;i++)
            {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    });
    Thread T3 = new Thread(new Runnable(){
        public void run(){
            for(int i = 0;i<10;i++)
            {
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    });
    T1.start();
    T2.start();
    T3.start();
} 
}
