package domain;

import java.util.UUID;

public class Actuator {

    private UUID id;
    private double value;
    
    public Actuator(double value) {
        this.value = value;
        this.id = UUID.randomUUID();
    }
    
    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public UUID getId() {
        return id;
    }
}
