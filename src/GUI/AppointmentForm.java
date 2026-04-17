package GUI;

import java.util.List;
import java.util.Map;

public class AppointmentForm extends javax.swing.JDialog {

    public AppointmentForm(java.awt.Frame parent) {
        super(parent, "Appointment Form", true);
        initComponents();
        txtDate.setToolTipText("Enter date as YYYY-MM-DD  e.g. 2025-06-15");
        txtDate.setText("YYYY-MM-DD");
        txtDate.setForeground(java.awt.Color.GRAY);

        txtDate.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent e) {
                if (txtDate.getText().equals("YYYY-MM-DD")) {
                    txtDate.setText("");
                    txtDate.setForeground(java.awt.Color.BLACK);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent e) {
                if (txtDate.getText().trim().isEmpty()) {
                    txtDate.setText("YYYY-MM-DD");
                    txtDate.setForeground(java.awt.Color.GRAY);
                }
            }
        });

        setLocationRelativeTo(parent);
        txtPatientID.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                lookupPatientName();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                lookupPatientName();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                lookupPatientName();
            }
        });
    }

    private Invoker.AppointmentManager appointmentManager = new Invoker.AppointmentManager();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jImagePanel1 = new main.JImagePanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cmbDoctor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmbType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbTimeSlot = new javax.swing.JComboBox<>();
        btnBook = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Appointment Scheduling");

        jImagePanel1.setCenterImage(true);
        jImagePanel1.setFitToPanel(true);
        jImagePanel1.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome_Page_Logo-Photoroom.png"))); // NOI18N
        jImagePanel1.setSmoothRendering(true);

        javax.swing.GroupLayout jImagePanel1Layout = new javax.swing.GroupLayout(jImagePanel1);
        jImagePanel1.setLayout(jImagePanel1Layout);
        jImagePanel1Layout.setHorizontalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jImagePanel1Layout.setVerticalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(381, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Patient ID :");

        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Name :");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor /Specialist", "Date", "Time Slot", "Status (Available / Booked)"
            }
        ));
        jScrollPane1.setViewportView(appointmentTable);

        jLabel4.setText("Doctor / Specialist :");

        cmbDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cardiologist", "Dentist", "Surgeon" }));
        cmbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorActionPerformed(evt);
            }
        });

        jLabel6.setText("Appointment Type :");

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Consultation ", "Diagnostics ", "Surgery." }));

        jLabel7.setText("Date:");

        jLabel8.setText("Time Slot :");

        cmbTimeSlot.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "9:00 AM – 10:00 AM", "10:00 AM – 11:00 AM" }));

        btnBook.setBackground(new java.awt.Color(0, 153, 0));
        btnBook.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnBook.setText("Book Appointment");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(0, 0, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel Appointment");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnView.setBackground(new java.awt.Color(0, 51, 0));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(255, 255, 255));
        btnView.setText("View Appointments");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addComponent(txtName))
                    .addComponent(cmbDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbTimeSlot, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBook, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbTimeSlot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnBook)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnView)
                        .addGap(19, 19, 19))))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        String pidText = txtPatientID.getText().trim();

        if (pidText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please enter a Patient ID.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int patientId;
        try {
            patientId = Integer.parseInt(pidText);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Invalid Patient ID.", "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        String doctor = cmbDoctor.getSelectedItem().toString();
        String type = cmbType.getSelectedItem().toString();
        String date = txtDate.getText().trim();
        String timeSlot = cmbTimeSlot.getSelectedItem().toString();

        if (doctor.equals("Select") || type.equals("Select") || timeSlot.equals("Select")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please select Doctor, Type and Time Slot.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (date.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please enter a date (YYYY-MM-DD).", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean booked = Model.AppointmentDAO.bookAppointment(
                patientId, doctor, type, date, timeSlot);

        if (booked) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "✅ Appointment booked successfully!", "Success",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            refreshAppointmentTable(patientId);   // ← auto-refresh table
            clearFields();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to book appointment.", "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnBookActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int selectedRow = appointmentTable.getSelectedRow();

        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please select a row from the table to cancel.",
                    "No Row Selected", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String pidText = txtPatientID.getText().trim();
        if (pidText.isEmpty()) {
            return;
        }
        int patientId = Integer.parseInt(pidText);

        List<Map<String, Object>> rows
                = Model.AppointmentDAO.getAppointments(patientId);

        if (selectedRow >= rows.size()) {
            return;
        }

        int appointmentId = (int) rows.get(selectedRow).get("appointment_id");

        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Cancel this appointment?", "Confirm",
                javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.WARNING_MESSAGE);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            boolean cancelled = Model.AppointmentDAO.cancelAppointment(appointmentId);
            if (cancelled) {
                refreshAppointmentTable(patientId);
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Appointment cancelled.", "Done",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        String pidText = txtPatientID.getText().trim();

        if (pidText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please enter a Patient ID.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int patientId;
        try {
            patientId = Integer.parseInt(pidText);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Invalid Patient ID.", "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        refreshAppointmentTable(patientId);

        Model.Patient p = Model.PatientDAO.getPatientById(patientId);
        if (p != null) {
            txtName.setText(p.getFullName());
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No patient found with ID: " + patientId,
                    "Not Found", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void cmbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDoctorActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void refreshAppointmentTable(int patientId) {
        List<Map<String, Object>> rows
                = Model.AppointmentDAO.getAppointments(patientId);

        javax.swing.table.DefaultTableModel tModel
                = (javax.swing.table.DefaultTableModel) appointmentTable.getModel();
        tModel.setRowCount(0);

        for (Map<String, Object> row : rows) {
            tModel.addRow(new Object[]{
                row.get("doctor"),
                row.get("appointment_date"),
                row.get("time_slot"),
                row.get("status")
            });
        }
    }

    private void clearFields() {
        cmbDoctor.setSelectedIndex(0);
        cmbType.setSelectedIndex(0);
        txtDate.setText("");
        cmbTimeSlot.setSelectedIndex(0);
    }

    private void lookupPatientName() {
        String pidText = txtPatientID.getText().trim();

        if (pidText.isEmpty()) {
            txtName.setText("");
            return;
        }

        int patientId;
        try {
            patientId = Integer.parseInt(pidText);
        } catch (NumberFormatException e) {
            txtName.setText("Invalid ID");
            return;
        }

        new javax.swing.SwingWorker<String, Void>() {
            @Override
            protected String doInBackground() {
                Model.Patient p = Model.PatientDAO.getPatientById(patientId);
                return (p != null) ? p.getFullName() : null;
            }

            @Override
            protected void done() {
                try {
                    String name = get();
                    if (name != null) {
                        txtName.setText(name);

                        refreshAppointmentTable(patientId);
                    } else {
                        txtName.setText("Not found");
                    }
                } catch (Exception ex) {
                    txtName.setText("");
                }
            }
        }.execute();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable appointmentTable;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbDoctor;
    private javax.swing.JComboBox<String> cmbTimeSlot;
    private javax.swing.JComboBox<String> cmbType;
    private main.JImagePanel jImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    // End of variables declaration//GEN-END:variables
}
