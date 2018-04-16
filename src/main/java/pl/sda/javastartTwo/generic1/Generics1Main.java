package pl.sda.javastartTwo.generic1;

public class Generics1Main {

    public static void main(String[] args) {

        FirstStepInGenerics();
        SecondStepInGenerics();
    }

    private static void SecondStepInGenerics() {

        FruitBox fruitBoxofApples = new FruitBox(new Apple());
        FruitBox fruitBoxofOranges = new FruitBox(new Orange());
        Fruit ApplesFruit = fruitBoxofApples.getFruit();
        Fruit OrangeFruit = fruitBoxofOranges.getFruit();
    }

    private static void FirstStepInGenerics() {

        OrangeBox orangeBox = new OrangeBox(new Orange());
        AppleBox appleBox = new AppleBox(new Apple());
    }
}
