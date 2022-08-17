import java.util.*;
  
class HashsetEx {
    
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(1);
        set.add(5);
        System.out.println(set.size());
         Iterator<Integer> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           } 
    }
}
