/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.designpatterngui.gui;

import com.mycompany.designpatterngui.gui.factory.MediaFactory;
import com.mycompany.designpatterngui.gui.pane.PnImage;
import com.mycompany.designpatterngui.gui.pane.PnWav;
import com.mycompany.designpatterngui.gui.startegy.Registro;
import com.mycompany.designpatterngui.log.Log;
import com.mycompany.designpatterngui.log.LoggerInterface;
import com.mycompany.designpatterngui.log.MyLogger;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author Escritorio
 */
public class MyMultiPlayer extends javax.swing.JInternalFrame {

    LoggerInterface log = new MyLogger();
    
    /**
     * Creates new form MyMultiplePlayer
     */
    public MyMultiPlayer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnOpen = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnRender = new javax.swing.JPanel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btnOpen.setText("Open File");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        pnRender.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout pnRenderLayout = new javax.swing.GroupLayout(pnRender);
        pnRender.setLayout(pnRenderLayout);
        pnRenderLayout.setHorizontalGroup(
            pnRenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        pnRenderLayout.setVerticalGroup(
            pnRenderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pnRender);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnOpen))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        //dame la instancia de factory que la quiero usar, no importa como lo hagas
        MediaFactory factory = MediaFactory.getInstance(); 
        log.log("SELECCIONE IM FILE");
        int option = fileChooser.showOpenDialog(this);
        if(option == JFileChooser.APPROVE_OPTION){
            try {
                
                File file = fileChooser.getSelectedFile();
                Registro.registro.add(file.getName());
                log.log( file.getName());
                BorderLayout layout = new BorderLayout();
                //factory creame el panel que necesito, toma file hace lo que tengas que hacer
                JPanel panelTorender = factory.createPanel(file);
                this.pnRender.setLayout(layout);
                this.pnRender.add(panelTorender);
                this.pnRender.validate();
                this.pnRender.repaint();
                log.log("Renderizado");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
           log.log("Open command canceled");
        }
    }//GEN-LAST:event_btnOpenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpen;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnRender;
    // End of variables declaration//GEN-END:variables
}
