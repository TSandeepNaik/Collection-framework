package Sets;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set1 = new TreeSet<>();
        //adding
        set1.add("sandy");
        // set1.add(null);
        set1.add("banana");
        set1.add("mango");
        System.out.println("set1 is "+set1);

        //remove
        set1.remove("banana");
        System.out.println("after remove "+set1);

        //sorting will not work
        //size
        System.out.println("set1 sizr is :"+set1.size());

        //traversing
        for(String l1 : set1){
            System.out.println(l1);
        }

    }
}
