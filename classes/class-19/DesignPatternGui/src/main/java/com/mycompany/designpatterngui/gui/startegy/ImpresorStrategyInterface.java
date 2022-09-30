/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.designpatterngui.gui.startegy;

import java.util.List;

/**
 *
 * @author notebook
 */
public interface ImpresorStrategyInterface {
    
    void imprimir(List<String> data);
    
    void setStrategy(Impresor impresor);
    
}
