package com.code_academy.util;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class ImpresorTxt implements Impresor{
    @Override
    public void imprimir(String texto) {
        try {
            OutputStream ou = new FileOutputStream(texto + ".txt");
            ou.write(texto.getBytes());
            ou.flush();
            ou.close();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
