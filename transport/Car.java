package transport;

public class Car {

    private String transmission;
    private final String bodyType;
    private String registrationNumber;

    private final int numberOfSeats;
    private final String brand;
    private final String model;
    private float engineVolume;
    private String color;
    private final int yearOfRelease;
    private final String country;
    private boolean summerTyres;
    private Kay kay;

    //Создайте пакет transport и перенесите туда класс Car.
    //Добавьте следующие свойства класса:
    //«Коробка передач»,
    //«Тип кузова»,
    //«Регистрационный номер»,
    //«Количество мест»,
    //признак «Летняя» или «Зимняя резина».
    //Следующие поля изменяться не могут:
    //«Марка»,
    //«Модель»,
    //«Год производства»,
    //«Страна сборки»,
    //«Тип кузова»,
    //«Количество мест»
    //Соответственно, для них них нужно настроить модификатор доступа и создать геттеры.
    //Остальные поля изменяться могут, доступ к ним должен осуществляться через геттеры и сеттеры. Не забудьте про модификаторы доступа каждого параметра класса, а также конструкторов.
    //Пропишите проверку данных для новых полей класса и значения по умолчанию, если параметры пустые, равны null или имеют некорректное значение.
    //Добавьте функциональность:
    //Метод «сменить шины на сезонные».
    //Задание 2
    //В классе Car создайте вложенный класс «Ключ» (Key) с параметрами:
    //«Удаленный запуск двигателя»,
    //«Бесключевой доступ».
    //Данные параметры неизменяемые. Добавьте ко всем новым полям проверку данных, что параметры не пустые, не равны null и содержат корректные данные.
    public Car(String transmission, String bodyType, String registrationNumber, int numberOfSeats,
               String brand, String model, float engineVolume, String color, int yearOfRelease,
               String country, boolean winterTyres,Kay kay) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (yearOfRelease <= 0) {
            this.yearOfRelease = 2000;
        } else {
            this.yearOfRelease = yearOfRelease;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "default";
        } else {
            this.country = country;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "седан";
        } else {
            this.bodyType = bodyType;
        }
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
        if (kay == null) {
            this.kay = new Kay();
        }else {
            this.kay = kay;
        }
        this.numberOfSeats = numberOfSeats;
        this.summerTyres = true;
    }


    public Car(String brand, String model, int yearOfRelease, String country, String color, float engineVolume) {
        this( "МКПП", "седан","x000xx000", 5, brand, model, engineVolume, color, yearOfRelease, country, true,new Kay());
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "МКПП";
        } else {
            this.transmission = transmission;
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "x000xx000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public boolean getSummerTyres() {
        return summerTyres;
    }

    public boolean isSummerTyres() {
        return summerTyres;
    }
    public void setSummerTyres(boolean summerTyres) {
        this.summerTyres = summerTyres;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountry() {
        return country;
    }

    public void changeTyres() {
        summerTyres = !summerTyres;
    }

    public void setKay(Kay kay) {
        this.kay = kay;
    }

    public Kay getKay() {
        return kay;
    }

    public boolean isCorrectRegNumber() {
        if (registrationNumber.length()<8) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0])|| !Character.isAlphabetic(chars[4])|| !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) &&
                Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public static class Kay {
        private final boolean remoteRunEngine;
        private final boolean keylessAccess;

        public Kay(boolean remoteRunEngine, boolean keylessAccess) {
            this.remoteRunEngine = remoteRunEngine;
            this.keylessAccess = keylessAccess;
        }

        public Kay() {
            this(false, false);
        }

        public boolean isRemoteRunEngine() {
            return remoteRunEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

    }
    }