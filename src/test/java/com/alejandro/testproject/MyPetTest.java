package com.alejandro.testproject;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyPetTest {
    private MyPet sut;
    private static IPet animalNull;

    @BeforeMethod
    public void setUp() {
        sut = new MyPet();
        animalNull = new IPet() {
            public String saluda() {
                return null;
            }
        };
    }

    @Test
    public void dimeHola_gato_saludoDeGato() {
        final String expected = "Hola miau";
        Gato gato = new Gato();
        String actual = sut.dimeHola(gato);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider
    public static Object[][] animales() {
        return new Object[][]{
            { new Gato(), "Hola miau"},
            { new Perro(), "Hola guau"},
            { animalNull, "Hola" }
        };
    }

    @Test(dataProvider = "animales")
    public void dimeHola_variosPets_correctResponse(IPet pet, String expected) {
        String actual = sut.dimeHola(pet);
        Assert.assertEquals(actual, expected);
    }
}