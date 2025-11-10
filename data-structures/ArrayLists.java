import java.util.*;

public class ArrayLists{
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();

        //add element
        list.add(0);
        list.add(3);
        list.add(6);

        System.out.println(list);

        // get element
        int el=list.get(0);
        System.out.println(el);

        // add elemnt in btwn
        list.add(0,5);
        System.out.println(list);

        // set element
        list.set(0,4);

        //delete elemnt
        list.remove(0);

        //size 
        int size=list.size();
        System.out.println(size);

        // loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        // sorting 
        Collections.sort(list);
        System.out.println(list);

    }
}
