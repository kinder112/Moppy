/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moppysim.ui;

import java.awt.Color;

/**
 *
 * @author Sam
 */
public class DrivePanel extends javax.swing.JPanel {
    
    double lastFrequency;
    
    /**
     * Creates new form DrivePanel
     */
    public DrivePanel() {
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

        jLabel1 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/moppysim/ui/floppy_xs.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

public void playingNote(double frequency){
    if (frequency > 0){
        lastFrequency = frequency;
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.getHSBColor((float)(frequency/500), 1, 1), 3));
    } else if(lastFrequency>0) {
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.getHSBColor((float)(lastFrequency/500), 1, (float)0.5), 3));
    } else {
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 3));
    }
}

public void resetDrive(){
    lastFrequency = 0;
    jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(Color.BLACK, 3));
}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}