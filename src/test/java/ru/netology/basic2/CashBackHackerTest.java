package ru.netology.basic2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashBackHackerTest {
    @Test
    void shouldReturnBoundary() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;
        int expected = 100;
        int actual = cashBackHacker.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnBoundaryISNull() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;
        int expected = 0;
        int actual = cashBackHacker.remain(amount);
        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnBoundaryISNull2() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 2000;
        int expected = 0;
        int actual = cashBackHacker.remain(amount);
        assertEquals(expected, actual);

    }

}