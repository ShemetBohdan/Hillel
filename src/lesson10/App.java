package lesson10;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Ship> ships = new ArrayList<>();

        Ship barge = new Ship("barge");
        Ship dredger = new Ship("dredger");
        Ship dugout = new Ship("dugout");
        Ship galley = new Ship("galley");
        Ship gondola = new Ship("gondola");
        Ship hovercraft = new Ship("hovercraft");
        Ship icebreaker = new Ship("icebreaker");

        ships.add(barge);
        ships.add(dredger);
        ships.add(dugout);
        ships.add(galley);
        ships.add(gondola);
        ships.add(hovercraft);
        ships.add(icebreaker);

        System.out.println("show collection: "+ ships);

        System.out.println("\n"+ "size: " + ships.size());
        System.out.println("collection is empty: " + ships.isEmpty());
        System.out.println("collection contains element: " + ships.contains(gondola));
        System.out.println( "which index element <galley>: " + ships.indexOf(galley));
        ships.remove(dugout);
        System.out.println("\n"+"delete element <dugout> and show collection:" + ships);

        Ship tanker = new Ship("tanker");

        System.out.println(" We added an element instead of : " + ships.set(2,tanker));
        System.out.println("\n"+ships);
        System.out.println("Show elements from 1 to 3: "+ ships.subList(1,3));

        List <Ship> submarines = new ArrayList<>();

        Ship holland  = new Ship("holland");
        Ship nautilus  = new Ship("nautilus");
        Ship rainbow  = new Ship("rainbow");

        submarines.add(holland);
        submarines.add(nautilus);
        submarines.add(rainbow);
        submarines.addAll(0,ships);
        System.out.println("\n"+ submarines);
        System.out.println("\n"+"show the name of the element at index five: " + submarines.get(5));
        submarines.clear();
        System.out.println(submarines);
    }
}
