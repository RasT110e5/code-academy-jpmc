/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.designpatterngui;

import com.mycompany.designpatterngui.gui.Main;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Escritorio
 */
public class DesignPatternGui {

    public static void main(String[] args) throws Exception {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                UIManager.LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
                for (UIManager.LookAndFeelInfo look : looks) {
                    System.out.println(look.getClassName());
                    if (look.getClassName().equals("com.sun.java.swing.plaf.windows.WindowsLookAndFeel")) {
                        try {
                            UIManager.setLookAndFeel(look.getClassName());
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(DesignPatternGui.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (InstantiationException ex) {
                            Logger.getLogger(DesignPatternGui.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (IllegalAccessException ex) {
                            Logger.getLogger(DesignPatternGui.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (UnsupportedLookAndFeelException ex) {
                            Logger.getLogger(DesignPatternGui.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        break;
                    }
                }

                Main main = new Main();
                main.setVisible(true);
            }
        });
    }
}
