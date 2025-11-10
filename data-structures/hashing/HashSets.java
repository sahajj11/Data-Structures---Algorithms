package hashing;
import java.util.*;

public class HashSets {
    public static void main(String[] args) {

        HashSet<Integer>set=new HashSet<>();

        // add element
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(set);

        // search  - contains
        if(set.contains(3)){
            System.out.println("set contains element 3");
        }else{
            System.out.println("element 3 is not present");
        }

        // delete
        set.remove(3);

        // size
        int size=set.size();
        System.out.println(size);

        // iterator
        Iterator it=set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        
        
    }
}
