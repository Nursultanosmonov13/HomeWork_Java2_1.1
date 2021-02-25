package com.company;

import java.util.Random;

public final class CarModel extends CarBrand {
    private String modelName;
    private int signal = random();

    public CarModel(String brandName, String modelName, Color color, int yearOfIssue, Equipment equipment, int engineVolume, String carBodyType, AutoProduction autoProduction) {
        super(brandName, color, yearOfIssue, equipment, engineVolume, carBodyType, autoProduction);
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }
    private int random() {
        Random random = new Random();
        int x = random.nextInt(5) + 1;
        return x;
    }
    @Override
    public void signalAuto(String voice) {
        //super.signalAuto(signalAmount, voice);
        for (int i = 0; i < signal; i++) {
            System.out.println(voice);
        }
    }



    @Override
    public String infoCar() {
        return super.infoCar() + "\nМодел = " + getModelName();
    }
}
