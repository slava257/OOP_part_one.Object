package transport;
//Создайте класс Transport, который содержит в себе следующие параметры:
//«Марка»,
//«Модель»,
//«Год выпуска»,
//«Страна производства»,
//«Цвет кузова»,
//«Максимальная скорость передвижения».
//Создайте геттеры и сеттеры для необходимых полей. Параметры «Год выпуска»,
// «Страна производства» не могут изменяться, «Цвет», «Скорость» меняться могут.
// Для изменяемых параметров добавьте проверку данных, что значение указано корректно,
// не содержит null и не пустое.
//Скорректируйте класс Car таким образом, чтобы ранее указанные параметры не повторяли те,
// которые содержатся в классе Transport.
//Класс Car должен наследовать параметры класса Transport.

public class Transport {
    private String brand;
    private String model;
    private final int yearOfRelease;
    private final String countryOfOrigin;
    private String bodyColor;
    private int maxMovementSpeed;

    public Transport(String brand, String model, int yearOfRelease, String countryOfOrigin, String bodyColor, int maxMovementSpeed) {
        setBrand(brand);
        setModel(model);
        if (yearOfRelease <= 0) {
            this.yearOfRelease = 2000;
        } else {
            this.yearOfRelease = yearOfRelease;
        }
        if (countryOfOrigin == null || countryOfOrigin.isEmpty() || countryOfOrigin.isBlank()) {
            this.countryOfOrigin = "default";
        } else {
            this.countryOfOrigin = countryOfOrigin;
        }
        setBodyColor(bodyColor);
        setMaxMovementSpeed(maxMovementSpeed);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank()) {
            this.bodyColor = "белый";
        } else {
            this.bodyColor = bodyColor;
        }
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        if (maxMovementSpeed >= 90) {
            this.maxMovementSpeed = maxMovementSpeed;

        } else if (maxMovementSpeed < 0) {
            this.maxMovementSpeed = Math.abs(maxMovementSpeed);
        } else {
            this.maxMovementSpeed = 90;
        }
    }

        public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return
                 brand + " "
                 + model +
                ", год выпуска: " + yearOfRelease +
                ", страна сборки: " + countryOfOrigin +
                ", цвет кузова: " + bodyColor +
                ",Максимальная скорость передвижения: " + maxMovementSpeed +
                '.';
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

    }
}