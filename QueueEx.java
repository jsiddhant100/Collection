import java.util.*;
public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<Integer>();
        //Add elements to the Queue
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        System.out.println("Elements in Queue:"+q1);
        System.out.println("1st Element removed from the queue: "+q1.remove());
         System.out.println("2nd Element removed from the queue: "+q1.remove());
         System.out.println("existing elements :"+q1);
    }
}
