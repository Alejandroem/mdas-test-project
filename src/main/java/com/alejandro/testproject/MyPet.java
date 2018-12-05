package com.alejandro.testproject;

public class MyPet {

    public String dimeHola(IPet pet) {
        if (pet.saluda() == null) {
            return "Hola";
        }
        return "Hola " + pet.saluda();
    }
}