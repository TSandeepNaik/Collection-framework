package Map;

//hashmap should have unique keys, if we use same key then it will update the previous value to new value
//key allows the null value
//duplicate values are allowed
// it is an unordered type



import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "banana");
        map.put(2, "grapes");
        map.put(3, "apple");
        map.put(4, "guava");
        map.put(1, "watermelon");
        map.put(6, "apple");

        System.out.println("map is :"+map);
        System.out.println("value at the key "+map.get(3));
        // find size
        System.out.println("size is :"+map.size());
        //to remove
        System.out.println("after remove "+map.remove(1));

        System.out.println("final map is :"+ map);

        //traversal in map
        for(Map.Entry m1 : map.entrySet()){
            System.out.println(m1.getKey()+"-----------------------"+m1.getValue());
        }
    }
}
