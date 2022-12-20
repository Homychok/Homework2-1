package Homework2_1.task_1;

public class Car {
    String brand;
    String model;
    Double engineVolume;
    String color;
    Integer year;
    String country;
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
