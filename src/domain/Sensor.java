package domain;

import java.util.UUID;

public abstract class Sensor {

    private UUID id;
    private double value;

    public Sensor(double value) {
        this.id = UUID.randomUUID();
        this.value = value;
    }

    public double getValue() {
        return value;
    }

}
