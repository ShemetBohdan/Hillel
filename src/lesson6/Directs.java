package lesson6;

enum Directs {

    EAST ("Heading east"),
    WEST ("Heading west"),
    NORTH ("Heading north"),
    SOUTH ("Heading south");

    private final String direction;

    Directs(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return this.direction;
    }

}
