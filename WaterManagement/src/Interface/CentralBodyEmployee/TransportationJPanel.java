/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CentralBodyEmployee;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AnalystOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AnalysisWorkRequest;
import Business.WorkQueue.WorkRequest;
import Interface.AnalystGroupEmployee.AnalystEmployeeWorkAreaJPanel;
import java.awt.CardLayout;
import java.util.Enumeration;
import java.util.Random;
import javax.swing.AbstractButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Ranadeep Guha
 */
public class TransportationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransportationJPanel
     */
    
     private double costPerMile;
     private double distanceBetweenLocations;
     private double totalCostofTransportation;
     private double waterAllowedInterstate;
     JPanel userProcessContainer;
     AnalysisWorkRequest request;
     AnalystOrganization organization;
     UserAccount account;
     Enterprise enterprise;
     
     
    public TransportationJPanel(JPanel userProcessContainer, AnalysisWorkRequest request,UserAccount account, AnalystOrganization organization, Enterprise enterprise) {
        initComponents();
        this.request=request;
        this.account=account;
        this.enterprise=enterprise;
        this.userProcessContainer=userProcessContainer;
        this.organization=(AnalystOrganization)organization;
        populateTransportationJPanel();
       
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        interstateTransportationApproval = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        perMileCostJTextField = new javax.swing.JTextField();
        totalCostJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        distanceJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        waterRequiredJTextField = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Transportation Dashboard");

        jLabel3.setText("Distance between the nearest locations");

        jLabel4.setText("Cost/mile/unit");

        perMileCostJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perMileCostJTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Total Cost of Transportation");

        jLabel6.setText("Approve inter-state transportation?");

        interstateTransportationApproval.add(jRadioButton1);
        jRadioButton1.setText("No");

        interstateTransportationApproval.add(jRadioButton2);
        jRadioButton2.setText("Yes");

        jButton1.setBackground(new java.awt.Color(0, 102, 153));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Apply");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Water Required");

        waterRequiredJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waterRequiredJTextFieldActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 102, 153));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(52, 52, 52)
                                .addComponent(jRadioButton1)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(totalCostJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addComponent(perMileCostJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addComponent(distanceJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                .addComponent(waterRequiredJTextField)))))
                .addContainerGap(203, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(waterRequiredJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(perMileCostJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(distanceJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(totalCostJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jLabel6)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void perMileCostJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perMileCostJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perMileCostJTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        checkDecision();
        AnalystEmployeeWorkAreaJPanel panel=new AnalystEmployeeWorkAreaJPanel(userProcessContainer,request, account, organization, enterprise,waterAllowedInterstate);
        userProcessContainer.add("Back to Analyst",panel);
        CardLayout layout= (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void waterRequiredJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waterRequiredJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waterRequiredJTextFieldActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnBackActionPerformed

    public int randInt(int min, int max) {

       
       Random rand = new Random();
       int randomNum = rand.nextInt((max - min) + 1) + min;
       return randomNum;
   }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JTextField distanceJTextField;
    private javax.swing.ButtonGroup interstateTransportationApproval;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField perMileCostJTextField;
    private javax.swing.JTextField totalCostJTextField;
    private javax.swing.JTextField waterRequiredJTextField;
    // End of variables declaration//GEN-END:variables

    public void  populateTransportationJPanel() {
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Random rand=new Random();
    
    double waterRequired=request.getWaterRequired();
    waterRequiredJTextField.setText(String.valueOf(waterRequired));
    costPerMile=randInt(4, 10);
    distanceBetweenLocations=randInt(40, 2000);
    totalCostofTransportation=waterRequired*costPerMile*distanceBetweenLocations;
    waterAllowedInterstate = totalCostofTransportation/waterRequired;
    perMileCostJTextField.setText(String.valueOf(costPerMile));
    distanceJTextField.setText(String.valueOf(distanceBetweenLocations));
    totalCostJTextField.setText(String.valueOf(totalCostofTransportation));
   
    }

    public double getTotalCostofTransportation() {
        return totalCostofTransportation;
    }
    
    
 private void checkDecision() {
        
        String decision="No";
        
        Enumeration<AbstractButton> buttons= interstateTransportationApproval.getElements();
        
        while (buttons.hasMoreElements())
         {
            JRadioButton approval= (JRadioButton) buttons.nextElement();
            if (approval.isSelected()) 
            {
                decision=approval.getText();
            }

         }
        
      if(decision.equals("Yes"))
      {
          request.setInterstateTransportCost(totalCostofTransportation);
          request.setInterStateDistance(distanceBetweenLocations);
      }
     
    }
}
