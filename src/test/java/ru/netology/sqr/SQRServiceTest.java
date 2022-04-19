package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateSqrtCeil() {
        SQRService service = new SQRService();
        int expected = 0;
        int actual = service.calculate(10,99);

        assertEquals(expected, actual);
    }
}