package ru.netology.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AfishaTest {
    @Test
    public void shouldGetandSet() {
        Afisha afisha = new Afisha();
        String expected = "Первый";
        assertNull(afisha.getProductName());
        afisha.setProductName(expected);
        assertEquals(expected, afisha.getProductName());
    }

}