/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adityajava;
import com.sun.jdi.connect.spi.Connection;
import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.ButtonGroup;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection.*;
import java.sql.*;
import java.util.Scanner;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.swing.text.StyleConstants.Bold;
/**
 *
 * @author aditya
 */

public class SignUP extends javax.swing.JFrame {
public String role;
 public String selecteditem;
 public java.sql.Connection con;
 public String profileImagePath;
 public String idImagePath;
    /**
     * Creates new form SignUP
     */
public void radioSetting(){
         ButtonGroup group = new ButtonGroup();
        group.add(studentradio);
        group.add(teacherradio);
}  
public void dbConnection() throws FileNotFoundException{
    

   Statement st;
  
       ResultSet rs;
       String phonenumberfield=phonefield.getText();
       String fullnamedb=null;
       String phonedb=null;
       String facultydb=null;
       String addressdb=null;
       String rollnumdb=null;
       String query;
       String url;
       String username;
       String password;
      FileInputStream imgprofile = new FileInputStream(profileImagePath);
      FileInputStream imgid = new FileInputStream(idImagePath);
                 String  namefielduser =namefield.getText().trim();
       String addressfielduser =addressfield.getText().trim();
        String emailfielduser = emailfield.getText().trim();
        String phonefielduser = phonefield.getText().trim();
       String  passwordfielduser = passwordfield.getText().trim();
       String rollnum=rollnofield.getText().trim();
    facultycombobox.addActionListener(e -> {
          String   selectedOption = (String) facultycombobox.getSelectedItem();
            selecteditem=selectedOption;
             });
  
    //image path retriaval
   
    
    
    
 

       if(role=="student"){
          try{
            
         url= "jdbc:mysql://localhost:3306/Collage?zeroDateTimeBehavior=CONVERT_TO_NULL"; // table details
         username = "root"; // MySQL credentials
         password = "";
        
        
        //udate db data 
         query = "SELECT * FROM students WHERE phone="+phonenumberfield+"";
           Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
           con = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = con.prepareStatement(query);
       
         rs = stmt.executeQuery();
         
          
        
if (rs.next()) {
     fullnamedb=rs.getString("fullname");
          addressdb=rs.getString("address");
          phonedb=rs.getString("phone");
          facultydb=rs.getString("faculty");
          rollnumdb=rs.getString("rollno");
                if(namefield.getText().isEmpty()||addressfield.getText().isEmpty()||phonefield.getText().isEmpty()||
   emailfield.getText().isEmpty()||passwordfield.getText().isEmpty()||rollnofield.getText().isEmpty()
          ||imglbl1.getIcon()==null||imagelbl.getIcon()==null&&selecteditem.contentEquals(null)){
           JOptionPane.showMessageDialog(null,"None of the above field should be empty!");  
         }else{

             if(fullnamedb.contentEquals(namefield.getText().toLowerCase())&&addressdb.contentEquals(addressfielduser.toLowerCase())
                               &&phonedb.contentEquals(phonefielduser.toLowerCase())&&facultydb.contentEquals(selecteditem.toLowerCase())
                     &&rollnumdb.contentEquals(rollnum)){
                 
                 try{
                  url = "jdbc:mysql://localhost:3306/Collage?maxAllowedPacket=67108864";
 // table details
         username = "root"; // MySQL credentials
         password = "";
        
                query = "INSERT INTO savestudent (name,address,phone,email,password,profile,idphoto) VALUES (?,?,?,?,?,?,?)";
           Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
           con = DriverManager.getConnection(url, username, password);

        PreparedStatement pst = con.prepareStatement(query);
           pst.setString(1, namefield.getText());
           pst.setString(2, addressfield.getText());
            pst.setString(3, phonefield.getText());
           pst.setString(4, emailfield.getText());
            pst.setString(5, passwordfield.getText());
            pst.setBinaryStream(6, imgprofile, imgprofile.available());
            pst.setBinaryStream(7, imgid, imgid.available());
           
          int rowsAffected= pst.executeUpdate();
            if (rowsAffected > 0) {
              
               JOptionPane.showMessageDialog(null, "Your id has been created sucessfully");
                loginpage login= new loginpage();
               login.setVisible(true);
               this.dispose();
            }else if(phonedb.contentEquals(phonefield.getText())){
               JOptionPane.showMessageDialog(null,"Warning! You have already created id");
            }
          
                 }catch(Exception e){
                     if(phonedb.contentEquals(phonefield.getText())){
               JOptionPane.showMessageDialog(null,"Warning! You have already created id");
            }else{
                     JOptionPane.showMessageDialog(null,e);     
                     }
                    
                 }
     
                 
                 
                 

                           //now we con move forward

                        }else {
                           JOptionPane.showMessageDialog(null,"Your information doesn't match with our database records!");
                       } 
         }
} else {
JOptionPane.showMessageDialog(null,"Your contacts isn't avilable in our students record details");
}
        
        
          }catch(Exception e){
                          if(namefield.getText().isEmpty()||addressfield.getText().isEmpty()||
   emailfield.getText().isEmpty()||passwordfield.getText().isEmpty()
          ||imglbl1.getIcon()==null||imagelbl.getIcon()==null&&selecteditem.contentEquals(null)){
                           JOptionPane.showMessageDialog(null,"None of the above field should be empty!");   
                          }else{
            
               if(phonefield.getText().isEmpty()){
                  JOptionPane.showMessageDialog(null,"Phone number should not be empty");
              }else{
                 JOptionPane.showMessageDialog(null,e);   
              }
                              
                          }
                         
          
              
          }
       }else if(role=="teacher"){
        try{
            
        url= "jdbc:mysql://localhost:3306/Collage?zeroDateTimeBehavior=CONVERT_TO_NULL"; // table details
        username = "root"; // MySQL credentials
        password = "";
        
        
        //udate db data 
        query = "SELECT * FROM teacher WHERE phone="+phonenumberfield+"";
           Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
           con = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = con.prepareStatement(query);
       
         rs = stmt.executeQuery();
         
          
        
if (rs.next()) {
     fullnamedb=rs.getString("fullname");
          addressdb=rs.getString("address");
          phonedb=rs.getString("phone");
          facultydb=rs.getString("faculty");
                if(namefield.getText().isEmpty()||addressfield.getText().isEmpty()||phonefield.getText().isEmpty()||
   emailfield.getText().isEmpty()||passwordfield.getText().isEmpty()||rollnofield.getText().isEmpty()
          ||imglbl1.getIcon()==null||imagelbl.getIcon()==null&&selecteditem.contentEquals(null)){
           JOptionPane.showMessageDialog(null,"None of the above field should be empty!");  
         }else{

             if(fullnamedb.contentEquals(namefield.getText().toLowerCase())&&addressdb.contentEquals(addressfielduser.toLowerCase())
                               &&phonedb.contentEquals(phonefielduser.toLowerCase())&&facultydb.contentEquals(selecteditem.toLowerCase())
                 ){
                 
               try{
                  url = "jdbc:mysql://localhost:3306/Collage?maxAllowedPacket=67108864";
 // table details
         username = "root"; // MySQL credentials
         password = "";
        
                query = "INSERT INTO saveteacher (name,address,phone,email,password,profile,idphoto) VALUES (?,?,?,?,?,?,?)";
           Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
           con = DriverManager.getConnection(url, username, password);

        PreparedStatement pst = con.prepareStatement(query);
           pst.setString(1, namefield.getText());
           pst.setString(2, addressfield.getText());
            pst.setString(3, phonefield.getText());
           pst.setString(4, emailfield.getText());
            pst.setString(5, passwordfield.getText());
            pst.setBinaryStream(6, imgprofile, imgprofile.available());
            pst.setBinaryStream(7, imgid, imgid.available());
           
          int rowsAffected= pst.executeUpdate();
            if (rowsAffected > 0) {
              
               JOptionPane.showMessageDialog(null, "Your id has been created sucessfully");
               loginpage login= new loginpage();
               login.setVisible(true);
               this.dispose();
            }else if(phonedb.contentEquals(phonefield.getText())){
               JOptionPane.showMessageDialog(null,"Warning! You have already created id");
            }
          
                 }catch(Exception e){
                        if(phonedb.contentEquals(phonefield.getText())){
               JOptionPane.showMessageDialog(null,"Warning! You have already created id");
            }else{
                     JOptionPane.showMessageDialog(null,e);         
                        }
                   
                 }

                        }else {
                           JOptionPane.showMessageDialog(null,"Your information doesn't match with our database records!");
                       } 
         }
} else {
JOptionPane.showMessageDialog(null,"Your contacts isn't avilable in our teachers record details");
}
        
        
          }catch(Exception e){
                          if(namefield.getText().isEmpty()||addressfield.getText().isEmpty()||
   emailfield.getText().isEmpty()||passwordfield.getText().isEmpty()
          ||imglbl1.getIcon()==null||imagelbl.getIcon()==null&&selecteditem.contentEquals(null)){
                           JOptionPane.showMessageDialog(null,"None of the above field should be empty!");   
                          }else{
            
               if(phonefield.getText().isEmpty()){
                  JOptionPane.showMessageDialog(null,"Phone number should not be empty");
              }else{
                 JOptionPane.showMessageDialog(null,e);   
              }
                              
                          }
                         
          
              
          }
       }
            
   
   
}

                        public void resize_eyeopen(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("eyeopen.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(eyeopenlbl.getWidth(), eyeopenlbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
eyeopenlbl.setIcon(scaledicon); // transform it back
    }
                        
                      public void resize_signup(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("Signup.jpeg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(createbtn.getWidth(), createbtn.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
createbtn.setIcon(scaledicon); // transform it back
    }                      
                                            public void resize_eyeclose(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("eyeclose.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(eyecloselbl.getWidth(), eyecloselbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
eyecloselbl.setIcon(scaledicon); // transform it back
    }
                 public void resize_sideimg(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("background.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(signuppage_background.getWidth(), signuppage_background.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
signuppage_background.setIcon(scaledicon); // transform it back
    }
                       public void close_logo(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("close.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(closelbl.getWidth(), closelbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
closelbl.setIcon(scaledicon); // transform it back
    }  
                public void resize_logo(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("logo.jpg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(logolbl.getWidth(), logolbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
logolbl.setIcon(scaledicon); // transform it back
    }  
                 public void backicon_logo(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("backicon.jpeg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(backlbl.getWidth(), backlbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
backlbl.setIcon(scaledicon); // transform it back
    }                
             
    public SignUP() {
        initComponents();
             facultycombobox.addActionListener(e -> {
            String selectedOption = (String) facultycombobox.getSelectedItem();
            selecteditem=selectedOption;
        });
        resize_sideimg();
        close_logo();
        backicon_logo();
        resize_logo();
        resize_signup();
        radioSetting();
       resize_eyeopen();
       resize_eyeclose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        closelbl = new javax.swing.JLabel();
        logolbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rollnolbl = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        rollnofield = new javax.swing.JTextField();
        namefield = new javax.swing.JTextField();
        addressfield = new javax.swing.JTextField();
        phonefield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        facultycombobox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        imagelbl = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        imagelbl1 = new javax.swing.JLabel();
        chooseprofile = new javax.swing.JButton();
        backlbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chooseid = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        imglbl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        teacherradio = new javax.swing.JRadioButton();
        studentradio = new javax.swing.JRadioButton();
        eyeopenlbl = new javax.swing.JLabel();
        eyecloselbl = new javax.swing.JLabel();
        createbtn = new javax.swing.JLabel();
        signuppage_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MBMAN");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closelblMouseClicked(evt);
            }
        });
        jPanel1.add(closelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 50, 30));
        jPanel1.add(logolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 90, 60));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 100, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phone number:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 150, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, 30));

        rollnolbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        rollnolbl.setForeground(new java.awt.Color(255, 255, 255));
        rollnolbl.setText("Collage Rollno:");
        jPanel1.add(rollnolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 140, 30));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Your Picture:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 200, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 100, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 100, 30));

        emailfield.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        emailfield.setForeground(new java.awt.Color(102, 102, 102));
        emailfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailfieldMouseClicked(evt);
            }
        });
        emailfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailfieldActionPerformed(evt);
            }
        });
        jPanel1.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 260, 40));

        rollnofield.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        rollnofield.setForeground(new java.awt.Color(102, 102, 102));
        rollnofield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rollnofieldMouseClicked(evt);
            }
        });
        rollnofield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rollnofieldKeyReleased(evt);
            }
        });
        jPanel1.add(rollnofield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 270, 40));

        namefield.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        namefield.setForeground(new java.awt.Color(102, 102, 102));
        namefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                namefieldMouseClicked(evt);
            }
        });
        namefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                namefieldKeyPressed(evt);
            }
        });
        jPanel1.add(namefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 260, 40));

        addressfield.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        addressfield.setForeground(new java.awt.Color(102, 102, 102));
        addressfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressfieldMouseClicked(evt);
            }
        });
        addressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressfieldActionPerformed(evt);
            }
        });
        jPanel1.add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 270, 40));

        phonefield.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        phonefield.setForeground(new java.awt.Color(102, 102, 102));
        phonefield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                phonefieldMouseClicked(evt);
            }
        });
        phonefield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonefieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phonefieldKeyReleased(evt);
            }
        });
        jPanel1.add(phonefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, 270, 40));

        passwordfield.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        passwordfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordfieldMouseClicked(evt);
            }
        });
        jPanel1.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 270, 40));

        facultycombobox.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        facultycombobox.setForeground(new java.awt.Color(102, 102, 102));
        facultycombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT..........", "BE COMPUTER", "BE CIVIL", "BE ARC", " " }));
        facultycombobox.setToolTipText("");
        jPanel1.add(facultycombobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 220, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagelbl.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(imagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 220));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagelbl1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.add(imagelbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 130, 210));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 190, 210));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 460, 190, 220));

        chooseprofile.setBackground(new java.awt.Color(204, 204, 204));
        chooseprofile.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        chooseprofile.setForeground(new java.awt.Color(102, 102, 102));
        chooseprofile.setText("Choose Image");
        chooseprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseprofileActionPerformed(evt);
            }
        });
        jPanel1.add(chooseprofile, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 410, 180, 40));

        backlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/backicon.jpeg"))); // NOI18N
        backlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlblMouseClicked(evt);
            }
        });
        jPanel1.add(backlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Role:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 500, 50, 30));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MADAN BHANDARI MEMORIAL ACADEMY NEPAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Identity Card Picture:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 380, 200, 30));

        chooseid.setBackground(new java.awt.Color(204, 204, 204));
        chooseid.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        chooseid.setForeground(new java.awt.Color(102, 102, 102));
        chooseid.setText("Choose Image");
        chooseid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseidActionPerformed(evt);
            }
        });
        jPanel1.add(chooseid, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 410, 180, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(imglbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 200, 220));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 200, 220));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Select Faculty:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 170, 30));

        teacherradio.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        teacherradio.setForeground(new java.awt.Color(255, 255, 255));
        teacherradio.setText("Teachers");
        teacherradio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacherradioMouseClicked(evt);
            }
        });
        jPanel1.add(teacherradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 500, 160, 30));

        studentradio.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        studentradio.setForeground(new java.awt.Color(255, 255, 255));
        studentradio.setText("Student");
        studentradio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentradioMouseClicked(evt);
            }
        });
        jPanel1.add(studentradio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 130, 30));

        eyeopenlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeopenlblMouseClicked(evt);
            }
        });
        jPanel1.add(eyeopenlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 50, 40));

        eyecloselbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyecloselblMouseClicked(evt);
            }
        });
        jPanel1.add(eyecloselbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 320, 50, 40));

        createbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createbtnMouseClicked(evt);
            }
        });
        jPanel1.add(createbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 580, 150, 50));
        jPanel1.add(signuppage_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 710));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closelblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closelblMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closelblMouseClicked

    private void emailfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailfieldActionPerformed

    private void backlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseClicked
        // TODO add your handling code here:
        loginpage login=new loginpage();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backlblMouseClicked

    private void addressfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressfieldActionPerformed

    private void namefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_namefieldMouseClicked
      
    }//GEN-LAST:event_namefieldMouseClicked

    private void addressfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressfieldMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_addressfieldMouseClicked

    private void phonefieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_phonefieldMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_phonefieldMouseClicked

    private void emailfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailfieldMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_emailfieldMouseClicked

    private void rollnofieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rollnofieldMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_rollnofieldMouseClicked

    private void passwordfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordfieldMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_passwordfieldMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
              if(teacherradio.isSelected()){
            role="teacher";
            JOptionPane.showMessageDialog(null,role+" is selected");
           
        }else if(studentradio.isSelected()){
            role="student";
            JOptionPane.showMessageDialog(null,role+" is selected");
            
        }
             facultycombobox.addActionListener(e -> {
            String selectedOption = (String) facultycombobox.getSelectedItem();
            selecteditem=selectedOption;
        });
        eyeopenlbl.setVisible(true);
        eyecloselbl.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void eyeopenlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeopenlblMouseClicked
        // TODO add your handling code here:
        eyecloselbl.setVisible(true);
        eyeopenlbl.setVisible(false);
        passwordfield.setEchoChar('\0');
    }//GEN-LAST:event_eyeopenlblMouseClicked

    private void eyecloselblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyecloselblMouseClicked
        // TODO add your handling code here:
        eyeopenlbl.setVisible(true);
        eyecloselbl.setVisible(false);
        passwordfield.setEchoChar('*');
    }//GEN-LAST:event_eyecloselblMouseClicked

    private void createbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createbtnMouseClicked
        // TODO add your handling code here:
        try{
                if(studentradio.isSelected()||teacherradio.isSelected()){
          dbConnection();
    }else if(namefield.getText().isEmpty()||addressfield.getText().isEmpty()||phonefield.getText().isEmpty()||
   emailfield.getText().isEmpty()||rollnofield.getText().isEmpty()||passwordfield.getText().isEmpty()
          ||imglbl1.getIcon()==null||imagelbl.getIcon()==null){
       JOptionPane.showMessageDialog(null, "please fill all the fields properly");
      
    }else{
         JOptionPane.showMessageDialog(null,"Please select your role first");
    }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

        
    }//GEN-LAST:event_createbtnMouseClicked

    private void namefieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namefieldKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_namefieldKeyPressed

    private void phonefieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonefieldKeyPressed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_phonefieldKeyPressed

    private void phonefieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonefieldKeyReleased
        // TODO add your handling code here:
          char keyChar = evt.getKeyChar();
            if (Character.isDigit(keyChar)) {
                    //is int
                } else {
                    //not int
                    phonefield.setText("");
                }
    }//GEN-LAST:event_phonefieldKeyReleased

    private void chooseprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseprofileActionPerformed
       JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                        "Image Files", "jpg", "jpeg", "png", "gif"));
                     JFrame frame = new JFrame();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    
                    File selectedFile = fileChooser.getSelectedFile();
                    profileImagePath = selectedFile.getAbsolutePath();
        
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                    Image scaledImage = imageIcon.getImage().getScaledInstance(
                            imglbl1.getWidth(), imglbl1.getHeight(), Image.SCALE_SMOOTH);
                    imglbl1.setIcon(new ImageIcon(scaledImage));
                    imglbl1.setText(null); // Remove the placeholder text
                }
 
    }//GEN-LAST:event_chooseprofileActionPerformed

    private void chooseidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseidActionPerformed
        // TODO add your handling code here:
               JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                        "Image Files", "jpg", "jpeg", "png", "gif"));
                     JFrame frame = new JFrame();
                int result = fileChooser.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    idImagePath=selectedFile.getAbsolutePath();
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                    Image scaledImage = imageIcon.getImage().getScaledInstance(
                            imagelbl.getWidth(), imagelbl.getHeight(), Image.SCALE_SMOOTH);
                    imagelbl.setIcon(new ImageIcon(scaledImage));
                    imagelbl.setText(null); // Remove the placeholder text
                }
    }//GEN-LAST:event_chooseidActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

    private void teacherradioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherradioMouseClicked
        // TODO add your handling code here:
        int count=evt.getClickCount();
        if(count==1){
            role="teacher";
            rollnofield.setVisible(false);
            rollnolbl.setVisible(false);
            
        }else if(count%2==0){
              rollnofield.setVisible(true);
            rollnolbl.setVisible(true);
        }else{
            role="teacher";
             rollnofield.setVisible(false);
            rollnolbl.setVisible(false);
        }
    }//GEN-LAST:event_teacherradioMouseClicked

    private void studentradioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentradioMouseClicked
        // TODO add your handling code here:
           int count=evt.getClickCount();
        if(count==1){
            role="student";
            rollnofield.setVisible(true);
            rollnolbl.setVisible(true);
        }else if(count%2==0){
          
        }else{
            role="student";
             rollnofield.setVisible(true);
            rollnolbl.setVisible(true);
        }
    }//GEN-LAST:event_studentradioMouseClicked

    private void rollnofieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rollnofieldKeyReleased
        // TODO add your handling code here:
           char keyChar = evt.getKeyChar();
            if (Character.isDigit(keyChar)) {
                    //is int
                } else {
                    //not int
                    rollnofield.setText("");
                }
    }//GEN-LAST:event_rollnofieldKeyReleased

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
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressfield;
    private javax.swing.JLabel backlbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton chooseid;
    private javax.swing.JButton chooseprofile;
    private javax.swing.JLabel closelbl;
    private javax.swing.JLabel createbtn;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel eyecloselbl;
    private javax.swing.JLabel eyeopenlbl;
    private javax.swing.JComboBox<String> facultycombobox;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JLabel imagelbl1;
    private javax.swing.JLabel imglbl1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logolbl;
    private javax.swing.JTextField namefield;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField phonefield;
    private javax.swing.JTextField rollnofield;
    private javax.swing.JLabel rollnolbl;
    private javax.swing.JLabel signuppage_background;
    private javax.swing.JRadioButton studentradio;
    private javax.swing.JRadioButton teacherradio;
    // End of variables declaration//GEN-END:variables
}
