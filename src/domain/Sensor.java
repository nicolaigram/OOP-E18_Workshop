package domain;

import java.util.UUID;

public abstract class Sensor {

    private UUID id;
    private double value;

    public Sensor() {
        this.id = UUID.randomUUID();
        this.value = 0;
    }

    public double getValue() {
        setRandomValue();
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public UUID getId() {
        return id;
    }
    
    abstract void setRandomValue();
}
