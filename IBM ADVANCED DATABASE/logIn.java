package ibm_project;

import ibm_project.homePage;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class logIn extends javax.swing.JFrame {

    public logIn() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        logIn = new javax.swing.JButton();
        signUp = new javax.swing.JButton();
        showPass = new javax.swing.JRadioButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 63, 228, 55));

        password.setName(""); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 136, 228, 55));
        password.getAccessibleContext().setAccessibleName("");

        logIn.setText("Log In");
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });
        jPanel1.add(logIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 209, -1, -1));
        logIn.getAccessibleContext().setAccessibleName("");

        signUp.setText("Sign Up");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel1.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 250, -1, -1));

        showPass.setText("Show Password");
        showPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassActionPerformed(evt);
            }
        });
        jPanel1.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 114, -1));

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

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

        pack();
    }// </editor-fold>                        

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {                                      
        
        String user = email.getText();
        String pass = password.getText();

        try {
            FileReader fr = new FileReader("users.txt");
            Scanner reader = new Scanner(fr);
            reader.useDelimiter("[,\n]");
            
            String em = reader.next();
            String pw = reader.next();
            
            while(reader.hasNext()) {
                if(user.equals(em.trim()) && pass.equals(pw.trim())) {
                    homePage homePageFrame = new homePage();
                    homePageFrame.setVisible(true);
                    homePageFrame.pack();
                    homePageFrame.setLocationRelativeTo(null);  
                    this.dispose();
                    break;
                }
                JOptionPane.showMessageDialog(null, "Incorrect Log in Details");
                break;
            }                                   

        } catch (IOException e) {
            
        }
    }                                     

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {                                       
        //Instantiation of the logIn Frame
        signUp signUpFrame = new signUp();
        //Visibility of the frame
        signUpFrame.setVisible(true);
        //for size polucy
        signUpFrame.pack();
        //centers the placement of the frame when run
        signUpFrame.setLocationRelativeTo(null);
        //the logInFrame will be disposed right after the sign up is clicked.
        this.dispose();
    }                                      

    private void showPassActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //select of show password
        if(showPass.isSelected()) {
            password.setEchoChar((char)0);
        }
        //returns to security password field
        else {
            password.setEchoChar((char)8226);
        }
    }                                        

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //exits the system
        System.exit(0);
    }                                    

    // Variables declaration - do not modify                     
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logIn;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton showPass;
    private javax.swing.JButton signUp;
    // End of variables declaration                   
}
