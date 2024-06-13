package DSA_With_Java.Data_Structures.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.println("////////////////DSA_With_Java.Data_Structures.Queue-Test//////////");
        Queue myQueue = new Queue(7);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();

        System.out.println("////////////////myQueue1////////////////");
        Queue myQueue1 = new Queue(1);
        myQueue1.printQueue();
        System.out.println("////////////////myQueue1////////////////");
        myQueue1.enqueue(2);
        myQueue1.printQueue();

    }
}
