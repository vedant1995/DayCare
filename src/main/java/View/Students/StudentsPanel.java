/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Students;

import Controller.ImageHelper;
import Model.AbstractPerson;
import Model.School;
import Model.Student;
import java.awt.CardLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vedan
 */
public class StudentsPanel extends javax.swing.JPanel {

    private JPanel container;
    private School school;
    private Map<JButton, String> buttonIconMap = new HashMap<>();

    /**
     * Creates new form StudentsPanel
     */
    public StudentsPanel(JPanel container, School school) {
        initComponents();
        this.container = container;
        this.school = school;
        buttonIconMap.put(immunizationButton, "/icons/immunization.png");
        buttonIconMap.put(registrationButton, "/icons/renewal.png");

        ImageHelper imageHelper = new ImageHelper();

        for (Map.Entry<JButton, String> button : buttonIconMap.entrySet()) {
            imageHelper.scaleAndSetButtonIcon(button.getValue(), button.getKey(), 100, 100);
        }

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) studentsTable.getModel();
        model.setRowCount(0);

        for (AbstractPerson student : school.getStudentList()) {
            Object[] row = new Object[5];
            Student s = (Student) student;
            row[0] = student.getId();
            row[1] = student.getAge();
            row[2] = student.getFirstName();
            row[3] = student.getLastName();
            row[4] = s.getGPA();
            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentsTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        addStudentButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        immunizationButton = new javax.swing.JButton();
        registrationButton = new javax.swing.JButton();
        viewStudentButton = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Students");

        studentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Age", "Firstname", "Lastname", "GPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(studentsTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        addStudentButton.setText("Add student");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        immunizationButton.setBackground(java.awt.SystemColor.inactiveCaption);
        immunizationButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        immunizationButton.setText("Immunization");
        immunizationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                immunizationButtonActionPerformed(evt);
            }
        });
        jPanel3.add(immunizationButton);

        registrationButton.setBackground(java.awt.SystemColor.inactiveCaption);
        registrationButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registrationButton.setText("Registration ");
        registrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrationButtonActionPerformed(evt);
            }
        });
        jPanel3.add(registrationButton);

        viewStudentButton.setText("View details");
        viewStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(viewStudentButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addStudentButton))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(176, 176, 176)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewStudentButton)
                            .addComponent(addStudentButton)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        // TODO add your handling code here:
        AddStudentPanel p = new AddStudentPanel(container, school);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add(p);
        layout.next(container);
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void viewStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStudentButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = studentsTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        int studentId = (int) studentsTable.getValueAt(selectedRow, 0);
        AbstractPerson selectedStudent = school.findStudentById(studentId);
        if (selectedStudent != null) {
            StudentInformationPanel studentInfoPanel = new StudentInformationPanel(container, selectedStudent);
            container.add(studentInfoPanel);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.next(container);
        }
        // AbstractPerson selectedStudent = (AbstractPerson) studentsTable.getValueAt(selectedRow, 4);
    }//GEN-LAST:event_viewStudentButtonActionPerformed

    private void registrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrationButtonActionPerformed
        // TODO add your handling code here:
        RegistrationPanel rp = new RegistrationPanel(container, school);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add(rp);
        layout.next(container);
    }//GEN-LAST:event_registrationButtonActionPerformed

    private void immunizationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_immunizationButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_immunizationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton immunizationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton registrationButton;
    private javax.swing.JTable studentsTable;
    private javax.swing.JButton viewStudentButton;
    // End of variables declaration//GEN-END:variables
}
