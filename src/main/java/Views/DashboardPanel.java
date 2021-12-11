/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Model.Admin;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author vedan
 */
public class DashboardPanel extends javax.swing.JPanel {

    private JPanel mainContainer;
    private Admin admin;
    private Map<JButton, String> buttonIconMap  = new HashMap<>();

    /**
     * Creates new form DashboardPanel
     */
    public DashboardPanel(JPanel mainContainer, Admin admin) {
        initComponents();
        
        buttonIconMap.put(studentsButton, "/icons/student.png");
        buttonIconMap.put(teachersButton, "/icons/teacher.png");
        buttonIconMap.put(classroomsButton, "/icons/classroom.png");
        buttonIconMap.put(immunizationButton, "/icons/immunization.png");
        buttonIconMap.put(registrationButton, "/icons/renewal.png");
        buttonIconMap.put(empReviewButton, "/icons/reviews.png");
        
        for(Map.Entry<JButton, String> button : buttonIconMap.entrySet()){
            scaleandSetTileImage(button.getValue(), button.getKey());
        }
        // scaleandSetTileImage("/icons/students.png", studentsButton);
        this.mainContainer = mainContainer;
        this.admin = admin;
        userGreetingLabel.setText("Hello, " + admin.getName());
        // teacherLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/teacher64.png")));
    }

    public void scaleandSetTileImage(String imagePath, JButton button) {
        System.out.println(imagePath);
        ImageIcon imageIcon = createImageIcon(imagePath, "Tile image");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        imageIcon = new ImageIcon(newimg);
        button.setIcon(imageIcon);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);
        button.setHorizontalTextPosition(SwingConstants.CENTER);
    }

    private ImageIcon createImageIcon(String path, String description) {
        URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL, description);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    private void tileMouseExited(java.awt.event.MouseEvent evt) {
        // TODO add your handling code here:
        this.setBackground(new Color(195, 205, 219));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        logoutButton = new javax.swing.JButton();
        userGreetingLabel = new javax.swing.JLabel();
        daycareLabel = new javax.swing.JLabel();
        dashboardContainer = new javax.swing.JPanel();
        homePanel = new javax.swing.JPanel();
        studentsTile = new javax.swing.JPanel();
        studentsButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        teachersButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        classroomsButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        immunizationButton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        registrationButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        empReviewButton = new javax.swing.JButton();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        logoutButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        userGreetingLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userGreetingLabel.setText("Hello, ");

        daycareLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        daycareLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daycareLabel.setText("DAYCARE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(daycareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userGreetingLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutButton)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logoutButton)
                    .addComponent(userGreetingLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(daycareLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel1);

        dashboardContainer.setLayout(new java.awt.CardLayout(10, 10));

        homePanel.setBackground(new java.awt.Color(255, 255, 255));
        homePanel.setLayout(new java.awt.GridLayout(2, 3, 10, 10));

        studentsTile.setBackground(java.awt.SystemColor.inactiveCaption);
        studentsTile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsTileMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                studentsTileMousePressed(evt);
            }
        });

        studentsButton.setBackground(java.awt.SystemColor.inactiveCaption);
        studentsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        studentsButton.setText("Students");
        studentsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentsTileLayout = new javax.swing.GroupLayout(studentsTile);
        studentsTile.setLayout(studentsTileLayout);
        studentsTileLayout.setHorizontalGroup(
            studentsTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );
        studentsTileLayout.setVerticalGroup(
            studentsTileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(studentsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        homePanel.add(studentsTile);

        jPanel4.setBackground(java.awt.SystemColor.inactiveCaption);

        teachersButton.setBackground(java.awt.SystemColor.inactiveCaption);
        teachersButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        teachersButton.setText("Teachers");
        teachersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teachersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(teachersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        homePanel.add(jPanel4);

        jPanel5.setBackground(java.awt.SystemColor.inactiveCaption);

        classroomsButton.setBackground(java.awt.SystemColor.inactiveCaption);
        classroomsButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        classroomsButton.setText("Classrooms");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classroomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(classroomsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        homePanel.add(jPanel5);

        jPanel6.setBackground(java.awt.SystemColor.inactiveCaption);

        immunizationButton.setBackground(java.awt.SystemColor.inactiveCaption);
        immunizationButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        immunizationButton.setText("Immunization");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(immunizationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(immunizationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        homePanel.add(jPanel6);

        jPanel7.setBackground(java.awt.SystemColor.inactiveCaption);

        registrationButton.setBackground(java.awt.SystemColor.inactiveCaption);
        registrationButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registrationButton.setText("Registration");
        registrationButton.setToolTipText("");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        homePanel.add(jPanel7);

        empReviewButton.setBackground(java.awt.SystemColor.inactiveCaption);
        empReviewButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        empReviewButton.setText("Employee reviews");
        empReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empReviewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empReviewButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empReviewButton, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
        );

        homePanel.add(jPanel2);

        dashboardContainer.add(homePanel, "card2");

        jSplitPane1.setRightComponent(dashboardContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        // TODO add your handling code here:
        mainContainer.remove(this);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        layout.previous(mainContainer);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void studentsTileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsTileMouseClicked
        // TODO add your handling code here:
        StudentsPanel dp = new StudentsPanel(dashboardContainer);
        CardLayout layout = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(dp);
        layout.next(dashboardContainer);
    }//GEN-LAST:event_studentsTileMouseClicked

    private void studentsTileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsTileMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentsTileMousePressed

    private void empReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empReviewButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empReviewButtonActionPerformed

    private void studentsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsButtonActionPerformed
        // TODO add your handling code here:
        StudentsPanel dp = new StudentsPanel(dashboardContainer);
        CardLayout layout = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(dp);
        layout.next(dashboardContainer);
    }//GEN-LAST:event_studentsButtonActionPerformed

    private void teachersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersButtonActionPerformed
        // TODO add your handling code here:
        StudentsPanel dp = new StudentsPanel(dashboardContainer);
        CardLayout layout = (CardLayout) dashboardContainer.getLayout();
        dashboardContainer.add(dp);
        layout.next(dashboardContainer);
    }//GEN-LAST:event_teachersButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton classroomsButton;
    private javax.swing.JPanel dashboardContainer;
    private javax.swing.JLabel daycareLabel;
    private javax.swing.JButton empReviewButton;
    private javax.swing.JPanel homePanel;
    private javax.swing.JButton immunizationButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton registrationButton;
    private javax.swing.JButton studentsButton;
    private javax.swing.JPanel studentsTile;
    private javax.swing.JButton teachersButton;
    private javax.swing.JLabel userGreetingLabel;
    // End of variables declaration//GEN-END:variables
}
