package gr.aueb.cf.cf9.ch17.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> bag = new HashSet<>();

        //add-no duplicates
        bag.add("apple");
        bag.add("banan");
        bag.add("orange");
        bag.add("apple");    // no duplicates allowed


        //Time-complexity O(1)

        if(bag.contains("apple")) {  // override equals && hashCode
            bag.remove("apple");
        }else{
            System.out.println("Apple not included in the bag");
        }
        bag.removeIf(item -> item.startsWith("b"));
        bag.forEach(System.out::println);
    }
}
