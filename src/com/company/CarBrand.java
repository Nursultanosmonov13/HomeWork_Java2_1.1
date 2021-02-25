package com.company;

public class CarBrand extends Cars{
    private String brandName;
    private AutoProduction autoProduction;

    public CarBrand(String brandName, Color color, int yearOfIssue, Equipment equipment, int engineVolume, String carBodyType,  AutoProduction autoProduction) {
        super(color, yearOfIssue, equipment, engineVolume, carBodyType);
        this.brandName = brandName;
        this.autoProduction = autoProduction;
    }

    public String getBrandName() {
        return brandName;
    }

    public AutoProduction getAutoProduction() {
        return autoProduction;
    }

    public void signalAuto(String voice, int signalAmount){
        for (int i = 0; i < signalAmount; i++) {
            if (signalAmount < 5){
                System.out.println("voice");
            } else{
                System.out.println(voice);
            }
        }
    }
    private void signalAuto( int signalAmount,String voice){
        for (int i = 0; i < signalAmount; i++) {
                System.out.println(voice);
        }
    }
    public  void signalAuto(String voice){
            System.out.println(voice);
    }
    public String infoCar(){
        return "Марка = "+ getBrandName()+ "\nЦвет = " + getColor() +
                "\nКомплектатция = " + getEquipment().getDriveUnit()+", "+ getEquipment().getInteriorMaterial()+", "+getEquipment().getTransmissionBox()
                    + "\nОбъем двигателя = " + getEngineVolume() + "\nТип кузова = " + getCarBodyType() + "\nПроизводство = " + getAutoProduction().getCountry()+", "+ getAutoProduction().getCompanyName()+", "+getAutoProduction().getAddress()+", "+getAutoProduction().getNumber();
    }

}
