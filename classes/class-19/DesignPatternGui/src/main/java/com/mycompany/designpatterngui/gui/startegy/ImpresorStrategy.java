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
public class ImpresorStrategy implements ImpresorStrategyInterface {
    
    private Impresor impresor;
    
    
    
    @Override
    public void setStrategy(Impresor impresor){
        this.impresor = impresor;
    }

    @Override
    public void imprimir(List<String> data) {
        impresor.imprimir(data);
    }
}
