import java.util.*;
  
class ArraylistEx {
    
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        for (int i = 0; i < list1.size(); i++) 
            System.out.print(list1.get(i) + " "); 
    }
}
