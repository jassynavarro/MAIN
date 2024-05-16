package ibm_project;

import java.awt.desktop.UserSessionEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class signUp extends javax.swing.JFrame{  
    
    public signUp() {
        initComponents();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        afterLogIn = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        signIn = new javax.swing.JButton();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        afterLogIn.setText("Log In");
        afterLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afterLogInActionPerformed(evt);
            }
        });
        getContentPane().add(afterLogIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 256, -1, -1));

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, -1));

        signIn.setText("Sign In");
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        getContentPane().add(signIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 240, 60));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 240, 50));

        pack();
    }// </editor-fold>                        

    private void afterLogInActionPerformed(java.awt.event.ActionEvent evt) {                                           
        logIn logInFrame = new logIn();
        //Visibility of the frame
        logInFrame.setVisible(true);
        //for size policy
        logInFrame.pack();
        //centers the placement of the frame when run
        logInFrame.setLocationRelativeTo(null);
        //the signUpFrame will be disposed right after the log In is clicked.
        this.dispose();
    }                                          

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        //exits the system
        System.exit(0);
    }                                    

    private void signInActionPerformed(java.awt.event.ActionEvent evt) {                                       
        
        String user = email.getText();
        String pass = password.getText();

        try {
            FileWriter fw = new FileWriter("users.txt", true);
            fw.write(""+user+", "+pass);
            fw.write(System.getProperty("line.separator"));
            fw.write(System.getProperty("line.separator"));
            JOptionPane.showMessageDialog(null, "Registration Successful"); 
            fw.close();                                    
        } catch (Exception e) {
        }
        
    }                                      
    
    // Variables declaration - do not modify                     
    private javax.swing.JButton afterLogIn;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signIn;
    // End of variables declaration                   
}
