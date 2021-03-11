package javaAdvanced.zadaniaZGita.autostrada;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class Highway {
    Map<String, VehicleInfo> vehicles;


    public Highway() {
        this.vehicles = new HashMap<>();
    }

    public void vehicleEntry(String vehiclePlates, CarType type) {
        if (!vehicles.containsKey(vehiclePlates)) {
            vehicles.put(vehiclePlates, new VehicleInfo(vehiclePlates, type));
            System.out.println("The " + type + " " + vehiclePlates + " has entered the highway");
        } else {
            System.out.println("Vehicle with this plate number is already on the highway");
        }
    }

    public void searchVehicle(String vehiclePlates){
        if(vehicles.containsKey(vehiclePlates)){
            System.out.println(vehicles.get(vehiclePlates).toString());
        } else {
            throw new NoVehicleWithSuchPlateNumbers();
        }

    }

    public void vehicleLeave(String vehiclePlates) {
        double tempHours = Duration.between(vehicles.get(vehiclePlates).getDateOfEntering(), LocalDateTime.now()).toSeconds();
        switch (vehicles.get(vehiclePlates).getCarType()) {
            case CAR:
                System.out.println("You need to pay: " + ((int) tempHours * 0.02));
                break;
            case TRUCK:
                System.out.println("You need to pay: " + ((int) tempHours * 0.03));
                break;
            case MOTORCYCLE:
                System.out.println("You need to pay: " + ((int) tempHours * 0.01));
                break;
            default:
                System.out.println("Unknown car type");
        }
        vehicles.remove(vehiclePlates);

    }


}
