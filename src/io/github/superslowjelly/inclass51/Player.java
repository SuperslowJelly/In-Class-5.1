package io.github.superslowjelly.inclass51;

public class Player {

    private final String NAME;

    private double x, y, z;

    public Player(String name) {
        this.NAME = name;
    }

    public String getName() {
        return this.NAME;
    }

    public String getLocation() {
        return this.x + "x, " + this.y + "y, " + this.z + "z";
    }

    public void setLocation(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Check if given co-ordinates lie between a range of 5 either way from the given co-ordinates.
    public boolean isNearby(double x, double y, double z) {
        return (this.x <= (x + 5) && this.x >= (x - 5)) &&
                (this.y <= (y + 5) && this.y >= (y - 5)) &&
                (this.z <= (z + 5) && this.z >= (z - 5));
    }

}
