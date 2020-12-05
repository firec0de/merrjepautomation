/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merrjepautomation;

import com.sun.glass.ui.Window;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author firec0de
 */
public class MerrJepGUI extends javax.swing.JFrame {

    /**
     * Creates new form MerrJepGUI
     */
    public MerrJepGUI() {
        initComponents(); 
        setLocationRelativeTo(null);        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")    
  
        
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        linkField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        timerField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        runButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emri = new javax.swing.JTextField();
        infoLabel = new javax.swing.JLabel();
        heretLabel = new javax.swing.JLabel();
        heretField = new javax.swing.JTextField();
        checkBox1 = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Merrjep Auto");
        setBackground(new java.awt.Color(60, 63, 66));
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);

        panel.setBackground(new java.awt.Color(60, 63, 66));
        panel.setForeground(new java.awt.Color(60, 63, 66));
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelMouseEntered(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ernando\\Documents\\NetBeansProjects\\MerrJepAutomation\\logo.png")); // NOI18N
        logo.setLabelFor(logo);
        logo.setToolTipText("");

        linkField.setBackground(new java.awt.Color(69, 73, 75));
        linkField.setForeground(new java.awt.Color(204, 204, 204));
        linkField.setToolTipText("Linku i mjetit");
        linkField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        linkField.setCaretColor(new java.awt.Color(237, 28, 36));
        linkField.setSelectedTextColor(new java.awt.Color(69, 73, 75));
        linkField.setSelectionColor(new java.awt.Color(204, 204, 204));
        linkField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                linkFieldMouseEntered(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Linku:");

        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Koha:");

        timerField.setBackground(new java.awt.Color(69, 73, 75));
        timerField.setForeground(new java.awt.Color(204, 204, 204));
        timerField.setToolTipText("Koha midis refreshit");
        timerField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        timerField.setCaretColor(new java.awt.Color(237, 28, 36));
        timerField.setSelectedTextColor(new java.awt.Color(69, 73, 75));
        timerField.setSelectionColor(new java.awt.Color(204, 204, 204));
        timerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerFieldActionPerformed(evt);
            }
        });
        timerField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                timerFieldKeyReleased(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Password:");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(60, 63, 67));

        jList1.setBackground(new java.awt.Color(69, 73, 75));
        jList1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jList1.setForeground(new java.awt.Color(204, 204, 204));
        jList1.setToolTipText("Te gjitha mjetet");
        jList1.setSelectionBackground(new java.awt.Color(60, 63, 66));
        jList1.setSelectionForeground(new java.awt.Color(237, 28, 36));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        addButton.setBackground(new java.awt.Color(69, 73, 75));
        addButton.setForeground(new java.awt.Color(237, 28, 36));
        addButton.setText("Shto");
        addButton.setToolTipText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addButton.setBorderPainted(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        runButton.setBackground(new java.awt.Color(69, 73, 75));
        runButton.setForeground(new java.awt.Color(237, 28, 36));
        runButton.setText("Fillo");
        runButton.setToolTipText("Start");
        runButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        runButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        runButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runButtonActionPerformed(evt);
            }
        });

        passwordField.setBackground(new java.awt.Color(69, 73, 75));
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setToolTipText("Passwordi juaj");
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        passwordField.setCaretColor(new java.awt.Color(237, 28, 36));
        passwordField.setSelectedTextColor(new java.awt.Color(69, 73, 75));
        passwordField.setSelectionColor(new java.awt.Color(204, 204, 204));
        passwordField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordFieldMouseEntered(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(69, 73, 75));
        deleteButton.setForeground(new java.awt.Color(237, 28, 36));
        deleteButton.setText("Fshije");
        deleteButton.setToolTipText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteButton.setEnabled(false);
        deleteButton.setMaximumSize(new java.awt.Dimension(24, 18));
        deleteButton.setMinimumSize(new java.awt.Dimension(24, 18));
        deleteButton.setPreferredSize(new java.awt.Dimension(24, 18));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Emri :");

        emri.setBackground(new java.awt.Color(69, 73, 75));
        emri.setForeground(new java.awt.Color(204, 204, 204));
        emri.setToolTipText("Emri i mjetit");
        emri.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        emri.setCaretColor(new java.awt.Color(237, 28, 36));
        emri.setSelectedTextColor(new java.awt.Color(69, 73, 75));
        emri.setSelectionColor(new java.awt.Color(204, 204, 204));
        emri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                emriMouseEntered(evt);
            }
        });
        emri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emriActionPerformed(evt);
            }
        });

        infoLabel.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N

        heretLabel.setForeground(new java.awt.Color(204, 204, 204));
        heretLabel.setText("Heret:");

        heretField.setBackground(new java.awt.Color(69, 73, 75));
        heretField.setForeground(new java.awt.Color(204, 204, 204));
        heretField.setToolTipText("Sasisa e refreshit");
        heretField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        heretField.setCaretColor(new java.awt.Color(237, 28, 36));
        heretField.setSelectedTextColor(new java.awt.Color(69, 73, 75));
        heretField.setSelectionColor(new java.awt.Color(204, 204, 204));
        heretField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                heretFieldKeyReleased(evt);
            }
        });

        checkBox1.setForeground(new java.awt.Color(237, 28, 36));
        checkBox1.setText("Shiko Veprimet");
        checkBox1.setToolTipText("Shiko veprimet e programit");
        checkBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBox1ActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(69, 73, 75));
        saveButton.setForeground(new java.awt.Color(237, 28, 36));
        saveButton.setText("Ruaj");
        saveButton.setToolTipText("Save");
        saveButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        saveButton.setBorderPainted(false);
        saveButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        loadButton.setBackground(new java.awt.Color(69, 73, 75));
        loadButton.setForeground(new java.awt.Color(237, 28, 36));
        loadButton.setText("Ngarko");
        loadButton.setToolTipText("Load");
        loadButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        loadButton.setBorderPainted(false);
        loadButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(timerField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(heretLabel)
                        .addGap(18, 18, 18)
                        .addComponent(heretField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(emri, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(linkField, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBox1)
                        .addGap(11, 11, 11)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(logo)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(checkBox1)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(linkField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(timerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(runButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heretLabel)
                    .addComponent(heretField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("MerrJep Automation Software by fric0de");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void runButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runButtonActionPerformed
        Object object = jList1;
        
        ListModel lModel = jList1.getModel();
        DefaultListModel dlm = new DefaultListModel<Object>();
        int total = lModel.getSize();     
       String mainlink = "https://www.merrjep.al/rregullim-i-njoftimit/" ;
                  
        
       infoLabel.setText(" ");
        
       if(total == 0){
         infoLabel.setForeground(Color.red);
         infoLabel.setText("Shtoni nje produkt!");         
        }
       else
         if(passwordField.getText().isEmpty()){
         infoLabel.setForeground(Color.red);
         infoLabel.setText("Vendosni nje password!");
       }else
           if(heretField.getText().isEmpty()){
         infoLabel.setForeground(Color.red);
         infoLabel.setText("Vendosni Heret!");
       }else
      if(timerField.getText().isEmpty() || timerField.getText().isEmpty()){
          infoLabel.setForeground(Color.red);
          infoLabel.setText("Vendosni nje timer!");
       }
        else{
          infoLabel.setText("");        
        
      
       
        int heret = Integer.parseInt(heretField.getText());   
        int timer = Integer.parseInt(timerField.getText()); 
       for(int y = 0; y < heret; y++){
            
       System.setProperty("webdriver.chrome.driver", "chromedriver.exe");       
       ChromeOptions options = new ChromeOptions();
       if(checkBox1.isSelected() == false)
       options.addArguments("headless");
      
        WebDriver driver = new ChromeDriver(options);
        for(int x = 0; x < total; x++) {            
            dlm.addElement(lModel.getElementAt(x));       
           
       
       String aw = dlm.toString();           

       String inputlink = aw.substring(1, aw.length()-1);        
       String link = mainlink + inputlink.substring(inputlink.length()-7);
       
       String password = passwordField.getText();     
       
       
       
       infoLabel.setText("Bot Working . . .");
       infoLabel.setForeground(Color.green);
           
           driver.switchTo().newWindow(WindowType.TAB).get(link);             
           infoLabel.setText("Opening link . . .");
                
       
        try {
            TimeUnit.SECONDS.sleep(8);
        } catch (InterruptedException ex) {
            Logger.getLogger(MerrJepGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       infoLabel.setText("Loging in . . .");
       infoLabel.setForeground(Color.CYAN);
       
       driver.findElement(By.xpath("//div[3]//div[1]//input[1]")).click();       
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(MerrJepGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
       driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
        try { 
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(MerrJepGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       infoLabel.setText("Mbaroj me Sukses!"); 
       infoLabel.setForeground(Color.green);
       
                       
           try {
               TimeUnit.SECONDS.sleep(5);
           } catch (InterruptedException ex) {
               Logger.getLogger(MerrJepGUI.class.getName()).log(Level.SEVERE, null, ex);
           }          
              
    }
            driver.quit();
try {
                TimeUnit.MINUTES.sleep(timer);
            } catch (InterruptedException ex) {
                Logger.getLogger(MerrJepGUI.class.getName()).log(Level.SEVERE, null, ex);
           }
       
      }
      }
      
      
    }//GEN-LAST:event_runButtonActionPerformed
    
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
       infoLabel.setText("");
       Makina m1 = new Makina();
       m1.setName(linkField.getText());
       ListModel lModel = jList1.getModel();
       DefaultListModel dlm = new DefaultListModel<Object>();
       int total = lModel.getSize();
       for(int x = 0; x < total; x++) {
            dlm.addElement(lModel.getElementAt(x));
        }
       
       if(linkField.getText().isEmpty()){
           infoLabel.setForeground(Color.red);
           infoLabel.setText("Linku mungon!");
           
       }
       else
       if(linkField.getText().contains("merrjep")){
           
        infoLabel.setText("");
       dlm.addElement(emri.getText() +" " + m1);
        jList1.setModel(dlm);
        linkField.setText("");
        emri.setText("");}
       else {
           infoLabel.setForeground(Color.red);
       infoLabel.setText("Linku sesht i sakte!");
       
       }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        infoLabel.setText("");
        Object object = jList1.getSelectedValue();
        
        ListModel lModel = jList1.getModel();
        DefaultListModel dlm = new DefaultListModel<Object>();
        int total = lModel.getSize();
        for(int x = 0; x < total; x++) {
            dlm.addElement(lModel.getElementAt(x));
        }
        
        dlm.removeElement(object);
        
        
        jList1.setModel(dlm);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
            infoLabel.setText("");
        int index = jList1.getSelectedIndex();
        
        int size = jList1.getModel().getSize();
        if(index>=0 && index<size)
           deleteButton.setEnabled(true);   
    }//GEN-LAST:event_jList1MouseClicked

    private void emriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emriActionPerformed

    private void timerFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_timerFieldKeyReleased
        try {
            int x = Integer.parseInt(timerField.getText()); } 
        catch (NumberFormatException nfe) { timerField.setText(""); }
    }//GEN-LAST:event_timerFieldKeyReleased

    private void heretFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heretFieldKeyReleased
        try {
            int x = Integer.parseInt(heretField.getText()); } 
        catch (NumberFormatException nfe) { heretField.setText(""); }
    }//GEN-LAST:event_heretFieldKeyReleased

    private void timerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timerFieldActionPerformed

    private void panelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseEntered
    
    }//GEN-LAST:event_panelMouseEntered

    private void linkFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkFieldMouseEntered
        JTextAreaRegularPopupMenu.addTo(linkField);
    }//GEN-LAST:event_linkFieldMouseEntered

    private void passwordFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordFieldMouseEntered
        JTextAreaRegularPopupMenu.addTo(passwordField);
    }//GEN-LAST:event_passwordFieldMouseEntered

    private void emriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emriMouseEntered
         JTextAreaRegularPopupMenu.addTo(emri);
    }//GEN-LAST:event_emriMouseEntered

    private void checkBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBox1ActionPerformed
     
    }//GEN-LAST:event_checkBox1ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    
        
        int val = jList1.getModel().getSize(); //get size of list
        PrintWriter writer = null;
        
        if (val <= 0) { // check if list is not empty
            infoLabel.setForeground(Color.red);
            infoLabel.setText("Lista eshte Bosh!");}
        else{
      try{
         writer = new PrintWriter("makinat.txt"); //file name to save cars  
         writer.println(val);
         for(int i = 0; i<val;i++){     
            String aw = jList1.getModel().getElementAt(i);                
            writer.println(aw);
            // Save all elements form the list to the txt file            
         }
      }catch(Exception e){      
        System.out.println(""+e);
      } finally {
          writer.close();
          infoLabel.setForeground(Color.green);
          infoLabel.setText("U ruajt me Sukses!");
      }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
       
        DefaultListModel listModel = new DefaultListModel<Object>();              
                   
        BufferedReader br = null;
       
       try {
           br = new BufferedReader(new FileReader("makinat.txt"));
           int val = Integer.parseInt(br.readLine());
           for(int i=0;i<val;i++){
           String ss = br.readLine();           
           listModel.addElement(ss);           
           }
           jList1.setModel(listModel);
                 
       }catch (Exception e){           
           infoLabel.setForeground(Color.red);
           infoLabel.setText("Lista nuk u gjet!");
           System.out.println("" + e);
       }
       finally{
           try {
               br.close();
           } catch (Exception e) {
               infoLabel.setForeground(Color.red);
               infoLabel.setText("Lista nuk u gjet!");
               System.out.println("" + e);
           }
       }
                 
    }//GEN-LAST:event_loadButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MerrJepGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MerrJepGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MerrJepGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MerrJepGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MerrJepGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JCheckBox checkBox1;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField emri;
    private javax.swing.JTextField heretField;
    private javax.swing.JLabel heretLabel;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField linkField;
    private javax.swing.JButton loadButton;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton runButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField timerField;
    // End of variables declaration//GEN-END:variables
}
