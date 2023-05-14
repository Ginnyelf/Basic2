package ru.netology.basic2;


public class CashBackHackerTest {
    @org.junit.Test
    public void shouldReturnBoundary() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;
        int expected = 100;
        int actual = cashBackHacker.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturnBoundaryISNull() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;
        int expected = 0;
        int actual = cashBackHacker.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldReturnBoundaryISNull2() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 2000;
        int expected = 0;
        int actual = cashBackHacker.remain(amount);
        org.junit.Assert.assertEquals(expected, actual);

    }

}