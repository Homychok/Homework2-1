package Homework2_1.task_3;

public class Car {
    public String brand;
    public String model;
    public Double engineVolume;
    public String color;
    public Integer year;
    public String country;
    public Car(String brand, String model, Double engineVolume,
               String color, Integer year, String country) {
        if (brand.isEmpty() || brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else {
            this.color = color;
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty()) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Машина - " + this.brand +
                " " + this.model +
                ", с мощность двигателя - " + this.engineVolume +
                ", цвет - " + this.color +
                ", год производства - " + this.year +
                ", страна производитель - " + this.country;
    }
}
