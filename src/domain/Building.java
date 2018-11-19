package domain;

import java.util.ArrayList;
import java.util.UUID;

public class Building {
    private UUID id;
    private String name;
    private String location;
    private ArrayList<Sensor> sensors;
    private ArrayList<Actuator> actuators;

    public Building(String name, String location) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.location = location;
        sensors = new ArrayList<>();
        actuators = new ArrayList<>();
    }
    
    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }
    
    public void addActuator(Actuator actuator) {
        actuators.add(actuator);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public ArrayList<Actuator> getActuators() {
        return actuators;
    }
    
    
    
    
    
}
