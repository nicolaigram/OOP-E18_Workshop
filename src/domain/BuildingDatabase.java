package domain;

import java.util.ArrayList;
import java.util.UUID;

public class BuildingDatabase {

    private ArrayList<Building> buildings;

    public BuildingDatabase() {
        buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public void removeBuilding(Building building) {
        buildings.remove(building);
    }

    public Building getBuilding(UUID id) {
        for (Building building : buildings) {
            if (building.getId() == id) {
                return building;
            }
        }
        return null;
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }
    
    
}
