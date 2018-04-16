package pl.sda.javastartTwo;

import pl.sda.javastartTwo.enums.ColourEnum;

public class Car {

    //  private String colour;

    private ColourEnum colour;

    public Car(ColourEnum colour) {
        this.colour = colour;
    }

    public ColourEnum getColour() {
        return colour;
    }

    @Override
    public boolean equals(Object obj) {
        return colour.equals(((Car) obj).getColour());
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour=" + colour +
                '}';
    }

}
