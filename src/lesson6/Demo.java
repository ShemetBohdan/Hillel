package lesson6;

public class Demo {

    static Directs dir;

    public static void main(String[] args) {

        Liner liner= new Liner("Aurora",40,200,"white");
        Honda honda =  new Honda("Honda Silvia",200,3);

        liner.run();
        liner.changeSpeed();
        liner.handleData();
        dir =Directs.WEST;
        System.out.println(dir.getDirection());

        System.out.println();

        honda.run();
        honda.changeSpeed();
        honda.showResult();
        dir =Directs.NORTH;
        System.out.println(dir.getDirection());
    }
}
