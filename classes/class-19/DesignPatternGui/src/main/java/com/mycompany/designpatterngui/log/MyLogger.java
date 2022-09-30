/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterngui.log;

/**
 *
 * @author notebook
 */
public class MyLogger implements LoggerInterface{
    
    Log log = new Log();

    @Override
    public void log(Object data) {
        log.log(data);
        //todo lo de abajo es lo que tengo para agregar
        System.out.println("Esto lo agregamos nosotros");
    }
    
}
