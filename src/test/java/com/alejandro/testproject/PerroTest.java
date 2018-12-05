package com.alejandro.testproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PerroTest {

    @Test
    public void saluda__nada__guau(){
        final String expected = "guau";

        // creamos el nuevo objeto
        Perro sut = new Perro();

        // la variable que devuelve el metodo siempre se llama actual
        String actual = sut.saluda();

        // hacemos la prueba
        Assert.assertEquals(actual, expected);
    }
}