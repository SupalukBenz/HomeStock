/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homestock;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Supaluk Jaroensuk
 */
public class CancelItem extends javax.swing.JFrame {
    private String cancelcodeItem;
    /**
     * Creates new form AddItem
     */
    public CancelItem() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        itemcode = new javax.swing.JTextField();
        CancelItemEnter = new javax.swing.JButton();
        cancelItem = new javax.swing.JButton();
        backIcon = new javax.swing.JButton();
        backIcon1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ITEM CODE");

        itemcode.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N
        itemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcodeActionPerformed(evt);
            }
        });
        itemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemcodeKeyPressed(evt);
            }
        });

        CancelItemEnter.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        CancelItemEnter.setText("ENTER");
        CancelItemEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelItemEnterActionPerformed(evt);
            }
        });

        cancelItem.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        cancelItem.setForeground(new java.awt.Color(153, 153, 153));
        cancelItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/CancelIcon.png"))); // NOI18N
        cancelItem.setText("Cancel Item");
        cancelItem.setBorder(null);

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/BackIcon.png"))); // NOI18N
        backIcon.setBorder(null);
        backIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backIconActionPerformed(evt);
            }
        });

        backIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/BackIcon.png"))); // NOI18N
        backIcon1.setBorder(null);
        backIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backIcon1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(CancelItemEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(cancelItem, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backIcon)
                        .addGap(28, 28, 28)
                        .addComponent(backIcon1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(cancelItem)
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(itemcode, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(CancelItemEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backIcon)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backIcon1)
                        .addGap(39, 39, 39))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(500, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backIconActionPerformed
        new ITEMS_ADMIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backIconActionPerformed

    private void CancelItemEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelItemEnterActionPerformed
        String FILE_ITEMS = "src/data/ItemsStock.txt";
        cancelcodeItem = itemcode.getText();
        
        if(cancelcodeItem == null){
            JOptionPane.showMessageDialog(null , "Incomplete information");
            new CancelItem().setVisible(true);
            this.dispose(); 
        }
        
        try {
            File inFile = new File(FILE_ITEMS);
            int count = 0;
            //Construct the new file that will later be renamed to the original filename. 
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader(FILE_ITEMS));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line ;
            String lineToRemove = "";
            //Read from the original file and write to the new 
            //unless content matches data to be removed.
            while ((line = br.readLine()) != null) {
                if(count != 0){
                    String[] str = line.split("/");
                    if(str[0].equals(cancelcodeItem)){
                        lineToRemove = str[0]+"/"+str[1]+"/"+str[2]+"/"+str[3]+"/"+str[4];
                    }
                }
                
                if (!line.trim().equals(lineToRemove)) {
                    pw.println(line);
                    pw.flush();
                }
                count++;
            }
            pw.close();
            br.close();
 
            //Delete the original file
            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }
            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inFile))
                System.out.println("Could not rename file");
 
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        new ITEMS_ADMIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelItemEnterActionPerformed

    private void itemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcodeActionPerformed

    private void itemcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcodeKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String FILE_ITEMS = "src/data/ItemsStock.txt";
        cancelcodeItem = itemcode.getText();
        
        if(cancelcodeItem == null){
            JOptionPane.showMessageDialog(null , "Incomplete information");
            new CancelItem().setVisible(true);
            this.dispose(); 
        }
        
        try {
            File inFile = new File(FILE_ITEMS);
            int count = 0;
            //Construct the new file that will later be renamed to the original filename. 
            File tempFile = new File(inFile.getAbsolutePath() + ".tmp");
            BufferedReader br = new BufferedReader(new FileReader(FILE_ITEMS));
            PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
            String line ;
            String lineToRemove = "";
            //Read from the original file and write to the new 
            //unless content matches data to be removed.
            while ((line = br.readLine()) != null) {
                if(count != 0){
                    String[] str = line.split("/");
                    if(str[0].equals(cancelcodeItem)){
                        lineToRemove = str[0]+"/"+str[1]+"/"+str[2]+"/"+str[3]+"/"+str[4];
                    }
                }
                
                if (!line.trim().equals(lineToRemove)) {
                    pw.println(line);
                    pw.flush();
                }
                count++;
            }
            pw.close();
            br.close();
 
            //Delete the original file
            if (!inFile.delete()) {
                System.out.println("Could not delete file");
                return;
            }
            //Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(inFile))
                System.out.println("Could not rename file");
 
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        new ITEMS_ADMIN().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_itemcodeKeyPressed

    private void backIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backIcon1ActionPerformed
        new ITEMS_ADMIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backIcon1ActionPerformed

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
            java.util.logging.Logger.getLogger(CancelItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelItemEnter;
    private javax.swing.JButton backIcon;
    private javax.swing.JButton backIcon1;
    private javax.swing.JButton cancelItem;
    private javax.swing.JTextField itemcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
