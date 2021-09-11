/*
Write a program illustrating daemon threads
*/
class samplethread extends Thread
{
    public void run()
    {
        if(this.isDaemon())
        {
            System.out.println("this is daemon thread");
        }else{
            System.out.println("this is'nt a daemon thread");
        }
    }
}

public class Ex_10_C {
    public static void main(String[] args) {
        samplethread t1 = new samplethread();
        samplethread t2 = new samplethread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
    }
}
