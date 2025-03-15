/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bloodtestscheduler;

/**
 *BloodTestSchedulerGUI.java
 *13th March 2025
 *@author Murilo Batiuk
 */
public class BloodTestSchedulerGUI extends javax.swing.JFrame {
    
    private final BloodTestPriorityQ pq;
    
    private final BloodTestSchedulerQueue qq;
    
    /**
     * Creates new form BloodTestSchedulerGUI
     */
    public BloodTestSchedulerGUI() {
        initComponents();      
        
        pq = new BloodTestPriorityQ();
        pq.enqueue(1, "Bernard Fahey", "65", "YES", "Dr. John Kelly");
        pq.enqueue(2, "Mary O'Connell", "25", "NO", "Dr. Sarah Murphy");
        pq.enqueue(3, "Marion Sullivan", "36", "NO", "Dr. Emma Doyle");
        pq.enqueue(2, "Sean Murphy", "42", "YES", "Dr. Michael Byrne");
        pq.enqueue(1, "Niamh O'Neill", "29", "NO", "Dr. Laura Gallagher");
        pq.enqueue(3, "Patrick McCarthy", "58", "YES", "Dr. David Walsh");
        pq.enqueue(1, "Aoife Doyle", "33", "NO", "Dr. Rachel Nolan");
        pq.enqueue(3, "Eoin Kelly", "47", "YES", "Dr. Peter Fitzpatrick");
        pq.enqueue(2, "Siobhan Byrne", "31", "NO", "Dr. Anna O'Brien");
        pq.enqueue(1, "Conor Fitzgerald", "22", "YES", "Dr. Mark Brennan");
        pq.enqueue(2, "Grainne Brennan", "39", "NO", "Dr. Lisa Doyle");
        pq.enqueue(3, "Ciaran Gallagher", "50", "YES", "Dr. James Ryan");
        pq.enqueue(1, "Orla Quinn", "27", "NO", "Dr. Emily Farrell");
        pq.enqueue(2, "Fiona McDonagh", "41", "YES", "Dr. Brian Keane");
        pq.enqueue(3, "Liam O'Sullivan", "63", "NO", "Dr. Catherine Murray");
        
        qq = new BloodTestSchedulerQueue();
        qq.enqueue(1, "Bernard Fahey", "65", "YES", "Dr. John Kelly");
        qq.enqueue(2, "Mary O'Connell", "25", "NO", "Dr. Sarah Murphy");
        qq.enqueue(3, "Marion Sullivan", "36", "NO", "Dr. Emma Doyle");
        qq.enqueue(2, "Sean Murphy", "42", "YES", "Dr. Michael Byrne");
        qq.enqueue(1, "Niamh O'Neill", "29", "NO", "Dr. Laura Gallagher");
        qq.enqueue(3, "Patrick McCarthy", "58", "YES", "Dr. David Walsh");
        qq.enqueue(1, "Aoife Doyle", "33", "NO", "Dr. Rachel Nolan");
        qq.enqueue(3, "Eoin Kelly", "47", "YES", "Dr. Peter Fitzpatrick");
        qq.enqueue(2, "Siobhan Byrne", "31", "NO", "Dr. Anna O'Brien");
        qq.enqueue(1, "Conor Fitzgerald", "22", "YES", "Dr. Mark Brennan");
        qq.enqueue(2, "Grainne Brennan", "39", "NO", "Dr. Lisa Doyle");
        qq.enqueue(3, "Ciaran Gallagher", "50", "YES", "Dr. James Ryan");
        qq.enqueue(1, "Orla Quinn", "27", "NO", "Dr. Emily Farrell");
        qq.enqueue(2, "Fiona McDonagh", "41", "YES", "Dr. Brian Keane");
        qq.enqueue(3, "Liam O'Sullivan", "63", "NO", "Dr. Catherine Murray");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLBL = new javax.swing.JLabel();
        exitBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTA = new javax.swing.JTextArea();
        arrivalorderBTN = new javax.swing.JButton();
        priorityBTN = new javax.swing.JButton();
        captionLBL = new javax.swing.JLabel();
        displaylastfiveBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLBL.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLBL.setText("BLOOD TEST SCHEDULER");

        exitBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        exitBTN.setText("EXIT");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        displayTA.setColumns(20);
        displayTA.setRows(5);
        jScrollPane1.setViewportView(displayTA);

        arrivalorderBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        arrivalorderBTN.setText("Display List by Arrival Order");
        arrivalorderBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrivalorderBTNActionPerformed(evt);
            }
        });

        priorityBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        priorityBTN.setText("Display Priority List");
        priorityBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityBTNActionPerformed(evt);
            }
        });

        captionLBL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        captionLBL.setText("Priority List: 1 - Urgent / 2 - Medium / 3 - Low");

        displaylastfiveBTN.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        displaylastfiveBTN.setText("Display Last Five People on the List");
        displaylastfiveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaylastfiveBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitBTN)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(priorityBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(captionLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(arrivalorderBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(displaylastfiveBTN)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(titleLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLBL)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priorityBTN)
                    .addComponent(arrivalorderBTN)
                    .addComponent(displaylastfiveBTN))
                .addGap(48, 48, 48)
                .addComponent(captionLBL)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(exitBTN)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_exitBTNActionPerformed

    private void priorityBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityBTNActionPerformed
        // TODO add your handling code here:
        
        displayTA.setText(pq.printPQueue());
        
    }//GEN-LAST:event_priorityBTNActionPerformed

    private void arrivalorderBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrivalorderBTNActionPerformed
        // TODO add your handling code here:
        
        displayTA.setText(qq.displayQueue());
        
    }//GEN-LAST:event_arrivalorderBTNActionPerformed

    private void displaylastfiveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaylastfiveBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displaylastfiveBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTestSchedulerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTestSchedulerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arrivalorderBTN;
    private javax.swing.JLabel captionLBL;
    private javax.swing.JTextArea displayTA;
    private javax.swing.JButton displaylastfiveBTN;
    private javax.swing.JButton exitBTN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton priorityBTN;
    private javax.swing.JLabel titleLBL;
    // End of variables declaration//GEN-END:variables
}
