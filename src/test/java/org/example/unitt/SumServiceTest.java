package org.example.unitt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SumServiceTest {
    @Autowired
    private SumService sumService;

    @Test
    void testSum() {
        int result = sumService.add(2,3);

        assertEquals(5,result,"The add method should correctly sum two numbers");
    }
}
