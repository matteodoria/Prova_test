package org.example;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DividerTest {

    @Test
    public void doCalc() {
        Divider divider = new Divider();
        double r = divider.doCalc(3, 2);

        assertEquals(1.5, r);
    }
}
