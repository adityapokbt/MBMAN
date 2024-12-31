/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package adityajava;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author aditya
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
            public void resize_sideimg(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("sidelogo.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(sidebar_logolbl.getWidth(), sidebar_logolbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
sidebar_logolbl.setIcon(scaledicon); // transform it back
    }
        public void resize_img(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("logo.jpg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(logolbl.getWidth(), logolbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
logolbl.setIcon(scaledicon); // transform it back
    }
               public void resizesecond_img(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("logo.jpg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(slidelogolbl.getWidth(), slidelogolbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
slidelogolbl.setIcon(scaledicon); // transform it back
    }
                public void resize_searchicon(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("search.jpg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(searchlbl.getWidth(), searchlbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
searchlbl.setIcon(scaledicon); // transform it back
    }
                          public void message_icon(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("message.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(message_icon.getWidth(), message_icon.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
message_icon.setIcon(scaledicon); // transform it back
    }
             public void notification_icon(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("notification.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(notification.getWidth(), notification.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
notification.setIcon(scaledicon); // transform it back
    }
                  public void user_icon(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("user.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(usericon.getWidth(), usericon.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
usericon.setIcon(scaledicon); // transform it back
    }
                             public void background_img(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("background.png")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(backgroundlbl.getWidth(), backgroundlbl.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
backgroundlbl.setIcon(scaledicon); // transform it back
    }
          public void Event_option1(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("roboticphoto.JPG")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(Eventlbl1.getWidth(), Eventlbl1.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
Eventlbl1.setIcon(scaledicon); // transform it back
    }
             public void Event_option2(){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("programmer.jpg")); // load the image to a imageIcon
Image image = imageIcon.getImage(); // transform it 
Image newimg = image.getScaledInstance(eventoption2.getWidth(), eventoption2.getHeight(),Image.SCALE_SMOOTH);
ImageIcon scaledicon =new ImageIcon(newimg);// scale it the smooth way  
eventoption2.setIcon(scaledicon); // transform it back
    }
             
    public Dashboard() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        resize_img();
        resize_searchicon();
        resize_sideimg();
        resizesecond_img();
        message_icon();
        notification_icon();
        user_icon();
        background_img();
        Event_option1();
        Event_option2();
       
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_Panel = new javax.swing.JPanel();
        slidelogolbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Imgpanel = new javax.swing.JPanel();
        userimg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logolbl = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        searchlbl = new javax.swing.JLabel();
        logolbl1 = new javax.swing.JLabel();
        message_icon = new javax.swing.JLabel();
        notification = new javax.swing.JLabel();
        usericon = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        message_panel = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        message_Title = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        messageTextarea = new javax.swing.JTextArea();
        notification_panel = new javax.swing.JPanel();
        notification_title_lbl = new javax.swing.JLabel();
        notification_text = new javax.swing.JTextArea();
        userpanel = new javax.swing.JPanel();
        logoutbtn = new javax.swing.JLabel();
        signupbtn = new javax.swing.JLabel();
        loginbtn = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        Eventlbl1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        eventoption2 = new javax.swing.JLabel();
        backgroundlbl = new javax.swing.JLabel();
        sidebar_logolbl = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                formMouseWheelMoved(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        side_Panel.setBackground(new java.awt.Color(102, 102, 102));
        side_Panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        side_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        side_Panel.add(slidelogolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        side_Panel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 281, 246, -1));

        Imgpanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout ImgpanelLayout = new javax.swing.GroupLayout(Imgpanel);
        Imgpanel.setLayout(ImgpanelLayout);
        ImgpanelLayout.setHorizontalGroup(
            ImgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userimg, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        ImgpanelLayout.setVerticalGroup(
            ImgpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userimg, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
        );

        side_Panel.add(Imgpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("MBMAN");
        side_Panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hi ,");
        side_Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("User Name");
        side_Panel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 134, -1));

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel15.setText("Routine Management");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        side_Panel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 246, -1));

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel10.setText("Library Management");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side_Panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel11.setText("Records Management");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side_Panel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 246, -1));

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel12.setText("Accounting");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        side_Panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 246, -1));

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel13.setText("Administration");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        side_Panel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 246, -1));

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel14.setText("Attendance");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side_Panel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 246, -1));

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel16.setText("Manage Lab");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side_Panel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 246, -1));

        jLabel17.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel17.setText("Manage Class");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        side_Panel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 246, -1));

        jLabel18.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel18.setText("Questions");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        side_Panel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 246, -1));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setText("Calender");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        side_Panel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 740, 246, -1));

        getContentPane().add(side_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 250, 860));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("MBMAN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 110, 50));
        jPanel2.add(logolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        jTextField1.setBackground(new java.awt.Color(236, 236, 237));
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 2, true));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 670, 30));

        searchlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/search.jpg"))); // NOI18N
        jPanel2.add(searchlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, 40, 30));
        jPanel2.add(logolbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 30));

        message_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/message.png"))); // NOI18N
        message_icon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                message_iconMouseMoved(evt);
            }
        });
        message_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                message_iconMouseClicked(evt);
            }
        });
        jPanel2.add(message_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 40, 30));

        notification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/notification.png"))); // NOI18N
        notification.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                notificationMouseMoved(evt);
            }
        });
        notification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notificationMouseClicked(evt);
            }
        });
        jPanel2.add(notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 10, 40, 30));

        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/user.png"))); // NOI18N
        usericon.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                usericonMouseMoved(evt);
            }
        });
        usericon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usericonMouseClicked(evt);
            }
        });
        jPanel2.add(usericon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1400, 10, 30, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1520, 50));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(37, 64, 74));
        jPanel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel16MouseMoved(evt);
            }
        });
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        message_panel.setBackground(new java.awt.Color(51, 51, 51));
        message_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        message_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        message_Title.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        message_Title.setForeground(new java.awt.Color(153, 0, 0));
        message_Title.setText("User");

        messageTextarea.setEditable(false);
        messageTextarea.setBackground(new java.awt.Color(51, 51, 51));
        messageTextarea.setColumns(20);
        messageTextarea.setFont(new java.awt.Font("Helvetica Neue", 1, 12)); // NOI18N
        messageTextarea.setForeground(new java.awt.Color(255, 255, 255));
        messageTextarea.setRows(5);
        messageTextarea.setText("This is the message of user");
        messageTextarea.setBorder(null);
        jScrollPane2.setViewportView(messageTextarea);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        message_panel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 110));

        jPanel16.add(message_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 300, 310));

        notification_panel.setBackground(new java.awt.Color(51, 51, 51));
        notification_panel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        notification_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notification_title_lbl.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        notification_title_lbl.setForeground(new java.awt.Color(153, 0, 0));
        notification_title_lbl.setText("  User");
        notification_panel.add(notification_title_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, -1));

        notification_text.setEditable(false);
        notification_text.setBackground(new java.awt.Color(51, 51, 51));
        notification_text.setColumns(20);
        notification_text.setForeground(new java.awt.Color(255, 255, 255));
        notification_text.setRows(5);
        notification_text.setText("This is the notification message to sow.\n");
        notification_text.setBorder(null);
        notification_panel.add(notification_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 260, 80));

        jPanel16.add(notification_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, 120));

        userpanel.setBackground(new java.awt.Color(51, 51, 51));
        userpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        userpanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                userpanelMouseMoved(evt);
            }
        });
        userpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutbtn.setText("LOGOUT");
        logoutbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        userpanel.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, 40));

        signupbtn.setForeground(new java.awt.Color(255, 255, 255));
        signupbtn.setText("SIGN UP");
        signupbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        signupbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupbtnMouseClicked(evt);
            }
        });
        userpanel.add(signupbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, 40));

        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("LOGIN");
        loginbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnMouseClicked(evt);
            }
        });
        userpanel.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        jPanel16.add(userpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, 170));

        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        jLabel4.setText("                             MADAN BHANDARI MEMORIAL ACADEMY NEPAL COPYRIGHT@ 2081 BUID BY ADITYA GROUP AUTHORIZED GROUP...");
        jPanel14.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 3, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("ABOUT US");
        jPanel14.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, -1, -1));

        jPanel16.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 1230, 40));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(204, 204, 204));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Helvetica Neue", 3, 48)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("    ROBOTICS");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 390, 260));

        Eventlbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/roboticphoto.JPG"))); // NOI18N
        Eventlbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102)));
        jPanel17.add(Eventlbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 530, 450));

        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 530, 450));

        jPanel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(51, 51, 51), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204)));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Helvetica Neue", 3, 45)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText(" WEB DEVELOPMENT");
        jPanel18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 480, 440));

        eventoption2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/programmer.jpg"))); // NOI18N
        jPanel18.add(eventoption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 440));

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 470, 440));

        backgroundlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/background.png"))); // NOI18N
        jPanel1.add(backgroundlbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 470));

        jPanel16.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 1110, 470));

        sidebar_logolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adityajava/sidelogo.png"))); // NOI18N
        jPanel16.add(sidebar_logolbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 30, 30));

        jLabel20.setFont(new java.awt.Font("Helvetica Neue", 3, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Events,");
        jPanel16.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 70, 30));

        jPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 860));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 1210, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        notification_panel.setVisible(false);
        message_panel.setVisible(false);
        userpanel.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void usericonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonMouseClicked
        // TODO add your handling code here:
        int count=evt.getClickCount();
        if(count==1){
            userpanel.setVisible(true);
        notification_panel.setVisible(false);
        message_panel.setVisible(false);
        }else if(count%2==0){
               notification_panel.setVisible(false);
         message_panel.setVisible(false);
        userpanel.setVisible(false);
        }else{
              userpanel.setVisible(true);
        notification_panel.setVisible(false);
        message_panel.setVisible(false); 
        }
        
        
    }//GEN-LAST:event_usericonMouseClicked

    private void notificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationMouseClicked
        // TODO add your handling code here:
                int count=evt.getClickCount();
        if(count==1){
            userpanel.setVisible(false);
        notification_panel.setVisible(true);
        message_panel.setVisible(false);
        }else if(count%2==0){
               notification_panel.setVisible(false);
         message_panel.setVisible(false);
        userpanel.setVisible(false);
        }else{
              userpanel.setVisible(false);
        notification_panel.setVisible(true);
        message_panel.setVisible(false); 
        }
 
    }//GEN-LAST:event_notificationMouseClicked

    private void message_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message_iconMouseClicked
        // TODO add your handling code here:
              int count=evt.getClickCount();
        if(count==1){
            userpanel.setVisible(false);
        notification_panel.setVisible(false);
        message_panel.setVisible(true);
        }else if(count%2==0){
               notification_panel.setVisible(false);
         message_panel.setVisible(false);
        userpanel.setVisible(false);
        }else{
              userpanel.setVisible(false);
        notification_panel.setVisible(false);
        message_panel.setVisible(true); 
        }
    }//GEN-LAST:event_message_iconMouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        // TODO add your handling code here:
         notification_panel.setVisible(false);
         message_panel.setVisible(false);
        userpanel.setVisible(false);
    }//GEN-LAST:event_jPanel16MouseClicked

    private void usericonMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usericonMouseMoved
        // TODO add your handling code here:
               userpanel.setVisible(true);
        notification_panel.setVisible(false);
        message_panel.setVisible(false); 
    }//GEN-LAST:event_usericonMouseMoved

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_formMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseWheelMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:

     
    }//GEN-LAST:event_formMouseMoved

    private void userpanelMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userpanelMouseMoved
        // TODO add your handling code here:
            userpanel.setVisible(true);
        notification_panel.setVisible(false);
        message_panel.setVisible(false); 
    }//GEN-LAST:event_userpanelMouseMoved

    private void notificationMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notificationMouseMoved
        // TODO add your handling code here:
         userpanel.setVisible(false);
        notification_panel.setVisible(true);
        message_panel.setVisible(false); 
    }//GEN-LAST:event_notificationMouseMoved

    private void message_iconMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_message_iconMouseMoved
        // TODO add your handling code here:
         userpanel.setVisible(false);
        notification_panel.setVisible(false);
        message_panel.setVisible(true); 
    }//GEN-LAST:event_message_iconMouseMoved

    private void jPanel16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseMoved
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jPanel16MouseMoved

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        // TODO add your handling code here:
        //all false
          
        
    }//GEN-LAST:event_jPanel2MouseMoved

    private void loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnMouseClicked
        // TODO add your handling code here:
        loginpage login = new loginpage();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginbtnMouseClicked

    private void signupbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupbtnMouseClicked
        // TODO add your handling code here:
        SignUP signup = new SignUP();
        signup.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_signupbtnMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Eventlbl1;
    private javax.swing.JPanel Imgpanel;
    private javax.swing.JLabel backgroundlbl;
    private javax.swing.JLabel eventoption2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel loginbtn;
    private javax.swing.JLabel logolbl;
    private javax.swing.JLabel logolbl1;
    private javax.swing.JLabel logoutbtn;
    private javax.swing.JTextArea messageTextarea;
    private javax.swing.JLabel message_Title;
    private javax.swing.JLabel message_icon;
    private javax.swing.JPanel message_panel;
    private javax.swing.JLabel notification;
    private javax.swing.JPanel notification_panel;
    private javax.swing.JTextArea notification_text;
    private javax.swing.JLabel notification_title_lbl;
    private javax.swing.JLabel searchlbl;
    private javax.swing.JPanel side_Panel;
    private javax.swing.JLabel sidebar_logolbl;
    private javax.swing.JLabel signupbtn;
    private javax.swing.JLabel slidelogolbl;
    private javax.swing.JLabel usericon;
    private javax.swing.JLabel userimg;
    private javax.swing.JPanel userpanel;
    // End of variables declaration//GEN-END:variables
}
