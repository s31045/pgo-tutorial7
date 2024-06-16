import java.util.ArrayList;

import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList <Car> cars = new ArrayList<Car>();

        cars.add(new Car("Golf", 1999));
        cars.add(new Car("Astra", 2010));
        cars.add(new Car("Corsa", 2005));

        for(Car car: cars){
            System.out.println(car.model);
        }

        System.out.println("---");

        Collections.sort(cars);



        for(Car car: cars){
            System.out.println(car.model);
        }

    }
}