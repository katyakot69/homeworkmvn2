package ru.netology.homeworkmvn2.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvSource({
            "200,300,3",
            "400,600,5",
            "600,1000,7"
    })

    public void testSqrService(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrNumbers(min, max);
        Assertions.assertEquals(expected, actual);

    }
}
