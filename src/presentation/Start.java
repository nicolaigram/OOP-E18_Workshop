package presentation;

import domain.Actuator;
import domain.Building;
import domain.BuildingDatabase;
import domain.CO2Sensor;
import domain.Sensor;
import domain.TemperatureSensor;
import java.util.ArrayList;
import java.util.UUID;

public class Start {
    public static void main(String[] args) {
        BuildingDatabase bd = new BuildingDatabase();
        
        Building b1 = new Building("Building A", "Herning");
        b1.addSensor(new TemperatureSensor());
        b1.addSensor(new CO2Sensor());
        b1.addActuator(new Actuator(0.55));
        bd.addBuilding(b1);
        
        bd.addBuilding(new Building("Building B", "Odense"));
        bd.addBuilding(new Building("Building C", "Slagelse"));
        
        bd.addBuilding(new Building("Remove This Building", "Nowhere"));
        bd.removeBuilding(bd.getBuildings().remove(3));
        
        /* PRINT ALL BUILDINGS */
        System.out.println("Printing all buildings: ");
        for (Building b : bd.getBuildings()) {
            System.out.printf("%s, %s (%s)%n", b.getName(), b.getLocation(), b.getId());
        }
        
        /* PRINT ALL SENSOR VALUES FOR BUILDING 1 */
        UUID firstBuildingId = bd.getBuildings().get(0).getId();
        ArrayList<Sensor> sensors = bd.getBuilding(firstBuildingId).getSensors();
        System.out.println("\nPrinting all sensor values: ");
        for (Sensor sensor : sensors) {
            System.out.printf("%.2f (%s) %s%n", sensor.getValue(), sensor.getId(), sensor.getClass());
        }
        
        System.out.println("\nPrinting all sensor values again: ");
        for (Sensor sensor : sensors) {
            System.out.printf("%.2f (%s) %s%n", sensor.getValue(), sensor.getId(), sensor.getClass());
        }
        
        /* PRINT ALL SENSOR VALUES FOR BUILDING 1 */
        ArrayList<Actuator> actuators = bd.getBuilding(firstBuildingId).getActuators();
        System.out.println("\nPrinting all actuator values: ");
        for (Actuator actuator : actuators) {
            System.out.printf("%.2f (%s) %s%n", actuator.getValue(), actuator.getId(), actuator.getClass());
        }
        
        
    }
}
