package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void amountLower1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void amount1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/TryParametrizedTestData.csv", numLinesToSkip = 1)
    void ParametrizedAmountLower1000(int amount, int expected) {
        CashbackHackService cashbackHackService = new CashbackHackService();


        int actual = cashbackHackService.remain(amount);


        assertEquals(expected, actual);
    }


}