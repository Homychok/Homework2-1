package Homework2_1.task_3;

public class Main {
        public static void main(String[] args) {
            Car car1 = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");
            Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
            Car car3 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
            Car car4 = new Car("Kia", "Sportage IV", 2.4, "red", 2018, "South Korea");
            Car car5 = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "Germany");

            System.out.println(car1 + "\n" + car2 + "\n" + car3 +
                    "\n" + car4 + "\n" + car5);
        }
}
