package pl.sda.javastartTwo.enums;

import pl.sda.javastartTwo.Car;

import java.util.Arrays;

public class EnumExampleMain {

    public static void main(String[] args) {

        Car blackCar = new Car(ColourEnum.BLACK);
        Car whiteCar = new Car(ColourEnum.WHITE);
        Car anotherBlackCar = new Car(ColourEnum.BLACK);

        Car newcar = null; //wazne
        for (ColourEnum colourEnum : ColourEnum.values()) {
            if (colourEnum.getNumberValue() == 0) {

                newcar = new Car(colourEnum);
                break;
            }
        }
        System.out.println("newCar = " + newcar.toString());

        System.out.println(blackCar.equals(anotherBlackCar));

        ColourEnum[] values = ColourEnum.values();
        System.out.println(Arrays.toString(values));

    }
}
