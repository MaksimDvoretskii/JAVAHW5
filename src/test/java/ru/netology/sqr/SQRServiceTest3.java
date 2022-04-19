package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest3 {

    @Test
    void shouldCalculateSqrtCeil() {
        SQRService service = new SQRService();
        int expected = 22;
        int actual = service.calculate(25,1000);

        assertEquals(expected, actual);
    }
}