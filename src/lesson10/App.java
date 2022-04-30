package lesson10;

public class App  {

    public static void main(String[] args) {

        ArrayL<Integer> arrayL = new ArrayL<>();

        arrayL.add(10);
        arrayL.add(20);
        arrayL.add(30);
        arrayL.add(10);
        arrayL.add(20);

        System.out.println("size: " + arrayL.size());
        System.out.println("collection is empty: " + arrayL.isEmpty());
        System.out.println("what element is under for index <2>: "+ arrayL.get(2));
        System.out.println(arrayL);
        arrayL.remove(2);
        System.out.println(arrayL);
        arrayL.set(0,11);
        System.out.println(arrayL);
        System.out.println(arrayL.iterator().hasNext());
        arrayL.add(0,15);
        System.out.println(arrayL);
        System.out.println("which index element <20>: " + arrayL.indexOf(20));
        System.out.println("which index element <20>: " + arrayL.lastIndexOf(20));
    }
}
