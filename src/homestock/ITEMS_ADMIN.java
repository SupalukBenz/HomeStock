/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homestock;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Supaluk Jaroensuk
 */
public class ITEMS_ADMIN extends javax.swing.JFrame {
    private int countTotalItems;
    private String convertTotal;
    private int x = 0;

    /**
     * Creates new form ITEMS_ADMIN
     */
    public ITEMS_ADMIN() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        minimize = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        backIcon = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addItem = new javax.swing.JButton();
        cancelItem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        StocksTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalItem = new javax.swing.JTextField();
        show = new javax.swing.JButton();
        AddStocks = new javax.swing.JButton();
        refresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 240, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/HomeStockIcon-100px.png"))); // NOI18N

        minimize.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        minimize.setForeground(new java.awt.Color(102, 204, 255));
        minimize.setText("-");
        minimize.setBorder(null);
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizeActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 204, 255));
        exit.setText("X");
        exit.setBorder(null);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Herculanum", 0, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Home Stock");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addComponent(minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exit)
                            .addComponent(minimize)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/BackIcon.png"))); // NOI18N
        backIcon.setBorder(null);
        backIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backIconActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Heiti SC", 1, 22)); // NOI18N
        jLabel5.setText("ADMIN");

        jLabel4.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel4.setText("Status");

        addItem.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        addItem.setForeground(new java.awt.Color(153, 153, 153));
        addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/AddItemIcon.png"))); // NOI18N
        addItem.setText("Add Item");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
            }
        });

        cancelItem.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        cancelItem.setForeground(new java.awt.Color(153, 153, 153));
        cancelItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/CancelIcon.png"))); // NOI18N
        cancelItem.setText("Cancel Item");
        cancelItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelItemActionPerformed(evt);
            }
        });

        StocksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item code", "Item name", "Description", "Price", "Stocks"
            }
        ));
        jScrollPane1.setViewportView(StocksTable);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/Horizontal-Line-Transparent-Background.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel6.setText("TOTAL ITEMS");

        totalItem.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        totalItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalItemActionPerformed(evt);
            }
        });

        show.setFont(new java.awt.Font("Heiti SC", 1, 36)); // NOI18N
        show.setForeground(new java.awt.Color(102, 102, 102));
        show.setText("SHOW TABLE");
        show.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        AddStocks.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        AddStocks.setForeground(new java.awt.Color(153, 153, 153));
        AddStocks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/TotalItemsIcon.png"))); // NOI18N
        AddStocks.setText("Add stocks");
        AddStocks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStocksActionPerformed(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/refreshIcon.png"))); // NOI18N
        refresh.setBorder(null);
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(totalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(72, 72, 72))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(AddStocks, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cancelItem))
                                                .addGap(16, 16, 16))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(addItem)
                                                    .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel6)
                                    .addGap(64, 64, 64)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGap(529, 529, 529)
                                    .addComponent(jLabel4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addGap(30, 30, 30))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(refresh)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backIcon)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalItem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddStocks, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelItem)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(backIcon)
                        .addGap(14, 14, 14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(refresh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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

        setSize(new java.awt.Dimension(1000, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizeActionPerformed
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        new Add_Item().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addItemActionPerformed

    private void cancelItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelItemActionPerformed
        new CancelItem().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelItemActionPerformed

    private void backIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backIconActionPerformed
        new HomePage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backIconActionPerformed

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        
        if(x >= 1){
            show.setEnabled(false);
        }else{    
        String FILE_ACCOUNT = "/data/ItemsStock.txt";
        
        try{

            InputStream in = getClass().getResourceAsStream(FILE_ACCOUNT);

            BufferedReader br = new BufferedReader(new InputStreamReader(in));


            DefaultTableModel tableAccount = (DefaultTableModel)StocksTable.getModel();
            
            //Read File Line By Line

            Object[] tableLines = br.lines().toArray();

            for(int i = 0 ; i < tableLines.length ; i++){
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                tableAccount.addRow(dataRow);
                countTotalItems++;
            }
            

        }catch(Exception ex){
            ex.printStackTrace();
        }
        convertTotal = String.valueOf(countTotalItems);
        totalItem.setText(convertTotal);
        }
        x++;

    }//GEN-LAST:event_showActionPerformed

    private void AddStocksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStocksActionPerformed
         new Add_stocks().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_AddStocksActionPerformed

    private void totalItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalItemActionPerformed
        
    }//GEN-LAST:event_totalItemActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        new ITEMS_ADMIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_refreshActionPerformed

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
            java.util.logging.Logger.getLogger(ITEMS_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ITEMS_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ITEMS_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ITEMS_ADMIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ITEMS_ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddStocks;
    private javax.swing.JTable StocksTable;
    private javax.swing.JButton addItem;
    private javax.swing.JButton backIcon;
    private javax.swing.JButton cancelItem;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minimize;
    private javax.swing.JButton refresh;
    private javax.swing.JButton show;
    private javax.swing.JTextField totalItem;
    // End of variables declaration//GEN-END:variables
}