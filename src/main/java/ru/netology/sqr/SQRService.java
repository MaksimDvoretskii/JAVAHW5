package ru.netology.sqr;

public class SQRService {
    public int calculate(int underRange,int upperRange) {
        int counter = 0; // считает количество раз когда i * i попадает в промежуток underRange, upperRange
        for (int i = 10; i <= 99; i++) { // цикл начиная от i = 10 до i = 99 после каждой итерации прибавляет i + i
            int sqr = i * i;
            if (underRange <= sqr && sqr <= upperRange) { // && - логическое и (TRUE, если оба условия верны)
                counter++; // идентично counter = counter + 1
            }
        }
        return counter;
    }
}

