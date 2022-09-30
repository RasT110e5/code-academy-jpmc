/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.designpatterngui.gui.factory;

import com.mycompany.designpatterngui.gui.pane.PnImage;
import com.mycompany.designpatterngui.gui.pane.PnWav;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JPanel;

/**
 *
 * @author notebook
 */
public class MediaFactory {

    private static MediaFactory _instance;

    public static MediaFactory getInstance() {
        if (_instance == null) {
            _instance = new MediaFactory();
        }
        return _instance;
    }

    private MediaFactory() {
    }

    public JPanel createPanel(File file) {
        if (file.getName().indexOf(".jpg") != -1) {
            //RenderImage        
            PnImage pn = new PnImage(file);
            pn.setVisible(true);
            pn.setPreferredSize(new Dimension(400, 400));
            return pn;
        }

        if (file.getName().indexOf(".wav") != -1) {
            //Play Wav                    
            PnWav pn = new PnWav(file);
            pn.setVisible(true);
            pn.setPreferredSize(new Dimension(400, 400));
            return pn;

        }
        return null;
    }

}
