package lesson6;

public class Liner extends Ship implements Distance{

    private String colour;

    public Liner(String name, double speed, double time) {
        super(name, speed, time);
    }

    public Liner(String name, double speed, double time, String colour) {
        super(name, speed, time);
        this.colour = colour;
    }
    public void handleData(){
        double distance = calcDistans(getTime(),getSpeed());
        System.out.println("Distance traveled: " + distance + " km/h");
    }

    @Override
    void changeSpeed() {
        System.out.println("With speed " + getSpeed() + (" km/h"));
    }

    @Override
    public double calcDistans(double time, double speed) {
        return getTime() * getSpeed();
    }
}
