package lesson11;

import java.util.Iterator;

public class App {

    public static void main(String[] args) {

        LinkedContainer <String>  nums  = new LinkedContainer<>();

        nums.add("one");
        nums.add("two");
        nums.add("three");
        nums.add("four");
        nums.add("five");

        System.out.println("size: " + nums.size());
        System.out.println("collection is empty: " + nums.isEmpty());
        System.out.println("what element is under for index <2>: "+ nums.get(2));
        nums.set(0,"eight");
        System.out.println("are the more elements in list: "+nums.iterator().hasNext());
        nums.add(0,"forty");
        System.out.println("which index element <three>: " + nums.indexOf("three"));
        System.out.println("there is an element <five>: " + nums.contains("five"));
        System.out.println("\n" + "iterator from the beginning of the list");
        for (String s : nums){
            System.out.println(s);
        }
        System.out.println("\n" + "iterator from the end of the list");
        Iterator iterator = nums.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
