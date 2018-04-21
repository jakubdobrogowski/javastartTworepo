package pl.sda.javastartTwo.generic2;

public class GenericsFruitBox<T> {

    private T value;

    public GenericsFruitBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
