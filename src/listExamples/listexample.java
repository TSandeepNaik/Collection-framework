package listExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class listexample {
    public static void main(String[] args) {
        //define the arraylist
        // here if u dont define the data type we can store any data type like int string etc
        List<Integer> list1 = new ArrayList<>();

        //adding or inserting data
        list1.add(12);
        list1.add(22);
        list1.add(22);
        list1.add(32);
        list1.add(42);
        System.out.println("list is :"+list1);

        // remove the data
        list1.remove(3); // 3rd index will delete
        System.out.println("list after removing 3rd index "+list1);

// to search the element
        System.out.println(list1.get(3));

        Collections.sort(list1);

        // traverse in the list
        for(Integer li : list1){
            System.out.println(li);
        }

        //we can also create list of list
        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(list1);

        for(List ll : list2){
            System.out.println(ll);
        }
    }
}
