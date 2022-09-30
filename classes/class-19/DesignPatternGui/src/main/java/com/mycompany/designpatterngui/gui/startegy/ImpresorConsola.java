/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterngui.gui.startegy;

import java.util.List;

/**
 *
 * @author notebook
 */
public class ImpresorConsola implements Impresor {

    @Override
    public void imprimir(List<String> data) {
       for( String s : data){
            System.out.println(s);
        }
    }
    
}
