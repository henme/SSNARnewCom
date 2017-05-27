/*
 * This code is written as a part of a Master Thesis
 * the spring of 2016.
 *
 * Thor Eivind Andersen and Mats Rødseth (Master 2016 @ NTNU)
 */
package no.ntnu.tem.gui;

import no.ntnu.tem.robot.Robot;

/**
 * This class represents the panel that is visualised in the connected robots
 * list. It contains of the robot name + an info button.
 *
 * @author Thor Eivind and Mats (Master 2016 @ NTNU)
 */
public class RobotPanel extends javax.swing.JPanel {

    private Robot robot;
    private RobotInfoGUI infoGUI;

    /**
     * Constructor of the class RobotPanel
     */
    public RobotPanel() {
        initComponents();
    }

    /**
     * Second constructor of the class RobotPanel
     *
     * @param r robot to associate with the panel
     * @param parent the main window of the application
     */
    public RobotPanel(Robot r, MainGUI parent) {
        initComponents();
        robot = r;
        lblName.setText(r.getName());
        InitialRobotParameterGUI initDialog = new InitialRobotParameterGUI(parent, r);
        initDialog.setLocationRelativeTo(parent);
        initDialog.setVisible(true);
        infoGUI = new RobotInfoGUI(robot, parent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(160, 40));
        setMinimumSize(new java.awt.Dimension(160, 40));
        setPreferredSize(new java.awt.Dimension(160, 40));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Info");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblName.setText("RobotName");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 9, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        infoGUI.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables

    /**
     * Method that returns the robot associated with the robotpanel
     *
     * @return
     */
    public Robot getRobot() {
        return robot;
    }
}
