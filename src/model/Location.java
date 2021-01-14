package model;

public class Location {
    private final int[] coords;
    private final String[] coordHemispheres;
    public Location(int[] coords, String[] coordHemispheres) {
        this.coords = coords;
        this.coordHemispheres = coordHemispheres;
    }

    public int[] getCoords() {
        return coords;
    }

    @Override
    public String toString() {
        return this.coords[0] + " " + this.coordHemispheres[0] + " " + this.coords[1] + " " + this.coordHemispheres[1];
    }
    
}
