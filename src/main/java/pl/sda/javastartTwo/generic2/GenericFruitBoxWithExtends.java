package pl.sda.javastartTwo.generic2;

import pl.sda.javastartTwo.generic1.Fruit;

public class GenericFruitBoxWithExtends<T extends Fruit> {

    private  T value;

    public GenericFruitBoxWithExtends(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

}
