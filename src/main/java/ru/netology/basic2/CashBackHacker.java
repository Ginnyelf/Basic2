package ru.netology.basic2;

public class CashBackHacker {
    private final int boundary = 1000;

    public int remain(int amount) {
        if (amount/ boundary >= 1) {
            int boundary = 0;
            return boundary;
        }


        return boundary - amount % boundary;
    }
}
