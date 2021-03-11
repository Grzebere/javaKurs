package javaAdvanced.zadaniaZGita.autostrada;

import java.time.LocalDateTime;

public class VehicleInfo {
    private String plate;
    private CarType carType;
    private LocalDateTime dateOfEntering;

    public VehicleInfo(String plate, CarType carType) {
        this.plate = plate;
        this.carType = carType;
        dateOfEntering = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "VehicleInfo{" +
                "plate='" + plate + '\'' +
                ", carType=" + carType +
                ", dateOfEntering=" + dateOfEntering +
                '}';
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public LocalDateTime getDateOfEntering() {
        return dateOfEntering;
    }

    public void setDateOfEntering(LocalDateTime dateOfEntering) {
        this.dateOfEntering = dateOfEntering;
    }
}
