package Homework2_1.task_2;

public class Car {
    public String brand;
    public String model;
    private Double engineVolume;
    private String color;
    private Integer year;
    private String country;
    public Car(String brand, String model, Double engineVolume,
               String color, Integer year, String country) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Машина - " + brand +
                " " + model +
                ", с мощность двигателя - " + engineVolume +
                ", цвет - " + color +
                ", год производства - " + year +
                ", страна производитель - " + country;
    }
}
