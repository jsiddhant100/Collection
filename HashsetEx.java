import java.util.*;
  
class HashsetEx {
    
    public static void main(String[] args)
    {
        HashSet<ArrayList> set = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list2.add(3);
        list2.add(4);
        set.add(list1);
        set.add(list2);
        System.out.println(set.size());
         Iterator<ArrayList> i=set.iterator();  
           while(i.hasNext())  
           {  
           System.out.println(i.next());  
           } 
    }
}
