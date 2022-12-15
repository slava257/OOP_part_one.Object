import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Car ladaGranta = new Car();
        ladaGranta.brand = "Lada";
        ladaGranta.model = "Granta";
        ladaGranta.year = 2015;
        ladaGranta.country = "Россия";
        ladaGranta.color = "желтого цвета";
        ladaGranta.engineVolume = 1.7f;


        Car audiA8 = new Car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 L TDI quattro";
        audiA8.year = 2020;
        audiA8.country = "Германия";
        audiA8.color = "черный цвет кузова";
        audiA8.engineVolume = 3.0f;


        Car BMWZ8 = new Car();
        BMWZ8.brand = "BMW";
        BMWZ8.model = "Z8";
        BMWZ8.year = 2021;
        BMWZ8.country = "Германия";
        BMWZ8.color = "черный цвет кузова";
        BMWZ8.engineVolume = 3.0f;


        Car kiaSportage =new Car();
        kiaSportage.brand = "Kia";
        kiaSportage.model = "Sportage 4-го поколения";
        kiaSportage.year = 2018;
        kiaSportage.country = "Южной Корее";
        kiaSportage.color = "красный цвет кузова";
        kiaSportage.engineVolume = 2.4f;


        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.year = 2016;
        hyundaiAvante.country = "Южной Корее";
        hyundaiAvante.color = "оранжевый цвет кузова";
        hyundaiAvante.engineVolume = 1.6f;
        System.out.println(ladaGranta + "" + audiA8 + "" + BMWZ8 + "" + kiaSportage + "" + hyundaiAvante);

    }
}
