package Homework2_1.task_1;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car();
        lada.brand = "Lada";
        lada.model = "Granta";
        lada.color = "yellow";
        lada.country = "Russia";
        lada.year = 2015;
        lada.engineVolume = 1.7;
        System.out.println("Машина - " + lada.brand + " " + lada.model + ", с мощность двигателя - " + lada.engineVolume +
                ", цвет - " + lada.color + ", год производства - " + lada.year + ", страна производитель - " + lada.country);

        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A8 50 L TDI quattro";
        audi.color = "black";
        audi.country = "Germany";
        audi.year = 2020;
        audi.engineVolume = 3.0;
        System.out.println("Машина - " + lada.brand + " " + lada.model + ", с мощность двигателя - " + lada.engineVolume +
                ", цвет - " + lada.color + ", год производства - " + lada.year + ", страна производитель - " + lada.country);

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.color = "black";
        bmw.country = "Germany";
        bmw.year = 2021;
        bmw.engineVolume = 3.0;
        System.out.println("Машина - " + bmw.brand + " " + bmw.model + ", с мощность двигателя - " + bmw.engineVolume +
                ", цвет - " + bmw.color + ", год производства - " + bmw.year + ", страна производитель - " + bmw.country);

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage IV";
        kia.color = "red";
        kia.country = "South Korea";
        kia.year = 2018;
        kia.engineVolume = 2.4;
        System.out.println("Машина - " + kia.brand + " " + kia.model + ", с мощность двигателя - " + kia.engineVolume +
                ", цвет - " + kia.color + ", год производства - " + kia.year + ", страна производитель - " + kia.country);

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.color = "orange";
        hyundai.country = "South Korea";
        hyundai.year = 2016;
        hyundai.engineVolume = 1.6;
        System.out.println(lada + "\n" + audi + "\n" + bmw +
                "\n" + kia + "\n" + hyundai);


    }
}
