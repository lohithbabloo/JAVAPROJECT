// import java.util.LinkedList;
// /*
// Write a java program producure consumer problem
// */
// public class Ex_11_A {
//     public static void main(String[] args) throws InterruptedException{
//         final producerconsumer pc = new producerconsumer();
//         Thread producerthread = new Thread(new Runnable(){
//             public void run(){
//                 try{
//                     pc.produce();
//                 }catch(Exception e){
//                     e.printStackTrace();
//                 }
//             }
//         });
//         Thread consumerthread = new Thread(new Runnable(){
//             public void run(){
//                 try{
//                     pc.consume();
//                 }catch(Exception e)
//                 {
//                     e.printStackTrace();    
//                 }
//             }
//         });
//         producerthread.start();
//         consumerthread.start();
//         producerthread.join();
//         consumerthread.join();
//     }
//     public static class producerconsumer
//         {
//             LinkedList<Integer>list = new LinkedList<>();
//             int capacity = 2;
//             public void produce() throws InterruptedException{
//                 int value = 0;
//                 while(true)
//                 {
//                     synchronized(this)
//                     {
//                         while(list.size() == capacity){
//                             wait();
//                         }
//                         list.add(value++);
//                         System.out.println("producer produced:"+value);
//                         notify();
//                         Thread.sleep(1000);
//                     }
//                 }
//             }   
//             public void consume() throws InterruptedException {
//                 while(true)
//                 {
//                     synchronized(this)
//                     {
//                         while(list.isEmpty())
//                         {
//                             wait();
//                         }
//                         int consumed = list.removeFirst();
//                         System.out.println("consumed consumed"+consumed);
//                         notify();
//                         Thread.sleep(1000);
//                     }
//                 }
                
//             }
//         }
// }
import java.util.LinkedList;

public class Ex_11_A {
    public static void main(String[] args) throws InterruptedException {
        // This object contains produce() and consume() methods
        ProducerConsumer pc = new ProducerConsumer();

        // Create a thread for producer
        Thread producerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create a thread for consumer
        Thread consumerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start threads
        producerThread.start();
        consumerThread.start();

        // Wait for threads to complete
        producerThread.join();
        consumerThread.join();
    }
}

class ProducerConsumer {
    // Create a common list shared by both producer and consumer
    LinkedList<Integer> list = new LinkedList<>();

    // int capacity of the list
    int capacity = 2;

    // function called by producer thread
    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                // if the list is at capacity, wait
                while (list.size() == capacity)
                    wait();

                // Add a new value to the list
                list.add(value++);
                System.out.println("Producer produced : " + value);

                // Notify the consumer
                notify();

                // sleep for 1 second to simulate the time taken by producer
                Thread.sleep(1000);
            }
        }
    }

    // function called by consumer thread
    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                // if the list is empty, wait
                while (list.isEmpty())
                    wait();
                int consumed = list.removeFirst();
                System.out.println("Consumer consumed : " + consumed);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
