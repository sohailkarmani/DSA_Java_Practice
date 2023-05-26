class Queue {   
      
    private static int front, rear, capacity;   
    private static int queue[];   
     
    Queue(int size) {   
        front = rear = 0;   
        capacity = size;   
        queue = new int[capacity];   
    }   
     
    // insert an element into the queue  
    static void queueEnqueue(int item)  {   
        // check if the queue is full  
        if (capacity == rear) {   
            System.out.printf("\nQueue is full\n");   
            return;   
        }   
     
        // insert element at the rear   
        else {   
            queue[rear] = item;   
            rear++;   
        }   
        return;   
    }   
     
    //remove an element from the queue  
    static void queueDequeue()  {   
        // check if queue is empty   
        if (front == rear) {   
            System.out.printf("\nQueue is empty\n");   
            return;   
        }   
     
        // shift elements to the right by one place uptil rear   
        else {   
            for (int i = 0; i < rear - 1; i++) {   
                queue[i] = queue[i + 1];   
            }   
     
         
      // set queue[rear] to 0  
            if (rear < capacity)   
                queue[rear] = 0;   
     
            // decrement rear   
            rear--;   
        }   
        return;   
    }   
     
    // print queue elements   
    static void queueDisplay()   
    {   
        int i;   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
     
        // traverse front to rear and print elements   
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;   
    }   
     
    // print front of queue   
    static void queueFront()   
    {   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        System.out.printf("\nFront Element of the queue: %d", queue[front]);   
        return;   
    }   
}   
   
public class QueueArrayImplementation {  
    public static void main(String[] args) {   
        // Create a queue of capacity 4   
        Queue q = new Queue(4);   
     
        System.out.println("Initial Queue:");  
       // print Queue elements   
        q.queueDisplay();   
     
        // inserting elements in the queue   
        q.queueEnqueue(10);   
        q.queueEnqueue(30);   
        q.queueEnqueue(50);   
        q.queueEnqueue(70);   
     
        // print Queue elements   
        System.out.println("Queue after Enqueue Operation:");  
        q.queueDisplay();   
     
        // print front of the queue   
        q.queueFront();   
           
        // insert element in the queue   
        q.queueEnqueue(90);   
     
        // print Queue elements   
        q.queueDisplay();   
     
        q.queueDequeue();   
        q.queueDequeue();   
        System.out.printf("\nQueue after two dequeue operations:");   
     
        // print Queue elements   
        q.queueDisplay();   
     
        // print front of the queue   
        q.queueFront();   
    }   
}  
Output:

Initial Queue:
Queue is Empty
Queue after Enqueue Operation:
 10 ,  30 ,  50 ,  70 , 
Front Element of the queue: 10
Queue is full
 10 ,  30 ,  50 ,  70 , 
Queue after two dequeue operations: 50 ,  70 , 
Front Element of the queue: 50
Java Queue Linked List Implementation
As we have implemented the Queue data structure using Arrays in the above program, we can also implement the Queue using Linked List.

We will implement the same methods enqueue, dequeue, front, and display in this program. The difference is that we will be using the Linked List data structure instead of Array.

The below program demonstrates the Linked List implementation of Queue in Java.

QueueLLImplementation.java

class LinkedListQueue  
{  
 private Node front, rear;  
 private int queueSize; // queue size  
    
 //linked list node  
 private class Node {  
 int data;  
 Node next;  
 }  
 //default constructor - initially front & rear are null; size=0; queue is empty  
 public LinkedListQueue()  
 {  
 front = null;  
 rear = null;  
 queueSize = 0;  
 }  
//check if the queue is empty  
 public boolean isEmpty()  
 {  
 return (queueSize == 0);  
 }    
 //Remove item from the front of the queue.  
 public int dequeue()  
 {  
 int data = front.data;  
 front = front.next;  
 if (isEmpty())  
 {  
 rear = null;  
 }  
 queueSize--;  
 System.out.println("Element " + data+ " removed from the queue");  
 return data;  
 }  
 //Add data at the rear of the queue.  
 public void enqueue(int data)  
 {  
 Node oldRear = rear;  
 rear = new Node();  
 rear.data = data;  
 rear.next = null;  
 if (isEmpty())  
 {  
 front = rear;  
 }  
 else  {  
 oldRear.next = rear;  
 }  
 queueSize++;  
 System.out.println("Element " + data+ " added to the queue");  
 }  
 //print front and rear of the queue  
 public void print_frontRear() {  
     System.out.println("Front of the queue:" + front.data  
     + " Rear of the queue:" + rear.data);  
 }  
}  
class QueueLLImplementation{  
 public static void main(String a[]){  
 LinkedListQueue queue = new LinkedListQueue();  
 queue.enqueue(6);  
 queue.enqueue(3);  
 queue.print_frontRear();  
 queue.enqueue(12);  
 queue.enqueue(24);  
 queue.dequeue();  
 queue.dequeue();  
 queue.enqueue(9);   
 queue.print_frontRear();  
 }  
}  
