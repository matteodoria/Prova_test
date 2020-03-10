package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DividerTest5 {

    @Test
    void doCalc() {
        Divider divider = new Divider();
        double r = divider.doCalc(3, 2);

        assertEquals(1.5, r);
    }
}