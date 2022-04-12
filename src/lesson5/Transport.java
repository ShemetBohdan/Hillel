package lesson5;

public class Transport {

    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showName(){
        System.out.println("Name transport: " + name);
    }
}
