package domain;

public class CO2Sensor extends Sensor {

    public void setRandomValue() {
        this.setValue(Math.random() * 650 + 350);
    }
    
}
