/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import Model.User;
import Control.Control_User;
import javax.swing.JOptionPane;
/**
 *
 * @author khaaz
 */
public class Login_Menu extends javax.swing.JFrame {
    private static String Start_Time;
    private static String End_Time;
    private String password_true = "";
    private boolean status = false;
    private Control_User Ctl_user = new Control_User();
    public String getUser_name()
    {
        return user_name.getText();
    }
    public String getPassword()
    {
        return this.password_true;
    }
    static public String getStart()
    {
        return Login_Menu.Start_Time;
    }
    static public String getEnd()
    {
        return Login_Menu.End_Time;
    }
    static public void setStart(String Time)
    {
        Login_Menu.Start_Time = Time;
    }
    static public void setEnd(String Time)
    {
        Login_Menu.End_Time = Time;
    }
    /**
     * Creates new form Login_Menu
     */
    private void encrypt_password() {

        String new_password = password.getText();
        if(new_password.length()>this.password_true.length())
        {
            this.password_true += new_password.charAt(new_password.length()-1);
        }
        else if (new_password.length()==this.password_true.length())
        {
            
        } 
        else {
            String new_pass = "";
            for(int pos = 0;pos<this.password_true.length()-1;pos++)
            {
                new_pass+=this.password_true.charAt(pos);
            }
            this.password_true = new_pass;
        }
        
        String password_alt = "";
        for (int pos = 0; pos < this.password_true.length(); pos++) {
            password_alt += "*";
        }
        password.setText(password_alt);
        //System.out.println(this.password_true);
    }

    private void decrypt_password() {
        password.setText(password_true);
    }

    public Login_Menu() {
        initComponents();
        //this.eve_user = new EventUser();
        this.LoginBut.setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        user_name = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        encrypt_button = new javax.swing.JToggleButton();
        LoginBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login");

        jLabel2.setText("Password");

        user_name.setForeground(new java.awt.Color(204, 204, 204));
        user_name.setText("user name");
        user_name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_nameMouseClicked(evt);
            }
        });
        user_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_nameActionPerformed(evt);
            }
        });

        password.setForeground(new java.awt.Color(204, 204, 204));
        password.setText("password");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });

        encrypt_button.setText("👁️");
        encrypt_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encrypt_buttonActionPerformed(evt);
            }
        });

        LoginBut.setText("Login");
        LoginBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoginBut)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(user_name, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(encrypt_button)))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(encrypt_button))
                .addGap(50, 50, 50)
                .addComponent(LoginBut)
                .addContainerGap(254, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void user_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_nameActionPerformed
        // TODO add your handling code here:
        System.out.println(user_name.getText());
    }//GEN-LAST:event_user_nameActionPerformed

    private void user_nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_nameMouseClicked
        // TODO add your handling code here:

        if (user_name.getText().equals("user name")) {
            user_name.setText("");
        }
        user_name.setForeground(Color.BLACK);
        if (password.getText().equals("")) {
            password.setText("password");
            password.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_user_nameMouseClicked

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_passwordActionPerformed

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        // TODO add your handling code here:
        if (password.getText().equals("password")) {
            password.setText("");
        }
        password.setForeground(Color.BLACK);
        if (user_name.getText().equals("")) {
            user_name.setText("user name");
            user_name.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_passwordMouseClicked

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        // TODO add your handling code here:
        if (this.status == true) {
            this.encrypt_password();
        }
        else
        {
            this.password_true = password.getText();
        }

    }//GEN-LAST:event_passwordKeyReleased

    private void encrypt_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encrypt_buttonActionPerformed
        // TODO add your handling code here:
        //System.out.println("1234");
        if (this.status == false) {

            this.encrypt_password();
            this.status = true;
        } else {
            this.decrypt_password();
            this.status = false;
        }

    }//GEN-LAST:event_encrypt_buttonActionPerformed

    private void LoginButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButActionPerformed
        // TODO add your handling code here:
        //this.eve_user.Connect();
        User user = new User(this.getUser_name(),this.getPassword());
        if(this.Ctl_user.Login(user))
        {
            Login_Menu.Start_Time = java.time.LocalTime.now().toString();
            new Patient_Menu().setVisible(true);
            this.dispose();
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Ten dang nhap hoac mat khau khong dung!");
        }
    }//GEN-LAST:event_LoginButActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Menu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBut;
    private javax.swing.JToggleButton encrypt_button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField password;
    private javax.swing.JTextField user_name;
    // End of variables declaration//GEN-END:variables
}
