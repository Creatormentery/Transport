package com.transport;

public abstract class Transport {
    String nameOfVehicle;
    String vehicle;
    String environmentOfMovement;
    String purposeOfTransport;
    int byNumberOfWheel;

    public Transport(String nameOfVehicle, String vehicle, String environmentOfMovement, String purposeOfTransport, int byNumberOfWheel) {
        this.nameOfVehicle = nameOfVehicle;
        this.vehicle = vehicle;
        this.environmentOfMovement = environmentOfMovement;
        this.purposeOfTransport = purposeOfTransport;
        this.byNumberOfWheel = byNumberOfWheel;
    }

    public abstract void move();
}
