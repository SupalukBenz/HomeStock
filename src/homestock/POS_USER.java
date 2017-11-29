/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homestock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
      
/**
 *
 * @author Supaluk Jaroensuk
 */
public class POS_USER extends javax.swing.JFrame {

    /**
     * Creates new form POS_USER
     */
    private int x = 0;
    
    private String itemCode , quantity;
    private int  quantityInt;
    private String itemName = "";
    private String itemPriceStr = "";
    private double itemPrice = 0;
    private String stocks = "";
    private double total = 0;
    private int stocksTotal = 0;
    private String stocksTotalStr = "";
    public POS_USER() {
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
        Proceed = new javax.swing.JButton();
        addToCart = new javax.swing.JButton();
        romoveToCard = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stocksTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        QtyInput = new javax.swing.JLabel();
        searchItem = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        qtyItem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 240, 230));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/HomeStockIcon-100px.png"))); // NOI18N

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        backIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/BackIcon.png"))); // NOI18N
        backIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backIconActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Heiti SC", 1, 22)); // NOI18N
        jLabel5.setText("USER");

        jLabel4.setFont(new java.awt.Font("Heiti SC", 1, 18)); // NOI18N
        jLabel4.setText("Status");

        Proceed.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        Proceed.setForeground(new java.awt.Color(153, 153, 153));
        Proceed.setText("Proceed");
        Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProceedActionPerformed(evt);
            }
        });

        addToCart.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        addToCart.setForeground(new java.awt.Color(153, 153, 153));
        addToCart.setText("Add to cart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        romoveToCard.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        romoveToCard.setForeground(new java.awt.Color(153, 153, 153));
        romoveToCard.setText("Remove");
        romoveToCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                romoveToCardActionPerformed(evt);
            }
        });

        stocksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item code", "Item name", "Quantity", "Price", "Total"
            }
        ));
        jScrollPane1.setViewportView(stocksTable);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Photos/Horizontal-Line-Transparent-Background.png"))); // NOI18N

        QtyInput.setFont(new java.awt.Font("Heiti SC", 0, 24)); // NOI18N

        searchItem.setFont(new java.awt.Font("Heiti SC", 0, 24)); // NOI18N
        searchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchItemActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Item code");

        qtyItem.setFont(new java.awt.Font("Heiti SC", 0, 24)); // NOI18N
        qtyItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyItemActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Quantity");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backIcon)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 948, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(addToCart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7)
                                    .addComponent(qtyItem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(romoveToCard)))
                .addGap(0, 22, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(QtyInput)
                .addGap(676, 676, 676))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(searchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(qtyItem, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(romoveToCard)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(QtyInput)
                        .addGap(10, 10, 10)
                        .addComponent(backIcon)
                        .addGap(42, 42, 42))))
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

    private void searchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchItemActionPerformed
        
    }//GEN-LAST:event_searchItemActionPerformed

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        
        itemCode = searchItem.getText();
        quantity = qtyItem.getText();
        
       
        quantityInt = Integer.parseInt(quantity);
        
        //read file for search item code and get data
        BufferedReader br = null;
        BufferedReader check = null;
        String checkStr = null;
        String FILE_ITEMS = "/data/ItemsStock.txt";
        
        int y = 0;   
            //Read File Line By Line 
       try{
            
            InputStream in = getClass().getResourceAsStream(FILE_ITEMS);
            br = new BufferedReader(new InputStreamReader(in));
            Object[] tableLines = br.lines().toArray();
            String[] saveData = new String[5];
            int count = 0;
                for(int i = 0 ; i < tableLines.length ; i++){
                    String line = tableLines[i].toString().trim();
                    String[] split = line.split("/");
                    if(split[0].equals(itemCode)){
                        
                        for(String str : split){
                            saveData[count] = str;
                            count++;
                        }
                        break;
                    }
                }
            
            itemName = saveData[1];
            itemPriceStr= saveData[3];
            itemPrice = Double.parseDouble(saveData[3]);            
            stocks = saveData[4];
            
            
            int stocksInt = Integer.parseInt(stocks);
            stocksTotal = stocksInt - quantityInt;
            stocksTotalStr = String.valueOf(stocksTotal);
            total = itemPrice * quantityInt;
            
            if(stocksTotal < 0 || quantity.equals("0")){
                while(true){
                JTextField newQty = new JTextField();
                
                Object[] message = {"Stock not enought :", newQty,};

                int option = JOptionPane.showConfirmDialog(null, message, "Input quantity again", JOptionPane.OK_CANCEL_OPTION);
                String qtyStr = newQty.getText();
                int newQtyInt = Integer.parseInt(qtyStr);
                
                if (option == JOptionPane.OK_OPTION) {
                    if (newQtyInt <= stocksInt) {
                        JOptionPane.showMessageDialog(null, "Change quantity = " + newQtyInt);
                        quantityInt = newQtyInt;
                        stocksTotal = stocksInt - quantityInt;
                        stocksTotalStr = String.valueOf(stocksTotal);
                        total = itemPrice * quantityInt;
                        break;
                    }            
                }
               }
            }
        
        
            
            //show in table
            DefaultTableModel table = (DefaultTableModel)stocksTable.getModel();
            table.addRow(new Object[]{itemCode,itemName,quantityInt,itemPriceStr,total});
            
            
        }catch(Exception ex){
                JOptionPane.showMessageDialog(null , "Not Item");
                y=1;
                
            }finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
        
        
        
        
        
           //edit quantity in file text
           
           String FILE_ITEMForEdit = "src/data/ItemsStock.txt";
           try{
             
             File file = new File(FILE_ITEMForEdit);
             BufferedReader readerForEdit = new BufferedReader(new FileReader(file));
            
             String line = "", oldtext = "",find = "",old = "";
             int a = 0;
             
             while((line = readerForEdit.readLine()) != null){
                   
                        String[] str = line.split("/");
                        
                        if(str[0].equals(itemCode)){
                            old = str[0] + "/" + str[1] + "/" + str[2] + "/" + str[3] + "/" + str[4];
                            
                            find =  line.replace(str[3]+"/"+str[4], str[3]+"/"+stocksTotalStr);
                            a++;
                            
                        }
                
                 oldtext += line + "\r\n";
                 
             }
             readerForEdit.close();
             
             //To replace a line in a file
             String newtext = oldtext.replaceAll(old, find);
            
             FileWriter writer = new FileWriter(FILE_ITEMForEdit);
             writer.write(newtext);writer.close();
            
         }
            
         catch (IOException ioe){
             ioe.printStackTrace();
         }
           
          
    }//GEN-LAST:event_addToCartActionPerformed

   
    private void qtyItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyItemActionPerformed
        
    }//GEN-LAST:event_qtyItemActionPerformed

    private void backIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backIconActionPerformed
        new HomePageForUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backIconActionPerformed

    private void romoveToCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_romoveToCardActionPerformed
        DefaultTableModel table = (DefaultTableModel)stocksTable.getModel();
        table.removeRow(stocksTable.getSelectedRow());
        
    }//GEN-LAST:event_romoveToCardActionPerformed

    private void ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProceedActionPerformed
        //save data to text file
        String FILE_SALES = "src/data/Sales.txt";
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        String date = dtf.format(localDate);
        TableModel m = stocksTable.getModel();
        
        BufferedWriter bw_sales = null;
        
        try{
                
               File file_sales = new File(FILE_SALES);
               
               double amount = 0;
               
               bw_sales = new BufferedWriter(new FileWriter(FILE_SALES , true));   
                             
                for(int i = 0 ; i < m.getRowCount() ; i++){
                    for(int j = 0 ; j < m.getColumnCount() ; j++){                        
                        if(j == 4){
                            bw_sales.write(m.getValueAt(i, j).toString());
                            bw_sales.write("\n");
                            
                            amount += Double.parseDouble(m.getValueAt(i, j).toString());
                        }else{
                            if(j == 0){
                                bw_sales.write(date + "," + m.getValueAt(i, j).toString() + ",");
                                
                            }else{
                                bw_sales.write(m.getValueAt(i, j).toString() + ",");
                                
                            }
                        }                        
                        
                    }
                }
                while(true){
                JTextField paid = new JTextField();
                
                Object[] message = {"Total : " + amount + "\n Paid : " , paid};

                int option = JOptionPane.showConfirmDialog(null, message, "Amount paid : ", JOptionPane.OK_CANCEL_OPTION);
                String paidStr = paid.getText();
                double paidTotal = Double.parseDouble(paidStr);
                double change = paidTotal - amount;
                
                if (option == JOptionPane.OK_OPTION) {
                    if (paidTotal >= amount) {
                        JOptionPane.showMessageDialog(null, "Change : " + change);
                        break;
                    }else{
                        JOptionPane.showMessageDialog(null , "Money not enough.");
                    }
                }
                }
        
        }catch(Exception e){
               e.printStackTrace();
           } finally {
			try {
				bw_sales.close();
                                
			} catch (IOException e) {
				
				e.printStackTrace();
			}
         
        }
        new POS_USER().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProceedActionPerformed

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
            java.util.logging.Logger.getLogger(POS_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POS_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POS_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POS_USER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POS_USER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proceed;
    private javax.swing.JLabel QtyInput;
    private javax.swing.JButton addToCart;
    private javax.swing.JButton backIcon;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton minimize;
    private javax.swing.JTextField qtyItem;
    private javax.swing.JButton romoveToCard;
    private javax.swing.JTextField searchItem;
    private javax.swing.JTable stocksTable;
    // End of variables declaration//GEN-END:variables
}
