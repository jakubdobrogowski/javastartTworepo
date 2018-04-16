package pl.sda.javastartTwo.enums;

public enum ColourEnum {


    WHITE(0, "biały"), BLACK(1, "czarny");

    private int numberValue;
    private String plName;

    ColourEnum(int numberValue, String plName) {

        this.numberValue = numberValue;
        this.plName = plName;
    }

    public int getNumberValue() {
        return numberValue;
    }

    public String getPlName() {
        return plName;
    }

}
