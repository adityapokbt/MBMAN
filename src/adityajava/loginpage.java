/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adityajava;
import java.awt.Color;
import static java.awt.Color.red;
import java.awt.Font;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.text.StyleConstants.Bold;
/**
 *
 * @author aditya
 */
public class loginpage extends javax.swing.JFrame {
public String role;
 public String selecteditem;
 public java.sql.Connection con;
 //public java.sql.Connection con1;
 public String profileImagePath;
 public String idImagePath;
 public void connectDB(){
          Statement st;
  
       ResultSet rs;
       ResultSet rs1;
       String studentemaildb=null;
       String studentpassworddb=null;
        String teacheremaildb=null;
       String teacherpassworddb=null;
    
       String query;
       String query1;
       String url;
       String username;
       String password;

     
              
       
        String emailfielduser = emailfield.getText().trim();
        String  passwordfielduser = passwordfield.getText().trim();
  
    //image path retriaval
   try{
         url= "jdbc:mysql://localhost:3306/Collage?zeroDateTimeBehavior=CONVERT_TO_NULL"; // table details
         username = "root"; // MySQL credentials
         password = "";
         //student
           query = "SELECT * FROM savestudent";
           Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
           con = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt = con.prepareStatement(query);
       
       //teacher

        
       rs = stmt.executeQuery();
     
       if(rs.next()){
           studentemaildb=rs.getString("email");
           studentpassworddb=rs.getString("password");
          
           if(emailfield.getText().contentEquals(studentemaildb)&&passwordfield.getText().contentEquals(studentpassworddb)){   
               Dashboard dashboard = new Dashboard();
               dashboard.setVisible(true);
                 con.close();
               stmt.close();
               rs.close();
               this.dispose();
               
           }
                
               }
               
           
       else{
           url= "jdbc:mysql://localhost:3306/Collage?zeroDateTimeBehavior=CONVERT_TO_NULL"; // table details
         username = "root"; // MySQL credentials
         password = "";
         //student
           query = "SELECT * FROM saveteacher";
           Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
           con = DriverManager.getConnection(url, username, password);
        PreparedStatement stmt1 = con.prepareStatement(query);
        rs1=stmt1.executeQuery();
               if(rs1.next()){
                   teacheremaildb=rs1.getString("email");
                   teacherpassworddb=rs1.getString("password");
                   
                   if(emailfield.getText().contentEquals(teacheremaildb)&&passwordfield.getText().contentEquals(teacherpassworddb)){
                          Dashboard dashboard = new Dashboard();
               dashboard.setVisible(true);
                 con.close();
               stmt.close();
               rs.close();
               this.dispose();
                   }else{
                    JOptionPane.showMessageDialog(null, "! Invalid details","Invalid user information",JOptionPane.ERROR_MESSAGE);   
                   }
                   }
       }
         
         
         
         
         
   }catch(Exception e){
      JOptionPane.showMessageDialog(null, e,"Database error connection",JOptionPane.ERROR_MESSAGE);
   }
    
    
    
    }
                public void resize_sideimg(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("background.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(LoginPage_background.getWidth(), LoginPage_background.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
LoginPage_background.setIcon(scaledicon); // transform it back
    }
                              public void resize_eyeopen(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("eyeopen.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(eyeopenlbl.getWidth(), eyeopenlbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
eyeopenlbl.setIcon(scaledicon); // transform it back
    }
                                            public void resize_eyeclose(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("eyeclose.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(eyecloselbl.getWidth(), eyecloselbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
eyecloselbl.setIcon(scaledicon); // transform it back
    }
                                                      public void backicon_logo(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("backicon.jpeg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(backlbl.getWidth(), backlbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
backlbl.setIcon(scaledicon); // transform it back
    } 
               public void resize_logo(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("logo.jpg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(logolbl.getWidth(), logolbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
logolbl.setIcon(scaledicon); // transform it back
    }       
         public void close_logo(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("close.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(closelbl.getWidth(), closelbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
closelbl.setIcon(scaledicon); // transform it back
    }   
         
    public loginpage() {
        initComponents();
        resize_sideimg();
        resize_logo();
        close_logo();
        backicon_logo();
        resize_eyeopen();
        resize_eyeclose();
        emailfield.setText("Enter your MBMAN email id....");
        emailfield.setForeground(Color.lightGray);
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
        closelbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        emailfield = new javax.swing.JTextField();
        passwordfield = new javax.swing.JPasswordField();
        logolbl = new javax.swing.JLabel();
        eyecloselbl = new javax.swing.JLabel();
        eyeopenlbl = new javax.swing.JLabel();
        backlbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        signuplbl = new javax.swing.JLabel();
        LoginPage_background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/close.png"))); // NOI18N
        closelbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closelblMouseClicked(evt);
            }
        });
        jPanel1.add(closelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 50, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 90, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, -1, -1));

        emailfield.setText("Enter your MBMAN email id....");
        emailfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emailfieldMouseClicked(evt);
            }
        });
        emailfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailfieldKeyTyped(evt);
            }
        });
        jPanel1.add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 470, 40));

        passwordfield.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jPanel1.add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 470, 40));
        jPanel1.add(logolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 70, 60));

        eyecloselbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/eyeclose.png"))); // NOI18N
        eyecloselbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyecloselblMouseClicked(evt);
            }
        });
        jPanel1.add(eyecloselbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 40, 40));

        eyeopenlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/eyeopen.png"))); // NOI18N
        eyeopenlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eyeopenlblMouseClicked(evt);
            }
        });
        jPanel1.add(eyeopenlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 330, 40, 40));

        backlbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backlblMouseClicked(evt);
            }
        });
        jPanel1.add(backlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email Id:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MADAN BHANDARI MEMORIAL ACADAMY NEPAL.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 610, 40));

        signuplbl.setText("Create new account?");
        signuplbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signuplblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signuplblMouseEntered(evt);
            }
        });
        jPanel1.add(signuplbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 220, 30));
        jPanel1.add(LoginPage_background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

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

    private void emailfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emailfieldMouseClicked
        // TODO add your handling code here:
        emailfield.setText("");
    }//GEN-LAST:event_emailfieldMouseClicked

    private void emailfieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailfieldKeyTyped
        // TODO add your handling code here:
         Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 15);
        emailfield.setFont(font);
        emailfield.setForeground(Color.BLACK);
    }//GEN-LAST:event_emailfieldKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        eyeopenlbl.setVisible(true);
        eyecloselbl.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void eyeopenlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyeopenlblMouseClicked
        // TODO add your handling code here:
   
                    passwordfield.setEchoChar('\0');
               
                    // Mask the characters again

                
        eyecloselbl.setVisible(true);
        eyeopenlbl.setVisible(false);
    }//GEN-LAST:event_eyeopenlblMouseClicked

    private void eyecloselblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eyecloselblMouseClicked
        // TODO add your handling code here:
          passwordfield.setEchoChar('*');
         eyecloselbl.setVisible(false);
        eyeopenlbl.setVisible(true);
    }//GEN-LAST:event_eyecloselblMouseClicked

    private void backlblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backlblMouseClicked
        // TODO add your handling code here:
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backlblMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        connectDB();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void signuplblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signuplblMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_signuplblMouseEntered

    private void signuplblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signuplblMouseClicked
        // TODO add your handling code here:
        SignUP signup= new SignUP();
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signuplblMouseClicked

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoginPage_background;
    private javax.swing.JLabel backlbl;
    private javax.swing.JLabel closelbl;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel eyecloselbl;
    private javax.swing.JLabel eyeopenlbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logolbl;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JLabel signuplbl;
    // End of variables declaration//GEN-END:variables
}
