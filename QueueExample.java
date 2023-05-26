
import java.util.LinkedList;  
import java.util.Queue;  
public class QueueExample {  
    public static void main(String[] args) {  
        Queue<Integer> myQueue = new LinkedList<>();  
        // enqueue operation  
        myQueue.offer(10);  
        myQueue.offer(20);  
        myQueue.offer(30);  
        // dequeue operation  
        int removedElement = myQueue.poll();  
        System.out.println("Removed Element: " + removedElement);  
        // peek operation  
        int peekedElement = myQueue.peek();  
        System.out.println("Peeked Element: " + peekedElement);  
        // size operation  
        int size = myQueue.size();  
        System.out.println("Size of Queue: " + size);  
        // empty operation  
        boolean isEmpty = myQueue.isEmpty();  
        System.out.println("Is Queue Empty: " + isEmpty);  
        // search operation  
        int index = myQueue.indexOf(20);  
        System.out.println("Index of Element 20: " + index);  
    }  
}  
