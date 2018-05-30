package pl.sda.javastartTwo.exceptions;

import com.google.common.collect.ObjectArrays;

public class SimplePositiveNumbersBox <T extends Number> {

    private T[] numbers; //niezmienna wielkość

    public SimplePositiveNumbersBox(T[] numbers) {
        this.numbers = numbers;
    }

    //konstuktor z gwizadka
    public SimplePositiveNumbersBox(Class<T> tClass, int size) {
        this.numbers = ObjectArrays.newArray(tClass, size);
    }


    public void setValue(int index, T value) throws OutOfBoxExceptions {

        if (value.doubleValue() < 0) {

            throw new NegativNumberExceptions("Ujemna Liczba");
        }
        if (index < 0 || index >= numbers.length) {

            throw new OutOfBoxExceptions("Nie ma takiego indeksu");
        }
        numbers[index] = value;
    }


    public T getValue(int index) throws OutOfBoxExceptions {

        if (index < 0 || index >= numbers.length){

            throw new OutOfBoxExceptions("Nie ma takiego indeksu");
        }

        return  numbers[index];
    }

}
