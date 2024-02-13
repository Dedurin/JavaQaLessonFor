package ru.netology.services;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VacationServiceTest {

    @Test
    public void testCalculate1() {
        VacationService vacationService = new VacationService();
        int income1 = 10000;
        int expenses1 = 3000;
        int threshold1 = 20000;
        int expected = 3;
        int actualcount = vacationService.calculate(income1,expenses1,threshold1);
        assertEquals(expected, actualcount);
    }

    @Test
    public void testCalculate2() {
        VacationService vacationService = new VacationService();
        int income2 = 100000;
        int expenses2 = 60000;
        int threshold2 = 150000;
        int expected = 2;
        int actualcount = vacationService.calculate(income2,expenses2,threshold2);
        assertEquals(expected, actualcount);


    }

}