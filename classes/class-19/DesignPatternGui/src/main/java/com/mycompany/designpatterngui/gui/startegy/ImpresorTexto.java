/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterngui.gui.startegy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notebook
 */
public class ImpresorTexto implements Impresor {

    @Override
    public void imprimir(List<String> data) {
        FileOutputStream oos = null;
        try {
            File file = new File("report.txt");
            oos = new FileOutputStream(file);
            for (String ss: data){
                oos.write(ss.getBytes());
            }
            oos.flush();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ImpresorTexto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ImpresorTexto.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (IOException ex) {
                Logger.getLogger(ImpresorTexto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }
    
}