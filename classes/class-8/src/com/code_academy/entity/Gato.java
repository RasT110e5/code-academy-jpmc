package com.code_academy.entity;

import com.code_academy.entity.generic.Mamifero;

public class Gato extends Mamifero {

    @Override
    public void saludar() {
        super.saludar();
        System.out.println("Hola soy un gato y me llamo " + this.nombre);
    }

    public Gato(String nombre, Integer edad) {
        super(nombre, edad);
    }
}
