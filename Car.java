public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int year;
    private String country;
    //Задание 2
    //Перепишите класс «Автомобиль» с использованием конструктора. Передайте все свойства созданных вами объектов машин с помощью конструктора.
    //Выведите в консоль сообщение о каждом автомобиле с перечислением всех их характеристик.
//Задание 3
//Продолжим работать с классом Car.
//Дополните созданные ранее конструкторы проверками:
//Если передана пустая строка или null в поля модель, марка машины и страна сборки, то значение по умолчанию — default.
//Если переданный объем двигателя ≤=0, то значение по умолчанию — 1,5 л.
//Если передана пустая строка или null, то цвет кузова по умолчанию — белый.
//Если год производства ≤0, то значение по умолчанию — 2000.
//В случае если какая-либо информация не указана по объекту, программа должна выводить в консоль информацию о каждом автомобиле и все указанные выше характеристики, подставляя вместо отсутствующей информации значение по умолчанию.
    public Car(String brand, String model, int year, String country, String color, float engineVolume) {
        if (brand == null || brand == "" || brand == " ") {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model == "" || model == " ") {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country == "" || country == " ") {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (color == null || color == "" || color == " ") {
            color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }
     Car(  int year, String color, float engineVolume) {
        this.year = year;
        this.color = color;
        this.engineVolume = engineVolume;
        if (brand == null || brand == "" || brand == " ") {
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if (model == null ||model == "" || model == " ") {
            this.model = "default";
        }else{
            this.model = model;
        }
        if (country == null || country == "" || country == " ") {
            this.country = "default";
        }else{
            this.country = country;
        }
        }
    Car(String brand, String model, int year, String country, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.country = country;
        this.engineVolume = engineVolume;
        if (color == null || color == "" || color == " ") {
            color = "белый";
        }
    }
    Car(String brand, String model, String country, String color, float engineVolume) {
        this.brand = brand;
        this.model = model;
        this.country = country;
        this.color = color;
        this.engineVolume = engineVolume;
        if (year <= 0) {
            this.year = 2000;
        }
    }
    public String toString() {
        return brand + " " + model + " " + year + " " + country + " " + color + " " + engineVolume+"\n";
    }
}