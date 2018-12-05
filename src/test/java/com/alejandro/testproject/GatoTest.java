package com.alejandro.testproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GatoTest {

    @Test
    public void saluda_nada_gato(){
        final String expected = "miau";

        Gato sut = new Gato();

        String actual = sut.saluda();

        Assert.assertEquals(actual, expected);
    }
}