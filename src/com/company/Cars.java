package com.company;

public abstract class Cars {
    private Color color;                //Цвет
    private int yearOfIssue;            //Год выпуска
    private Equipment equipment;        //комплектация
    private int engineVolume;           //Объем двигателя
    private String carBodyType;         //тип кузова автомобиля

    public Cars(Color color, int yearOfIssue, Equipment equipment, int engineVolume, String carBodyType) {
        this.color = color;
        this.yearOfIssue = yearOfIssue;
        this.equipment = equipment;
        this.engineVolume = engineVolume;
        this.carBodyType = carBodyType;
    }

    public Color getColor() {
        return color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public int getEngineVolume() {
        return engineVolume;
    }

    public String getCarBodyType() {
        return carBodyType;
    }
}
