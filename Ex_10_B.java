/*
Write a program illustrating isAlive and join ()
*/
class thread extends Thread
{
    String name;
    thread(String name)
    {
        this.name = name;
    }
    public  void run(){
        System.out.println(name+"status:"+this.isAlive());
        for(int i = 0;i<=3;i++)
        {
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}


public class Ex_10_B extends Thread{
    public static void main(String[] args) {
        thread t1 = new thread("T1");
        thread t2 = new thread("T2");
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }t2.start();
        try{
            t2.join(3000);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println(t1.name+"thread status:"+t1.isAlive());
        System.out.println(t2.name+"thread status:"+t2.isAlive());
    }
    

    
}
