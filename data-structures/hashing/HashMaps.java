package hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {

        HashMap<String,Integer>map=new HashMap<>();

        System.out.println();

        //insertion
        map.put("India",30);
        map.put("USA",40);
        System.out.println(map);

        //serach
        if(map.containsKey("India")){
            System.out.println("key is present in the map.");
        }else{
            System.out.println("key is not present in the map.");
        }

        // to get value
        System.out.println(map.get("India"));  //key exists prints the value
        System.out.println(map.get("China"));  //key is not present will prints null

        // iteration in HashMap
        for(Map.Entry<String,Integer>e:map.entrySet()){
            System.out.print(e.getKey() +  "->" +  e.getValue() + " ");
        }

        // deletion of a pair
        map.remove("USA");
    }
}
