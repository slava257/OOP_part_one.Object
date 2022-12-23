package transport;
//Создайте новый класс «Автобус» (Bus), который полностью наследует все параметры класса Transport.
//
//Создайте 3 произвольных объекта для данного класса, выведите в консоль данные по каждому.
public class Bus extends Transport{

    public Bus(String brand, String model, int yearOfRelease, String countryOfOrigin, String bodyColor, int maxMovementSpeed) {
        super(brand, model, yearOfRelease, countryOfOrigin, bodyColor, maxMovementSpeed);

    }
}
