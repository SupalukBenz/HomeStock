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
public class Add_account extends javax.swing.JFrame {

    /**
     * Creates new form Add_account
     */
    public String chooseAccess;
    public List<String> addAccountList;
    public List<String> AccountListSep;
    private String user;
    private String password;
    private String access;
    private String firstname;
    private String lastname;
    private String age;
    
    
    public Add_account() {
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

        AgeAdd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addAccount = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        backIcon1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AddUsername = new javax.swing.JTextField();
        AddPassword = new javax.swing.JTextField();
        FirstnameAdd = new javax.swing.JTextField();
        LastnameAdd = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AgeAdd.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N
        AgeAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                AgeAddKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jButton1.setText("ENTER");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("USERNAME");

        addAccount.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        addAccount.setForeground(new java.awt.Color(153, 153, 153));
        addAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/loginIconRegis.png"))); // NOI18N
        addAccount.setText("Add Account");
        addAccount.setBorder(null);
        addAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAccountActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("PASSWORD");

        jLabel3.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("FIRST NAME");

        jLabel4.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("LAST NAME");

        backIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/homestock/Photos/BackIcon.png"))); // NOI18N
        backIcon1.setBorder(null);
        backIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backIcon1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Heiti SC", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("AGE");

        AddUsername.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N
        AddUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUsernameActionPerformed(evt);
            }
        });

        AddPassword.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N

        FirstnameAdd.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N

        LastnameAdd.setFont(new java.awt.Font("Heiti SC", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(addAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backIcon1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AddUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AddPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FirstnameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastnameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AgeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(addAccount)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(AddUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(AddPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(FirstnameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(LastnameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(AgeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(backIcon1)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(500, 672));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        user = AddUsername.getText();
        password = AddPassword.getText();
        
        firstname = FirstnameAdd.getText();
        lastname = LastnameAdd.getText();
        age = AgeAdd.getText();
        String fileUser = "src/data/Username.txt";
        List<String> checkName = new ArrayList<String>();
        if(user == null || password == null || firstname == null || lastname == null || age == null){
            JOptionPane.showMessageDialog(null , "Incomplete information");
            new Add_account().setVisible(true);
            this.dispose();   
            
        }else{
            
           //read file for check namd admin
           BufferedReader br = null;
           try{
               File preRead = new File(fileUser);
               br = new BufferedReader(new FileReader(preRead));
               String line = "";
               int count = 0;
                while((line = br.readLine()) != null){
                    String[] str = line.split("/");                   
                    checkName.add(count , str[0]);
                    count++;
                }
                
             br.close();
               
           }catch(IOException ioe){
             ioe.printStackTrace();
           }
           
           for(int i = 0 ; i < checkName.size() ; i++){
               if(user.equals(checkName.get(i))){
                   while(true){
                        JTextField newUser = new JTextField();
                
                        Object[] message = {"Input new username" , newUser};

                        int option = JOptionPane.showConfirmDialog(null, message, "Username is already taken.", JOptionPane.OK_CANCEL_OPTION);
                        String newUserStr = newUser.getText();
                
                
                        if (option == JOptionPane.OK_OPTION) {
                            if (!newUserStr.equals(user)) {
                                JOptionPane.showMessageDialog(null, "Change username = " + newUserStr);
                                user = newUserStr;
                                break;
                            }            
                        }
                    }
                   
               }
           }
            
           //write to file
           BufferedWriter bf =null;
           try{
               File file = new File(fileUser);
               bf = new BufferedWriter(new FileWriter(file , true));
               
               bf.write(user+"/"+password+"/"+"Admin"+"/"+firstname+"/"+lastname+"/"+age);
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
        new ACCOUNT_ADMIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAccountActionPerformed

    }//GEN-LAST:event_addAccountActionPerformed

    private void backIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backIcon1ActionPerformed
        new ACCOUNT_ADMIN().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backIcon1ActionPerformed

    private void AddUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddUsernameActionPerformed

    private void AgeAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AgeAddKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        user = AddUsername.getText();
        password = AddPassword.getText();
        
        firstname = FirstnameAdd.getText();
        lastname = LastnameAdd.getText();
        age = AgeAdd.getText();
        String fileUser = "src/data/Username.txt";
        List<String> checkName = new ArrayList<String>();
        if(user == null || password == null || firstname == null || lastname == null || age == null){
            JOptionPane.showMessageDialog(null , "Incomplete information");
            new Add_account().setVisible(true);
            this.dispose();   
            
        }else{
            
           //read file for check namd admin
           BufferedReader br = null;
           try{
               File preRead = new File(fileUser);
               br = new BufferedReader(new FileReader(preRead));
               String line = "";
               int count = 0;
                while((line = br.readLine()) != null){
                    String[] str = line.split("/");                   
                    checkName.add(count , str[0]);
                    count++;
                }
                
             br.close();
               
           }catch(IOException ioe){
             ioe.printStackTrace();
           }
           
           for(int i = 0 ; i < checkName.size() ; i++){
               if(user.equals(checkName.get(i))){
                   while(true){
                        JTextField newUser = new JTextField();
                
                        Object[] message = {"Input new username" , newUser};

                        int option = JOptionPane.showConfirmDialog(null, message, "Username is already taken.", JOptionPane.OK_CANCEL_OPTION);
                        String newUserStr = newUser.getText();
                
                
                        if (option == JOptionPane.OK_OPTION) {
                            if (!newUserStr.equals(user)) {
                                JOptionPane.showMessageDialog(null, "Change username = " + newUserStr);
                                user = newUserStr;
                                break;
                            }            
                        }
                    }
                   
               }
           }
            
           //write to file
           BufferedWriter bf =null;
           try{
               File file = new File(fileUser);
               bf = new BufferedWriter(new FileWriter(file , true));
               
               bf.write(user+"/"+password+"/"+"Admin"+"/"+firstname+"/"+lastname+"/"+age);
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
        new ACCOUNT_ADMIN().setVisible(true);
        this.dispose();user = AddUsername.getText();
        password = AddPassword.getText();
        
        firstname = FirstnameAdd.getText();
        lastname = LastnameAdd.getText();
        age = AgeAdd.getText();
        String fileUser1 = "src/data/Username.txt";
        List<String> checkName1 = new ArrayList<String>();
        if(user == null || password == null || firstname == null || lastname == null || age == null){
            JOptionPane.showMessageDialog(null , "Incomplete information");
            new Add_account().setVisible(true);
            this.dispose();   
            
        }else{
            
           //read file for check namd admin
           BufferedReader br = null;
           try{
               File preRead = new File(fileUser1);
               br = new BufferedReader(new FileReader(preRead));
               String line = "";
               int count = 0;
                while((line = br.readLine()) != null){
                    String[] str = line.split("/");                   
                    checkName1.add(count , str[0]);
                    count++;
                }
                
             br.close();
               
           }catch(IOException ioe){
             ioe.printStackTrace();
           }
           
           for(int i = 0 ; i < checkName1.size() ; i++){
               if(user.equals(checkName1.get(i))){
                   while(true){
                        JTextField newUser = new JTextField();
                
                        Object[] message = {"Input new username" , newUser};

                        int option = JOptionPane.showConfirmDialog(null, message, "Username is already taken.", JOptionPane.OK_CANCEL_OPTION);
                        String newUserStr = newUser.getText();
                
                
                        if (option == JOptionPane.OK_OPTION) {
                            if (!newUserStr.equals(user)) {
                                JOptionPane.showMessageDialog(null, "Change username = " + newUserStr);
                                user = newUserStr;
                                break;
                            }            
                        }
                    }
                   
               }
           }
            
           //write to file
           BufferedWriter bf =null;
           try{
               File file = new File(fileUser);
               bf = new BufferedWriter(new FileWriter(file , true));
               
               bf.write(user+"/"+password+"/"+"Admin"+"/"+firstname+"/"+lastname+"/"+age);
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
        new ACCOUNT_ADMIN().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_AgeAddKeyPressed

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
            java.util.logging.Logger.getLogger(Add_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_account().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddPassword;
    public javax.swing.JTextField AddUsername;
    private javax.swing.JTextField AgeAdd;
    private javax.swing.JTextField FirstnameAdd;
    private javax.swing.JTextField LastnameAdd;
    private javax.swing.JButton addAccount;
    private javax.swing.JButton backIcon1;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}