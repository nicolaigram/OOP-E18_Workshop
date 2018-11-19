package domain;

public class TemperatureSensor extends Sensor {

    public void setRandomValue() {
        this.setValue(Math.random() * 10 + 15);
    }
}
