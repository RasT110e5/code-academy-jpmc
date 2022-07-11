package com.code_academy.entity.generic;

import com.code_academy.util.Impresor;

public abstract class Mamifero {

    protected Integer edad;
    protected String nombre;

    public void saludar(){
        System.out.println("Hola soy " + this.nombre);
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void imprimirNombre (Impresor impresor){
        impresor.imprimir(this.nombre);
    }

    public Mamifero(String nombre, Integer edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public Mamifero() {
    }
}
