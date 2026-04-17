package GUI;

public class StaffRoleForm extends javax.swing.JDialog {

    private boolean isExistingStaff = false;  // tracks INSERT vs UPDATE mode

    public StaffRoleForm(java.awt.Frame parent) {
        super(parent, "BillingForm Form", true);
        initComponents();

        txtStaffId.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                lookupStaff();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                lookupStaff();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                lookupStaff();
            }
        });

        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jImagePanel1 = new main.JImagePanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtStaffId = new javax.swing.JTextField();
        txtStaffName = new javax.swing.JTextField();
        cmbRole = new javax.swing.JComboBox<>();
        cmbDepartment = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        chkViewRecords = new javax.swing.JCheckBox();
        chkEditRecords = new javax.swing.JCheckBox();
        chkDeleteRecords = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        chkPrescribeMeds = new javax.swing.JCheckBox();
        chkAccessDiagnostics = new javax.swing.JCheckBox();
        chkApproveSurgery = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        chkManageBilling = new javax.swing.JCheckBox();
        chkApproveClaims = new javax.swing.JCheckBox();
        chkManageStaff = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        btnSavePermissions = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnAssignRole = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(293, 59));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Staff Roles and Permissions Management");

        jImagePanel1.setCenterImage(true);
        jImagePanel1.setFitToPanel(true);
        jImagePanel1.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome_Page_Logo-Photoroom.png"))); // NOI18N
        jImagePanel1.setSmoothRendering(true);

        javax.swing.GroupLayout jImagePanel1Layout = new javax.swing.GroupLayout(jImagePanel1);
        jImagePanel1.setLayout(jImagePanel1Layout);
        jImagePanel1Layout.setHorizontalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );
        jImagePanel1Layout.setVerticalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Staff Information");

        jLabel4.setText("Staff ID :");

        jLabel5.setText("Staff Name :");

        jLabel6.setText("Role :");

        jLabel7.setText("Department :");

        txtStaffName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStaffNameActionPerformed(evt);
            }
        });

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Role", "Doctor ", "Nurse", "Pharmacist", "Administrator" }));

        cmbDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "Cardiology", "Pediatrics", "Pharmacy", "Administration" }));
        cmbDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDepartmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(94, 94, 94)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbDepartment, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtStaffName)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(56, 56, 56)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(33, 33, 33))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        chkViewRecords.setText("View Records");

        chkEditRecords.setText("Edit Records");

        chkDeleteRecords.setText("Delete Records");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkDeleteRecords)
                    .addComponent(chkEditRecords)
                    .addComponent(chkViewRecords))
                .addContainerGap(480, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chkViewRecords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkEditRecords)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkDeleteRecords)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("General", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        chkPrescribeMeds.setText("Prescribe Medicine");

        chkAccessDiagnostics.setText("Access Diagnostics");
        chkAccessDiagnostics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkAccessDiagnosticsActionPerformed(evt);
            }
        });

        chkApproveSurgery.setText("Approve Surgeries");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPrescribeMeds)
                    .addComponent(chkAccessDiagnostics)
                    .addComponent(chkApproveSurgery))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(chkPrescribeMeds)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkAccessDiagnostics)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkApproveSurgery)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Medical", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        chkManageBilling.setText("Manage Biling");

        chkApproveClaims.setText("Approve Claims");

        chkManageStaff.setText("Manage Staff");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkManageBilling)
                    .addComponent(chkApproveClaims)
                    .addComponent(chkManageStaff))
                .addContainerGap(476, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(chkManageBilling)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkApproveClaims)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chkManageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Administrative", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        btnSavePermissions.setBackground(new java.awt.Color(0, 102, 102));
        btnSavePermissions.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSavePermissions.setForeground(new java.awt.Color(255, 255, 255));
        btnSavePermissions.setText("Save Permissions");
        btnSavePermissions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePermissionsActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(102, 0, 51));
        btnClose.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnAssignRole.setBackground(new java.awt.Color(0, 102, 0));
        btnAssignRole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAssignRole.setForeground(new java.awt.Color(255, 255, 255));
        btnAssignRole.setText("AssignRole");
        btnAssignRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRoleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAssignRole)
                .addGap(18, 18, 18)
                .addComponent(btnSavePermissions, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReset)
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addGap(17, 17, 17))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSavePermissions)
                    .addComponent(btnReset)
                    .addComponent(btnClose)
                    .addComponent(btnAssignRole))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtStaffNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStaffNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStaffNameActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtStaffId.setText("");
        txtStaffName.setText("");
        cmbRole.setSelectedIndex(0);
        cmbDepartment.setSelectedIndex(0);
        chkViewRecords.setSelected(false);
        chkEditRecords.setSelected(false);
        chkDeleteRecords.setSelected(false);
        chkPrescribeMeds.setSelected(false);
        chkAccessDiagnostics.setSelected(false);
        chkApproveSurgery.setSelected(false);
        chkManageBilling.setSelected(false);
        chkApproveClaims.setSelected(false);
        chkManageStaff.setSelected(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void cmbDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDepartmentActionPerformed

    }//GEN-LAST:event_cmbDepartmentActionPerformed

    private void chkAccessDiagnosticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkAccessDiagnosticsActionPerformed

    }//GEN-LAST:event_chkAccessDiagnosticsActionPerformed

    private void btnSavePermissionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePermissionsActionPerformed

        btnAssignRoleActionPerformed(evt);
    }//GEN-LAST:event_btnSavePermissionsActionPerformed

    private void btnAssignRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRoleActionPerformed
        String staffId = txtStaffId.getText().trim();
        String name = txtStaffName.getText().trim();
        String role = cmbRole.getSelectedItem().toString().trim();
        String dept = cmbDepartment.getSelectedItem().toString();

        if (staffId.isEmpty() || name.isEmpty()
                || role.equals("Select Role") || dept.equals("Select Department")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "All fields are required.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        Flyweight.StaffMemberWithRole staffMember
                = new Flyweight.StaffMemberWithRole(staffId, name, dept, role);

        Flyweight.RolePermission perms = staffMember.getRole();
        chkViewRecords.setSelected(perms.isCanViewRecords());
        chkEditRecords.setSelected(perms.isCanEditRecords());
        chkDeleteRecords.setSelected(perms.isCanDeleteRecords());
        chkPrescribeMeds.setSelected(perms.isCanPrescribeMeds());
        chkAccessDiagnostics.setSelected(perms.isCanAccessDiagnostics());
        chkApproveSurgery.setSelected(perms.isCanApproveSurgery());
        chkManageBilling.setSelected(perms.isCanManageBilling());
        chkApproveClaims.setSelected(perms.isCanApproveClaims());
        chkManageStaff.setSelected(perms.isCanManageStaff());

        boolean ok = isExistingStaff
                ? Model.StaffDAO.updateStaff(staffId, name, role, dept,
                        perms.isCanViewRecords(), perms.isCanEditRecords(), perms.isCanDeleteRecords(),
                        perms.isCanPrescribeMeds(), perms.isCanAccessDiagnostics(), perms.isCanApproveSurgery(),
                        perms.isCanManageBilling(), perms.isCanApproveClaims(), perms.isCanManageStaff())
                : Model.StaffDAO.insertStaff(staffId, name, role, dept,
                        perms.isCanViewRecords(), perms.isCanEditRecords(), perms.isCanDeleteRecords(),
                        perms.isCanPrescribeMeds(), perms.isCanAccessDiagnostics(), perms.isCanApproveSurgery(),
                        perms.isCanManageBilling(), perms.isCanApproveClaims(), perms.isCanManageStaff());

        if (ok) {
            isExistingStaff = true;
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Role assigned using Flyweight Pattern!\nRole: " + role,
                    "Saved", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void lookupStaff() {
        String staffId = txtStaffId.getText().trim();

        if (staffId.isEmpty()) {
            clearFields();
            isExistingStaff = false;
            return;
        }

        new javax.swing.SwingWorker<java.util.Map<String, Object>, Void>() {
            @Override
            protected java.util.Map<String, Object> doInBackground() {
                return Model.StaffDAO.getStaffById(staffId);
            }

            @Override
            protected void done() {
                try {
                    java.util.Map<String, Object> data = get();

                    if (!data.isEmpty()) {
                        isExistingStaff = true;

                        txtStaffName.setText((String) data.get("staff_name"));
                        cmbRole.setSelectedItem(data.get("role"));
                        cmbDepartment.setSelectedItem(data.get("department"));

                        chkViewRecords.setSelected((Boolean) data.get("perm_general_view"));
                        chkEditRecords.setSelected((Boolean) data.get("perm_general_edit"));
                        chkDeleteRecords.setSelected((Boolean) data.get("perm_general_delete"));

                        chkPrescribeMeds.setSelected((Boolean) data.get("perm_medical_view"));
                        chkAccessDiagnostics.setSelected((Boolean) data.get("perm_medical_edit"));
                        chkApproveSurgery.setSelected((Boolean) data.get("perm_medical_delete"));

                        chkManageBilling.setSelected((Boolean) data.get("perm_admin_view"));
                        chkApproveClaims.setSelected((Boolean) data.get("perm_admin_edit"));
                        chkManageStaff.setSelected((Boolean) data.get("perm_admin_delete"));

                    } else {
                        isExistingStaff = false;
                        clearFields();
                    }

                } catch (Exception ex) {
                    System.err.println("lookupStaff error: " + ex.getMessage());
                }
            }
        }.execute();
    }//GEN-LAST:event_btnAssignRoleActionPerformed

    private void clearFields() {
        txtStaffName.setText("");
        cmbRole.setSelectedIndex(0);
        cmbDepartment.setSelectedIndex(0);
        // General
        chkViewRecords.setSelected(false);
        chkEditRecords.setSelected(false);
        chkDeleteRecords.setSelected(false);
        // Medical
        chkPrescribeMeds.setSelected(false);
        chkAccessDiagnostics.setSelected(false);
        chkApproveSurgery.setSelected(false);
        // Administrative
        chkManageBilling.setSelected(false);
        chkApproveClaims.setSelected(false);
        chkManageStaff.setSelected(false);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRole;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSavePermissions;
    private javax.swing.JCheckBox chkAccessDiagnostics;
    private javax.swing.JCheckBox chkApproveClaims;
    private javax.swing.JCheckBox chkApproveSurgery;
    private javax.swing.JCheckBox chkDeleteRecords;
    private javax.swing.JCheckBox chkEditRecords;
    private javax.swing.JCheckBox chkManageBilling;
    private javax.swing.JCheckBox chkManageStaff;
    private javax.swing.JCheckBox chkPrescribeMeds;
    private javax.swing.JCheckBox chkViewRecords;
    private javax.swing.JComboBox<String> cmbDepartment;
    private javax.swing.JComboBox<String> cmbRole;
    private main.JImagePanel jImagePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtStaffId;
    private javax.swing.JTextField txtStaffName;
    // End of variables declaration//GEN-END:variables
}
