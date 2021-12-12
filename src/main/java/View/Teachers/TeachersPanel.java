/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Teachers;

import View.Students.*;
import Model.AbstractPerson;
import Model.Classroom;
import Model.School;
import Model.Student;
import Model.Teacher;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vedan
 */
public class TeachersPanel extends javax.swing.JPanel {

    private JPanel container;
    private School school;

    /**
     * Creates new form StudentsPanel
     */
    public TeachersPanel(JPanel container, School school) {
        initComponents();
        this.container = container;
        this.school = school;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) teachersTable.getModel();
        model.setRowCount(0);

        // TODO: Add wage column to the table
        for (Classroom classroom
                : school.getClassroomList()) {
            List<Teacher> teachers = classroom.getTeacherList();
            // TODO: Display classroom id associated with the teacher if any?
            // Map<Teacher, Integer> teacherMap = new HashMap<>();
            for (Teacher teacher : teachers) {
                Object[] row = new Object[6];
                row[0] = teacher.getId();
                row[1] = teacher.getAge();
                row[2] = teacher.getFirstName();
                row[3] = teacher.getLastName();
                row[4] = teacher.getCount();
                row[5] = teacher.getSize();
                model.addRow(row);
            }
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
        teachersTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        viewTeacherButton = new javax.swing.JButton();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.Y_AXIS));

        backButton.setText("< Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Teachers");

        teachersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Age", "Firstname", "Lastname", "Count", "Size"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(teachersTable);

        viewTeacherButton.setText("View details");
        viewTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTeacherButtonActionPerformed(evt);
            }
        });
        jPanel1.add(viewTeacherButton);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        add(jPanel2);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backButtonActionPerformed

    private void viewTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTeacherButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = teachersTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        // Get the teacherId of the selected row from the table
        int teacherId = (int) teachersTable.getValueAt(selectedRow, 0);

        // AbstractPerson selectedTeacher = school.findTeacherById(teacherId);

        for (Classroom classroom : school.getClassroomList()) {
            List<Teacher> teachers = classroom.getTeacherList();
            for (Teacher teacher : teachers) {
                if (teacher.getId() == teacherId) {
                    TeacherInformationPanel teacherInfoPanel = new TeacherInformationPanel(container, teacher);
                    container.add(teacherInfoPanel);
                    CardLayout layout = (CardLayout) container.getLayout();
                    layout.next(container);
                    return;
                }
            }
        }
        System.out.println("Teacher not found");
        // AbstractPerson selectedStudent = (AbstractPerson) studentsTable.getValueAt(selectedRow, 4);
    }//GEN-LAST:event_viewTeacherButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable teachersTable;
    private javax.swing.JButton viewTeacherButton;
    // End of variables declaration//GEN-END:variables
}
