package pl.sda.javastartTwo.HomeWork.generyki;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumNumbersUsingGenericMethodsTest {

    @Test
    void shouldSummarizeListInt() {

        List<Number> integersArrayLisr = new ArrayList<>(); //xd

        integersArrayLisr.add(1);
        integersArrayLisr.add(2.6);
        integersArrayLisr.add(3);


        double sum = SumNumbersUsingGenericMethods.sumNumbers(integersArrayLisr);
        assert sum == 6;
    }
}