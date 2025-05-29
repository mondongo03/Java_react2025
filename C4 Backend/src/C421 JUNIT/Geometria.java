public class Geometria {

    public int areaCuadrado(int lado) {
        return lado * lado;
    }

    public double areaCirculo(int radio) {
        return Math.PI * radio * radio;
    }

    public int areaTriangulo(int base, int altura) {
        return (base * altura) / 2;
    }

    public int areaRectangulo(int base, int altura) {
        return base * altura;
    }

    public int areaPentagono(int perimetro, int apotema) {
        return (perimetro * apotema) / 2;
    }
}
GeometriaTest.java
_---------------------------------------

package com.miapp;

import static org.junit.jupiter.api.Assertions.;
import org.junit.jupiter.api.Test;

public class GeometriaTest {

    Geometria geo = new Geometria();

    @Test
    public void testAreaCuadrado() {
        assertEquals(25, geo.areaCuadrado(5));
    }

    @Test
    public void testAreaCirculo() {
        assertEquals(Math.PI 3 * 3, geo.areaCirculo(3), 0.001);
    }

    @Test
    public void testAreaTriangulo() {
        assertEquals(10, geo.areaTriangulo(4, 5));
    }

    @Test
    public void testAreaRectangulo() {
        assertEquals(20, geo.areaRectangulo(4, 5));
    }

    @Test
    public void testAreaPentagono() {
        assertEquals(30, geo.areaPentagono(6, 10));
    }
}