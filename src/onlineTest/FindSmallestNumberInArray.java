package onlineTest;

import jdk.jfr.StackTrace;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class FindSmallestNumberInArray {

    private static class Car{
        private String model;
        private int topSpeed;

        public Car(String model, int topSpeed) {
            this.model = model;
            this.topSpeed = topSpeed;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public int getTopSpeed() {
            return topSpeed;
        }

        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{-5, -2, -9 , 0, -1, -12, 32};
        System.out.println(findSmallestNumber(intArray));

        Car sonata = new Car("Sonata", 120);
        Car accord = new Car("Accord", 125);
        Car bmw = new Car("BMW", 130);

        Car[] cArray = new Car[]{sonata, bmw, accord};
        System.out.println("Car with Max speed is : " + maxCArBySpeed(cArray).getModel());

    }

    private static int findSmallestNumber(int[] iArray){
        return Arrays.stream(iArray).min().getAsInt();
    }

    private static Car maxCArBySpeed(Car[] carArray){
        return Arrays.stream(carArray)
                .max(Comparator.comparing(Car :: getTopSpeed))
                .orElseThrow(NoSuchElementException::new);
    }
}
