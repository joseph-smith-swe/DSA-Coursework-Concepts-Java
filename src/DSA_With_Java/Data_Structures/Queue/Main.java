package DSA_With_Java.Data_Structures.Queue;

public class Main {

    public static void main(String[] args) {
        System.out.println("////////////////Queue- Functionality Test//////////");
        Queue myQueue = new Queue(7);
        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();

        System.out.println("////////////////myQueue1 - enqueue()////////////////");
        Queue myQueue1 = new Queue(1);
        myQueue1.printQueue();
        System.out.println("////////////////myQueue1 - enqueue() invoked////////////////");
        myQueue1.enqueue(2);
        myQueue1.printQueue();

        System.out.println("////////////////myQueue2 - dequeue()////////////////");
        Queue myQueue2 = new Queue(2);
        myQueue2.enqueue(1);
        myQueue2.printQueue();

        System.out.println("////////////////myQueue2 - dequeue() invoked////////////////");
        //(2) Items -Returns 2 Node
        System.out.println(myQueue2.dequeue().value);
        //(1) Items -Returns 1 Node
        System.out.println(myQueue2.dequeue().value);
        //(0) Items -Returns null
        System.out.println(myQueue2.dequeue());
    }
}
