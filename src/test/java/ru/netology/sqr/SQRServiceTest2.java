package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest2 {

    @Test
    void shouldCalculateSqrtCeil() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.calculate(200,300);

        assertEquals(expected, actual);
    }
}