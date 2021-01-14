package model;

import java.time.LocalDate;

public class Iceberg {
    private final Location origin;
    private final LocalDate dateCreated;
    private final int id;

    public Iceberg(Location origin, LocalDate dateCreated, int id) {
        this.origin = origin;
        this.dateCreated = dateCreated;
        this.id = id;
    }

    public Location getOrigin() {
        return origin;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }
    
    @Override
    public String toString() {
        return "Iceberg con id: " + this.id + ", se origina en " + this.origin + " a fecha de " + this.dateCreated;
    }
}
