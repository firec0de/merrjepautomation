package merrjepautomation;

import java.io.FileNotFoundException;



/**
 * MerrJep Automation
 * @author firec0de
 */
public class LoginFrame extends javax.swing.JFrame {
    /**
     * Creates new form Login
     * @throws java.io.FileNotFoundException
     */
    public LoginFrame() throws FileNotFoundException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        usersDB = new UsersDatabase("C:/ProgramData/mja/users.txt");
        licenseDB = new LicenseDatabase("C:/ProgramData/mja/license.txt");

        initComponents();        
        this.setTitle("MerrJep Auto LogIn");
        this.setLocation(500, 300);
        this.setVisible(true);
        this.getRootPane().setDefaultButton(loginButton);
        
    }
      @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        messageDisplay = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(59, 60, 64));
        jPanel1.setForeground(new java.awt.Color(59, 60, 64));

        TitleLabel.setFont(new java.awt.Font("Ebrima", 1, 15)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(204, 204, 204));
        TitleLabel.setText("MJA Login");
        TitleLabel.setToolTipText("");

        passwordField.setBackground(new java.awt.Color(77, 77, 77));
        passwordField.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(51, 51, 51));
        loginButton.setFont(new java.awt.Font("Ebrima", 1, 13)); // NOI18N
        loginButton.setForeground(new java.awt.Color(204, 204, 204));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        usernameField.setBackground(new java.awt.Color(77, 77, 77));
        usernameField.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(204, 204, 204));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        UsernameLabel.setFont(new java.awt.Font("Ebrima", 1, 13)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(204, 204, 204));
        UsernameLabel.setText("Username :");

        PasswordLabel.setFont(new java.awt.Font("Ebrima", 1, 13)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        PasswordLabel.setText("Password :");

        messageDisplay.setEditable(false);
        messageDisplay.setBackground(new java.awt.Color(59, 60, 64));
        messageDisplay.setBorder(null);
        messageDisplay.setForeground(new java.awt.Color(204, 0, 0));
        messageDisplay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        messageDisplay.setCaretColor(new java.awt.Color(59, 60, 64));
        messageDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageDisplayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(messageDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PasswordLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(UsernameLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(TitleLabel)
                                        .addGap(76, 76, 76)))))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(TitleLabel)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(messageDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        
       String username = usernameField.getText();      
       String password = "";
       String lic = "WYQBDS" ;  
       String ense = "QWjXZ";
       
       /* Adds the characters of the inputed password to an char array in order
        * to creata a string so it can be used for matching
        */
       char[] pass = passwordField.getPassword();       
       for (char c : pass){
          password  += c;          
       } 
      usernameField.setText("");
       passwordField.setText("");
       
      /* If the username and password exist in the database the object is created
       *  if not error appear.
       */
      
       if (usersDB.findUser(username, password)!= null){
          if(licenseDB.findUser(lic, ense) != null){ 
           MerrJepGUI w = new MerrJepGUI();
           w.setVisible(true);
         // Hides the Login frame after succsesful login
           this.setVisible(false);}
          else {messageDisplay.setText("License not Found!");}
           
       } else {messageDisplay.setText("Login Unsuccesful!");}
   
       
    }    

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             
    
        
    private void messageDisplayActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException {
        try {
                LoginFrame c = new LoginFrame();
                }
                catch(FileNotFoundException ex){
                    System.out.println("File not Found");
                }

    }   
    // Variables declaration - do not modify                     
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JFormattedTextField messageDisplay;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;                
    private UsersDatabase usersDB;
    private LicenseDatabase licenseDB;
        // End of variables declaration   
}
