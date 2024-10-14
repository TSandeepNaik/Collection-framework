package listExamples;

import java.util.LinkedList;
import java.util.List;

public class Linkedlistexple {
    public static void main(String[] args) {
        //define the arraylist
        // here if u dont define the data type we can store any data type like int string etc
        List<Integer> list1 = new LinkedList<>();

        //adding or inserting data
        list1.add(12);
        list1.add(22);
        list1.add(22);
        list1.add(32);
        list1.add(42);
        //  list1.add(null);
        System.out.println("list is :" + list1);

        // remove the data
        list1.remove(3); // 3rd index will delete
        System.out.println("list after removing 3rd index " + list1);


        //sorting and iteration will be same for linked list as arraylist
    }
}
