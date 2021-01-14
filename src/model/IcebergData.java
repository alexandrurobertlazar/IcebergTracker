package model;

import java.time.LocalDate;

public class IcebergData {
    private final LocalDate date;
    private final Iceberg iceberg;
    private final Location location;
    private final double volume;

    public IcebergData(LocalDate date, Iceberg iceberg, Location location, double volume) {
        this.date = date;
        this.iceberg = iceberg;
        this.location = location;
        this.volume = volume;
    }

    public LocalDate getDate() {
        return date;
    }

    public Iceberg getIceberg() {
        return iceberg;
    }

    public Location getLocation() {
        return location;
    }

    public double getVolume() {
        return volume;
    }
    
    @Override
    public String toString() {
        return "Iceberg con id: " + this.iceberg.getId() + ", a fecha de: " + this.getDate() + ", tiene volumen: " + this.volume + ", y coordenadas: " + this.location.toString();
    }
    
}
