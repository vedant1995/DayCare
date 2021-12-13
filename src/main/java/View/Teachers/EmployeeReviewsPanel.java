/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Teachers;

import Model.Classroom;
import Model.School;
import Model.Teacher;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
import javax.swing.JPanel;

/**
 *
 * @author vedan
 */
public class EmployeeReviewsPanel extends javax.swing.JPanel {
    
    private JPanel container;
    private List<Teacher> teachers;
    private School school;

    /**
     * Creates new form EmployeeReviews
     */
    public EmployeeReviewsPanel(JPanel container, School school) {
        initComponents();
        this.container = container;
        this.school = school;
        populateTeacherReviewDates();
    }
    
    private void populateTeacherReviewDates() {
        List<Teacher> allTeachers = new ArrayList<>();
        
        for (Classroom classroom : school.getClassroomList()) {
            for (Teacher t : classroom.getTeacherList()) {
                allTeachers.add(t);
                // reviewTextArea.append(t.getFirstName() + " " + t.getLastName() + " review due on " + t.getReviewDate().toString() + "\n");
            }
        }
        
        List<Teacher> sorted = allTeachers.stream().sorted(Comparator.comparing(Teacher::getReviewDate)).collect(toList());
        
        sorted.forEach(t -> reviewTextArea.append(t.getFirstName() + " " + t.getLastName() + " review due on " + t.getReviewDate().toString() + "\n"));        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        reviewTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1100, 700));

        reviewTextArea.setColumns(20);
        reviewTextArea.setRows(5);
        jScrollPane1.setViewportView(reviewTextArea);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Upcoming employee reviews");

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(292, 292, 292)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton)
                    .addComponent(jLabel1))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea reviewTextArea;
    // End of variables declaration//GEN-END:variables
}
