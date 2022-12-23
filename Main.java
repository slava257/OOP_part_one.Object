import transport.Bus;
import transport.Car;

public class Main {


    public static void main(String[] args) {
        //Создайте новый проект в IDEA. Создайте класс «Автомобиль», у которого есть:
        //марка (brand),
        //модель (model),
        //объем двигателя в литрах (engineVolume),
        //цвет кузова (color),
        //год производства (year),
        //страна сборки (country).
        //Создайте объекты для следующих автомобилей:
        //Lada Granta, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя — 1,7 л.
        //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя — 3,0 л.
        //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем — 3,0 л.
        //Kia Sportage 4-го поколения, 2018 год выпуска, сборка в Южной Корее, цвет кузова — красный, объем двигателя — 2,4 л.
        //Hyundai Avante, сборка в Южной Корее, цвет кузова — оранжевый, объем двигателя — 1,6 л, год выпуска — 2016 год.
        //Напишите программу, которая будет выводить в консоль информацию о каждом автомобиле и все указанные выше характеристики.
        Car ladaGranta = new Car( "Lada","Granta",2015,"Россия","желтого цвета",1.7f);


        Car audiA8 = new Car("Audi","A8 L TDI quattro",2020,"Германия", "черный цвет кузова", 3.0f);
        audiA8.setSummerTyres(false);

        Car BMWZ8 = new Car("BMW","Z8",2021,"Германия","черный цвет кузова",3.0f);
        BMWZ8.setRegistrationNumber("х034ор34");
        BMWZ8.setMaxMovementSpeed(180);

        Car kiaSportage =new Car("Kia","Sportage 4-го поколения",2018,"Южной Корее", "красный цвет кузова",2.4f);
        kiaSportage.setTransmission("АКПП");

        Car hyundaiAvante = new Car("Hyundai","Avante",2016,"Южной Корее","оранжевый цвет кузова",1.6f);
        hyundaiAvante.setKay(new Car.Kay(true,true));
printInfo(ladaGranta);
printInfo(audiA8);
printInfo(BMWZ8);
printInfo(kiaSportage);
printInfo(hyundaiAvante);
        printTask();
        Bus mercedes = new Bus("Mercedes","Sprinter",2007,"Германия","Синий", 180);
        mercedes.setMaxMovementSpeed(210);
        Bus volkswagen = new Bus("Volkswagen","Crafter",2015,"Германия","Серый",175);
        Bus renault = new Bus("Renault","Trafic",2019,"Франция","Красный",160);
        printInfoBus(mercedes);
        printInfoBus(volkswagen);
        printInfoBus(renault);
    }



    private static void printInfo(Car car) {
        System.out.println(car.getBrand()+" "+car.getModel() +
                ", год выпуска: "+car.getYearOfRelease() +
                ", страна сборки: " + car.getCountryOfOrigin() +
                ", цвет кузова: " + car.getBodyColor() +
                ", объем двигателя: "+car.getEngineVolume() +
                ", коробка передач: "+car.getTransmission() +
                ", тип кузова: " +car.getBodyType() +
                ", регистрационный номер: " +car.getRegistrationNumber() +
                ", количество мест: "+car.getNumberOfSeats()+
                ", "+(car.isSummerTyres()?"летняя":"зимняя")+" резина " +
                ", "+(car.getKay().isKeylessAccess() ? "безключевой доступ":"ключевой доступ")+
                ", "+(car.getKay().isRemoteRunEngine() ? "удаленный запуск":"обычный запуск") +
                ", Максимальная скорость передвижения: " + car.getMaxMovementSpeed()+'.');
    }
    private static void printInfoBus(Bus bus){
        System.out.println(bus);
    }
    private static void printTask(){
        System.out.println("Task bus ");
    }
}
