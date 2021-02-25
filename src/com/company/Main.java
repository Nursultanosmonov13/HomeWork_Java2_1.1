package com.company;

public class Main {

    public static void main(String[] args) {
        CarBrand carBrand = new CarBrand("Mersedes-benz", Color.BLACK, 2006,
                new Equipment("Кожа", "Automatik", "Задний"), 3, "Седан",
                new AutoProduction("Германия", "Mersedes centr", "Kulatova", 3));

        CarModel carModel = new CarModel("Toyota", "Camry", Color.WHITE, 2010,
                new Equipment("Тряпка", "Автомат", "Передний"), 2, "Универсал",
                new AutoProduction("japan", "Toyota centr", "Razakova", 56));

        CarModel carModel1 = new CarModel("Subaru", "Forester", Color.SEREBRO, 2019,
                new Equipment("Кожа", "Механика", "Полный"), 2, "Xэтчбек",
                new AutoProduction("Japan", "Subaru Centr", "Чуй", 125));

            System.out.println(carBrand.infoCar());
            carBrand.signalAuto("pip-pip",6);
           // carBrand.signalAuto("pppp",3);
            System.out.println("_________________________");
            System.out.println(carModel.infoCar());
            carModel.signalAuto("paaaaaaap");
            System.out.println("_________________________");
            System.out.println(carModel1.infoCar());
            carModel1.signalAuto("paap paap paap",6);

    }
}
