/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homestock;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Supaluk Jaroensuk
 */
public class Add_Item extends javax.swing.JFrame {

    /**
     * Creates new form AddItem
     */
    private String itemcode;
    private String itemname;
    private String itemdescription;
    private String itemprice;
    private String itemstocks;
    public Add_Item() {
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
        addItem = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addCode = new javax.swing.JTextField();
        addName = new javax.swing.JTextField();
        addDescription = new javax.swing.JTextField();
        addPrice = new javax.swing.JTextField();
        addStock = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        backIcon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        addItem.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        addItem.setForeground(new java.awt.Color(153, 153, 153));
        addItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/AddItemIcon.png"))); // NOI18N
        addItem.setText("Add Item");
        addItem.setBorder(null);

        jLabel1.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("ITEM CODE");

        jLabel2.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("ITEM NAME");

        jLabel3.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("DESCRIPTION");

        jLabel4.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("PRICE");

        jLabel5.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("STOCKS");

        addCode.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N

        addName.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N

        addDescription.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N

        addPrice.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N

        addStock.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N
        addStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addStockKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/BackIcon.png"))); // NOI18N
        backIcon.setBorder(null);
        backIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backIconActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addCode, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(addName, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(addDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backIcon)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(addCode, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(addName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(addDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(addStock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        itemcode = addCode.getText();
        itemname = addName.getText();
        itemprice = addPrice.getText();
        itemdescription = addDescription.getText();
        itemstocks = addStock.getText();
        String fileItem = "src/data/ItemsStock.txt";
        List<String> checkItem = new ArrayList<String>();
        List<String> checkName = new ArrayList<String>();
        if(itemcode == null || itemname == null || itemprice == null || itemdescription == null || itemstocks == null){
            JOptionPane.showMessageDialog(null , "Incomplete information");
            new Add_Item().setVisible(true);
            this.dispose();        
            
        }else{
            
            //read file for check namd admin
           BufferedReader br = null;
           BufferedReader br_name = null;
           try{
               File preRead = new File(fileItem);
               br = new BufferedReader(new FileReader(preRead));
               br_name = new BufferedReader(new FileReader(preRead));
               String line = "";
               int count = 0;
                while((line = br.readLine()) != null){
                    String[] str = line.split("/");                   
                    checkItem.add(count , str[0]);
                    checkName.add(count , str[1]);
                    count++;
                }
                
             br.close();
               
           }catch(IOException ioe){
             ioe.printStackTrace();
           }
           
           for(int i = 0 ; i < checkItem.size() ; i++){
               if(itemcode.equals(checkItem.get(i))){
                   while(true){
                        JTextField newCode = new JTextField();
                
                        Object[] message = {"Input new item code" ,newCode};

                        int option = JOptionPane.showConfirmDialog(null, message, "Item code is already taken.", JOptionPane.OK_CANCEL_OPTION);
                        String newCodeStr = newCode.getText();
                
                
                        if (option == JOptionPane.OK_OPTION) {
                            if (!newCodeStr.equals(itemcode)) {
                                JOptionPane.showMessageDialog(null, "Change item code = " + newCodeStr);
                                itemcode = newCodeStr;
                                break;
                            }            
                        }
                    }
                   
               }
           }
           
           for(int i = 0 ; i < checkName.size() ; i++){
              
               if(itemname.equals(checkName.get(i))){
                    while(true){
                        JTextField newName = new JTextField();
                
                        Object[] message = {"Input new item name" ,newName};

                        int option = JOptionPane.showConfirmDialog(null, message, "Item name is already taken.", JOptionPane.OK_CANCEL_OPTION);
                        String newNameStr = newName.getText();
                
                
                        if (option == JOptionPane.OK_OPTION) {
                            if (!newNameStr.equals(itemname)) {
                                JOptionPane.showMessageDialog(null, "Change item name = " + newNameStr);
                                itemname = newNameStr;
                                break;
                            }            
                        }
                    }    
               }        
                       
           }
            
           BufferedWriter bf =null;
           try{
               File file = new File("src/data/ItemsStock.txt");
               bf = new BufferedWriter(new FileWriter(file , true));
               
               bf.write(itemcode+"/"+itemname+"/"+itemdescription+"/"+itemprice+"/"+itemstocks);
               bf.write("\n");
               bf.close();
           }catch(Exception e){
               e.printStackTrace();
           } finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        }
        new ITEMS_ADMIN().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addStockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addStockKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        itemcode = addCode.getText();
        itemname = addName.getText();
        itemprice = addPrice.getText();
        itemdescription = addDescription.getText();
        itemstocks = addStock.getText();
        String fileItem = "src/data/ItemsStock.txt";
        List<String> checkItem = new ArrayList<String>();
        List<String> checkName = new ArrayList<String>();
        if(itemcode == null || itemname == null || itemprice == null || itemdescription == null || itemstocks == null){
            JOptionPane.showMessageDialog(null , "Incomplete information");
            new Add_Item().setVisible(true);
            this.dispose();        
            
        }else{
           double priceDouble = Double.parseDouble(itemprice);
           if(priceDouble <= 0){
               while(true){
                    JTextField newPriceText = new JTextField();               
                    Object[] message = {"Input new price" , newPriceText};

                    int option = JOptionPane.showConfirmDialog(null, message, "Price must be possitive", JOptionPane.OK_CANCEL_OPTION);
                    String newPriceStr = newPriceText.getText();
                    double newPrice = Double.parseDouble(newPriceStr);
                
                    if (option == JOptionPane.OK_OPTION) {
                        if (newPrice > 0) {
                            JOptionPane.showMessageDialog(null, "Change price = " + newPriceStr);
                            itemprice = newPriceStr;
                            break;
                        }            
                    }
                }
            }
           
           int stockDouble = Integer.parseInt(itemstocks);
           if(stockDouble < 0){
               while(true){
                    JTextField newStockText = new JTextField();               
                    Object[] message = {"Input new stock" , newStockText};

                    int option = JOptionPane.showConfirmDialog(null, message, "Stock must be possitive", JOptionPane.OK_CANCEL_OPTION);
                    String newStockStr = newStockText.getText();
                    int newStock = Integer.parseInt(newStockStr);
                
                    if (option == JOptionPane.OK_OPTION) {
                        if (newStock >= 0) {
                            JOptionPane.showMessageDialog(null, "Change price = " + newStockStr);
                            itemprice = newStockStr;
                            break;
                        }            
                    }
                }
            }
            
            //read file for check namd admin
           BufferedReader br = null;
           BufferedReader br_name = null;
           try{
               File preRead = new File(fileItem);
               br = new BufferedReader(new FileReader(preRead));
               br_name = new BufferedReader(new FileReader(preRead));
               String line = "";
               int count = 0;
                while((line = br.readLine()) != null){
                    String[] str = line.split("/");                   
                    checkItem.add(count , str[0]);
                    checkName.add(count , str[1]);
                    count++;
                }
                
             br.close();
               
           }catch(IOException ioe){
             ioe.printStackTrace();
           }
           
           for(int i = 0 ; i < checkItem.size() ; i++){
               if(itemcode.equals(checkItem.get(i))){
                   while(true){
                        JTextField newCode = new JTextField();
                
                        Object[] message = {"Input new item code" ,newCode};

                        int option = JOptionPane.showConfirmDialog(null, message, "Item code is already taken.", JOptionPane.OK_CANCEL_OPTION);
                        String newCodeStr = newCode.getText();
                
                
                        if (option == JOptionPane.OK_OPTION) {
                            if (!newCodeStr.equals(itemcode)) {
                                JOptionPane.showMessageDialog(null, "Change item code = " + newCodeStr);
                                itemcode = newCodeStr;
                                break;
                            }            
                        }
                    }
                   
               }
           }
           
           for(int i = 0 ; i < checkName.size() ; i++){
              
               if(itemname.equals(checkName.get(i))){
                    while(true){
                        JTextField newName = new JTextField();
                
                        Object[] message = {"Input new item name" ,newName};

                        int option = JOptionPane.showConfirmDialog(null, message, "Item name is already taken.", JOptionPane.OK_CANCEL_OPTION);
                        String newNameStr = newName.getText();
                
                
                        if (option == JOptionPane.OK_OPTION) {
                            if (!newNameStr.equals(itemname)) {
                                JOptionPane.showMessageDialog(null, "Change item name = " + newNameStr);
                                itemname = newNameStr;
                                break;
                            }            
                        }
                    }    
               }        
                       
           }
            
           BufferedWriter bf =null;
           try{
               File file = new File("src/data/ItemsStock.txt");
               bf = new BufferedWriter(new FileWriter(file , true));
               
               bf.write(itemcode+"/"+itemname+"/"+itemdescription+"/"+itemprice+"/"+itemstocks);
               bf.write("\n");
               bf.close();
           }catch(Exception e){
               e.printStackTrace();
           } finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        }
        new ITEMS_ADMIN().setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_addStockKeyPressed

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
            java.util.logging.Logger.getLogger(Add_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Item.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Item().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addCode;
    private javax.swing.JTextField addDescription;
    private javax.swing.JButton addItem;
    private javax.swing.JTextField addName;
    private javax.swing.JTextField addPrice;
    private javax.swing.JTextField addStock;
    private javax.swing.JButton backIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}