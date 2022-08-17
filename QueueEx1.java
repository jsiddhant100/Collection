import java.util.*;  
public class QueueEx1{  
public static void main(String[] args) {  
Deque<Integer> deque = new ArrayDeque<Integer>();  
deque.add(10);  
deque.add(20);  
deque.add(30);
deque.add(40);  
deque.add(50);
System.out.println("Elements in Queue:"+deque);  
System.out.println("1st Element removed from the queue: "+deque.removeLast());
System.out.println("2nd Element removed from the queue: "+deque.removeLast());
System.out.println("existing elements :"+deque);
}
}
