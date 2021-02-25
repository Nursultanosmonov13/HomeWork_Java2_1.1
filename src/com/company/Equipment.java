package com.company;

public class Equipment {
    private String interiorMaterial;    //Салон
    private String TransmissionBox;     //Коробка
    private String DriveUnit;           //Привод

    public Equipment(String interiorMaterial, String transmissionBox, String driveUnit) {
        this.interiorMaterial = interiorMaterial;
        TransmissionBox = transmissionBox;
        DriveUnit = driveUnit;
    }

    public String getInteriorMaterial() {
        return interiorMaterial;
    }

    public String getTransmissionBox() {
        return TransmissionBox;
    }

    public String getDriveUnit() {
        return DriveUnit;
    }

}
