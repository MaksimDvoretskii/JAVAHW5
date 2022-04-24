package ru.netology.sqr;

public class SQRService {
    public int calculate(int underMeaning,int upperMeaning) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (underMeaning <= sqr && sqr <= upperMeaning) {
                counter++;
            }
        }
        return counter;
    }
}

