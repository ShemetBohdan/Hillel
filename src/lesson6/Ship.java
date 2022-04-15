package lesson6;

public class Ship extends Transport{

    private String name;
    private double speed; //km/h
    private double time; //h

    public Ship(String name, double speed, double time) {
        this.name = name;
        this.speed = speed;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @Override
    void run() {
        System.out.println("Boat goes is moving in the water");
    }
}
