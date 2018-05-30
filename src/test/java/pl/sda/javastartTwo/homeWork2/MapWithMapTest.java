package pl.sda.javastartTwo.homeWork2;

import org.junit.jupiter.api.Test;

import java.util.Map;

class MapWithMapTest {


    @Test
    void salaryStatsTest() {

        Map<String, Map<Double, Integer>> nameSalaryStats = MapWithMap.nameSalaryStats(); //wywołanie logiki

        Map<Double, Integer> innerMap = nameSalaryStats.get("Adam");
        Integer counter = innerMap.get(3333.0);
        assert counter == 2;

        innerMap = nameSalaryStats.get("Beata");
        counter = innerMap.get(1200.0);
        assert counter == 1;
    }
}
