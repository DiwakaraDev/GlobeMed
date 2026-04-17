package GUI;

public class PatientRecordManagement extends javax.swing.JDialog {

    private final Proxy.IPatientService patientService;

    public PatientRecordManagement(java.awt.Frame parent, Model.User currentUser) {
        super(parent, "Patient Record Management", true);

        this.patientService = new Proxy.PatientRecordProxy(
                currentUser.getUsername(), currentUser.getRole());
        initComponents();
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grpGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jImagePanel3 = new main.JImagePanel();
        tabMain = new javax.swing.JTabbedPane();
        panelPersonal = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtPatientID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jImagePanel2 = new main.JImagePanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtSearchID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jImagePanel1 = new main.JImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Patient Record Management");

        jImagePanel3.setCenterImage(true);
        jImagePanel3.setFitToPanel(true);
        jImagePanel3.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome_Page_Logo-Photoroom.png"))); // NOI18N
        jImagePanel3.setSmoothRendering(true);

        javax.swing.GroupLayout jImagePanel3Layout = new javax.swing.GroupLayout(jImagePanel3);
        jImagePanel3.setLayout(jImagePanel3Layout);
        jImagePanel3Layout.setHorizontalGroup(
            jImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jImagePanel3Layout.setVerticalGroup(
            jImagePanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jImagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jImagePanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
        );

        tabMain.setBackground(new java.awt.Color(255, 255, 255));

        panelPersonal.setBackground(new java.awt.Color(255, 255, 255));
        panelPersonal.setMaximumSize(new java.awt.Dimension(1553, 100));
        panelPersonal.setMinimumSize(new java.awt.Dimension(1553, 100));
        panelPersonal.setPreferredSize(new java.awt.Dimension(1553, 100));
        panelPersonal.setRequestFocusEnabled(false);

        jLabel2.setText("Patient ID :");

        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });

        jLabel3.setText("Full Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel4.setText("Date of Birth");

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        jLabel5.setText("Gender");

        grpGender.add(rbMale);
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        grpGender.add(rbFemale);
        rbFemale.setText("Female");

        jLabel6.setText("Contact Number");

        jLabel7.setText("Address");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 102, 102));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jImagePanel2.setCenterImage(true);
        jImagePanel2.setFitToPanel(true);
        jImagePanel2.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome_Page_Logo-Photoroom.png"))); // NOI18N
        jImagePanel2.setSmoothRendering(true);

        javax.swing.GroupLayout jImagePanel2Layout = new javax.swing.GroupLayout(jImagePanel2);
        jImagePanel2.setLayout(jImagePanel2Layout);
        jImagePanel2Layout.setHorizontalGroup(
            jImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jImagePanel2Layout.setVerticalGroup(
            jImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelPersonalLayout = new javax.swing.GroupLayout(panelPersonal);
        panelPersonal.setLayout(panelPersonalLayout);
        panelPersonalLayout.setHorizontalGroup(
            panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPersonalLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jImagePanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(36, 36, 36)
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonalLayout.createSequentialGroup()
                                .addComponent(rbMale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtName)
                            .addComponent(txtPatientID)
                            .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPersonalLayout.createSequentialGroup()
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPersonalLayout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(33, 33, 33)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(txtContact)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(682, Short.MAX_VALUE))
        );
        panelPersonalLayout.setVerticalGroup(
            panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPersonalLayout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbMale)
                    .addComponent(rbFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(27, 27, 27))
            .addGroup(panelPersonalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jImagePanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabMain.addTab("Personal Details", panelPersonal);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Search Patient ID :");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSearchID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date of Visit", "Condition/Diagnosis", "Allergies", "Previous Treatment"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(historyTable);

        jLabel10.setText("Diagnosis :");

        jLabel11.setText("Allergies :");

        jLabel12.setText("Notes :");

        jButton5.setBackground(new java.awt.Color(0, 102, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Add Record");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 51, 0));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 51));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                                    .addComponent(jTextField7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton5))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, java.awt.BorderLayout.CENTER);

        tabMain.addTab("Medical History", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("Patient ID :");

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel14.setText("Doctor Assigned :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Dr. Jayasekara", "Dr. Wijewardana", "Dr. Senanayaka" }));

        jLabel15.setText("Prescription :");

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jLabel16.setText("Next Appointment :");

        jLabel17.setText("Special Instructions :");

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane4.setViewportView(jTextArea3);

        jButton8.setBackground(new java.awt.Color(0, 102, 51));
        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Save Plan");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 51, 0));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Update Plan");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(153, 0, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Generate Report (PDF)");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jImagePanel1.setCenterImage(true);
        jImagePanel1.setFitToPanel(true);
        jImagePanel1.setImageIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Welcome_Page_Logo-Photoroom.png"))); // NOI18N
        jImagePanel1.setSmoothRendering(true);

        javax.swing.GroupLayout jImagePanel1Layout = new javax.swing.GroupLayout(jImagePanel1);
        jImagePanel1.setLayout(jImagePanel1Layout);
        jImagePanel1Layout.setHorizontalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );
        jImagePanel1Layout.setVerticalGroup(
            jImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jImagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jButton10))
                            .addComponent(jScrollPane3)
                            .addComponent(jTextField10)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel17)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jImagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabMain.addTab("Treatment Plans", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 914, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabMain))
        );

        tabMain.getAccessibleContext().setAccessibleName("Medical History");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtPatientID.setText("");
        txtName.setText("");
        txtDOB.setText("");
        txtContact.setText("");
        txtAddress.setText("");
        grpGender.clearSelection();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new javax.swing.SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                try {
                    String name = txtName.getText().trim();
                    String dobStr = txtDOB.getText().trim();
                    String contact = txtContact.getText().trim();
                    String address = txtAddress.getText().trim();
                    String gender = rbMale.isSelected() ? "Male"
                            : rbFemale.isSelected() ? "Female" : "Other";

                    if (name.isEmpty()) {
                        javax.swing.SwingUtilities.invokeLater(()
                                -> javax.swing.JOptionPane.showMessageDialog(
                                        PatientRecordManagement.this,
                                        "Please enter the patient name.", "Validation",
                                        javax.swing.JOptionPane.WARNING_MESSAGE));
                        return null;
                    }

                    java.time.LocalDate dob = null;
                    if (!dobStr.isEmpty()) {
                        try {
                            dob = java.time.LocalDate.parse(dobStr);
                        } catch (java.time.format.DateTimeParseException ex) {
                            javax.swing.SwingUtilities.invokeLater(()
                                    -> javax.swing.JOptionPane.showMessageDialog(
                                            PatientRecordManagement.this,
                                            "Invalid DOB format. Use YYYY-MM-DD", "Date Error",
                                            javax.swing.JOptionPane.WARNING_MESSAGE));
                            return null;
                        }
                    }

                    //BUILDER PATTERN
                    Model.Patient p = new Builder.PatientBuilder()
                            .setFullName(name)
                            .setDob(dob)
                            .setGender(gender)
                            .setContact(contact)
                            .setAddress(address)
                            .build();

                    int newId = Model.PatientDAO.createPatient(p);

                    javax.swing.SwingUtilities.invokeLater(() -> {
                        txtPatientID.setText(String.valueOf(newId));
                        txtSearchID.setText(String.valueOf(newId));

                        javax.swing.JOptionPane.showMessageDialog(
                                PatientRecordManagement.this,
                                "Patient saved using Builder Pattern!\nPatient ID: " + newId,
                                "Saved", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    });

                } catch (Exception ex) {
                    javax.swing.SwingUtilities.invokeLater(()
                            -> javax.swing.JOptionPane.showMessageDialog(
                                    PatientRecordManagement.this,
                                    "Error: " + ex.getMessage(), "Error",
                                    javax.swing.JOptionPane.ERROR_MESSAGE));
                }
                return null;
            }
        }.execute();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int selectedRow = historyTable.getSelectedRow();

        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please select a row from the table to update.",
                    "No Row Selected", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String currentDiagnosis = String.valueOf(historyTable.getValueAt(selectedRow, 1));
        String currentAllergies = String.valueOf(historyTable.getValueAt(selectedRow, 2));
        String currentTreatment = String.valueOf(historyTable.getValueAt(selectedRow, 3));

        String pidText = txtPatientID.getText().trim();
        if (pidText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No patient loaded. Search a patient first.",
                    "Validation", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        int patientId = Integer.parseInt(pidText);

        java.util.List<java.util.Map<String, Object>> rows
                = Model.MedicalHistoryDAO.getHistoryForPatient(patientId);

        if (selectedRow >= rows.size()) {
            return;
        }

        int historyId = (int) rows.get(selectedRow).get("history_id");

        javax.swing.JPanel panel = new javax.swing.JPanel(new java.awt.GridLayout(6, 2, 8, 8));

        javax.swing.JTextField dlgDiagnosis = new javax.swing.JTextField(currentDiagnosis);
        javax.swing.JTextField dlgAllergies = new javax.swing.JTextField(currentAllergies);
        javax.swing.JTextField dlgTreatment = new javax.swing.JTextField(currentTreatment);

        panel.add(new javax.swing.JLabel("Diagnosis:"));
        panel.add(dlgDiagnosis);
        panel.add(new javax.swing.JLabel("Allergies:"));
        panel.add(dlgAllergies);
        panel.add(new javax.swing.JLabel("Previous Treatment:"));
        panel.add(dlgTreatment);

        int result = javax.swing.JOptionPane.showConfirmDialog(
                this, panel,
                "Update Medical History (ID: " + historyId + ")",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE);

        if (result == javax.swing.JOptionPane.OK_OPTION) {
            String newDiagnosis = dlgDiagnosis.getText().trim();
            String newAllergies = dlgAllergies.getText().trim();
            String newTreatment = dlgTreatment.getText().trim();

            if (newDiagnosis.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Diagnosis cannot be empty.", "Validation",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            boolean updated = Model.MedicalHistoryDAO.updateHistory(
                    historyId, newDiagnosis, newAllergies, newTreatment);

            if (updated) {

                refreshHistoryTable(patientId);
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Record updated successfully!", "Updated",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Update failed.", "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String pidText = txtPatientID.getText().trim();

        if (pidText.isEmpty() || pidText.equals("0")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Save a patient first to get a Patient ID.", "Validation",
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

        String diagnosis = jTextField6.getText().trim();
        String allergies = jTextField7.getText().trim();
        String notes = jTextField8.getText().trim();

        if (diagnosis.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please enter a diagnosis.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean ok = Model.MedicalHistoryDAO.addHistory(patientId, diagnosis, allergies, notes);

        if (ok) {
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");

            java.util.List<java.util.Map<String, Object>> rows
                    = Model.MedicalHistoryDAO.getHistoryForPatient(patientId);
            javax.swing.table.DefaultTableModel tModel
                    = (javax.swing.table.DefaultTableModel) historyTable.getModel();
            tModel.setRowCount(0);
            for (java.util.Map<String, Object> row : rows) {
                tModel.addRow(new Object[]{
                    row.get("visit_date"),
                    row.get("diagnosis"),
                    row.get("allergies"),
                    row.get("previous_treatment")
                });
            }

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Medical history record added!", "Success",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to save. Make sure patient exists first.", "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        new javax.swing.SwingWorker<Void, Void>() {
            @Override
            protected Void doInBackground() {
                try {
                    int id = Integer.parseInt(txtPatientID.getText().trim());
                    String dobStr = txtDOB.getText().trim();
                    java.time.LocalDate dob = dobStr.isEmpty()
                            ? null : java.time.LocalDate.parse(dobStr);

                    // Reuse Builder for update too
                    Model.Patient p = new Builder.PatientBuilder()
                            .setFullName(txtName.getText().trim())
                            .setDob(dob)
                            .setGender(rbMale.isSelected() ? "Male" : rbFemale.isSelected() ? "Female" : "Other")
                            .setContact(txtContact.getText().trim())
                            .setAddress(txtAddress.getText().trim())
                            .build();
                    p.setPatientId(id);

                    boolean ok = Model.PatientDAO.updatePatient(p);
                    javax.swing.SwingUtilities.invokeLater(()
                            -> javax.swing.JOptionPane.showMessageDialog(
                                    PatientRecordManagement.this,
                                    ok ? "Patient updated!" : "Update failed.",
                                    "Update", javax.swing.JOptionPane.INFORMATION_MESSAGE)
                    );
                } catch (Exception ex) {
                    javax.swing.SwingUtilities.invokeLater(()
                            -> javax.swing.JOptionPane.showMessageDialog(
                                    PatientRecordManagement.this,
                                    "Error: " + ex.getMessage(), "Error",
                                    javax.swing.JOptionPane.ERROR_MESSAGE)
                    );
                }
                return null;
            }
        }.execute();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String idText = txtSearchID.getText().trim();

        if (idText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please enter a Patient ID to search.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idText);
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Patient ID must be a number.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        new javax.swing.SwingWorker<java.util.List<java.util.Map<String, Object>>, Void>() {
            @Override
            protected java.util.List<java.util.Map<String, Object>> doInBackground() {
                return Model.MedicalHistoryDAO.getHistoryForPatient(id);
            }

            @Override
            protected void done() {
                try {
                    java.util.List<java.util.Map<String, Object>> rows = get();

                    txtPatientID.setText(String.valueOf(id));

                    javax.swing.table.DefaultTableModel tModel
                            = (javax.swing.table.DefaultTableModel) historyTable.getModel();
                    tModel.setRowCount(0);

                    for (java.util.Map<String, Object> row : rows) {
                        tModel.addRow(new Object[]{
                            row.get("visit_date"),
                            row.get("diagnosis"),
                            row.get("allergies"),
                            row.get("previous_treatment")
                        });
                    }

                    if (rows.isEmpty()) {
                        javax.swing.JOptionPane.showMessageDialog(
                                PatientRecordManagement.this,
                                "No history found for Patient ID: " + id,
                                "No Records", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (Exception ex) {
                    javax.swing.JOptionPane.showMessageDialog(
                            PatientRecordManagement.this,
                            "Search error: " + ex.getMessage(), "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE);
                }
            }
        }.execute();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed

    }//GEN-LAST:event_rbMaleActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        javax.swing.JOptionPane.showMessageDialog(this,
                "Treatment Plan Report\n\n"
                + "Patient ID   : " + jTextField9.getText() + "\n"
                + "Doctor       : " + jComboBox1.getSelectedItem() + "\n"
                + "Prescription : " + jTextArea2.getText() + "\n"
                + "Next Appt    : " + jTextField10.getText() + "\n"
                + "Instructions : " + jTextArea3.getText(),
                "Treatment Report", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String pidText = jTextField9.getText().trim();

        if (pidText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Patient ID is empty.\nPlease save a patient first or search one in Medical History tab.",
                    "Validation", javax.swing.JOptionPane.WARNING_MESSAGE);
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

        String doctor = jComboBox1.getSelectedItem().toString();
        String prescription = jTextArea2.getText().trim();
        String nextAppt = jTextField10.getText().trim();
        String instructions = jTextArea3.getText().trim();

        if (doctor.equals("Select")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please select a doctor.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (prescription.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please enter a prescription.", "Validation",
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean saved = Model.TreatmentPlanDAO.savePlan(
                patientId, doctor, prescription, nextAppt, instructions);

        if (saved) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Treatment plan saved!", "Saved",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Failed to save treatment plan.", "Error",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String pidText = jTextField9.getText().trim();

        if (pidText.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Patient ID is empty. Save a patient first.",
                    "Validation", javax.swing.JOptionPane.WARNING_MESSAGE);
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

        java.util.Map<String, Object> existing
                = Model.TreatmentPlanDAO.getLatestPlan(patientId);

        if (existing.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "No treatment plan found for Patient ID: " + patientId
                    + ".\nPlease save a plan first.",
                    "Not Found", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        int planId = (int) existing.get("plan_id");

        javax.swing.JPanel panel = new javax.swing.JPanel(
                new java.awt.GridLayout(8, 2, 8, 8));

        String[] doctors = {"Dr. Jayasekara", "Dr. Wijewardana", "Dr. Senanayaka"};
        javax.swing.JComboBox<String> dlgDoctor
                = new javax.swing.JComboBox<>(doctors);
        dlgDoctor.setSelectedItem(existing.get("doctor_assigned"));

        javax.swing.JTextArea dlgPrescription = new javax.swing.JTextArea(3, 20);
        dlgPrescription.setText(
                existing.get("prescription") != null
                ? existing.get("prescription").toString() : "");
        dlgPrescription.setLineWrap(true);

        javax.swing.JTextField dlgNextAppt = new javax.swing.JTextField(
                existing.get("next_appointment") != null
                ? existing.get("next_appointment").toString() : "");

        javax.swing.JTextArea dlgInstructions = new javax.swing.JTextArea(3, 20);
        dlgInstructions.setText(
                existing.get("special_instructions") != null
                ? existing.get("special_instructions").toString() : "");
        dlgInstructions.setLineWrap(true);

        panel.add(new javax.swing.JLabel("Doctor Assigned:"));
        panel.add(dlgDoctor);
        panel.add(new javax.swing.JLabel("Prescription:"));
        panel.add(new javax.swing.JScrollPane(dlgPrescription));
        panel.add(new javax.swing.JLabel("Next Appointment:"));
        panel.add(dlgNextAppt);
        panel.add(new javax.swing.JLabel("Special Instructions:"));
        panel.add(new javax.swing.JScrollPane(dlgInstructions));

        int result = javax.swing.JOptionPane.showConfirmDialog(
                this, panel,
                "Update Treatment Plan (Plan ID: " + planId + ")",
                javax.swing.JOptionPane.OK_CANCEL_OPTION,
                javax.swing.JOptionPane.PLAIN_MESSAGE);

        if (result == javax.swing.JOptionPane.OK_OPTION) {
            String doctor = dlgDoctor.getSelectedItem().toString();
            String prescription = dlgPrescription.getText().trim();
            String nextAppt = dlgNextAppt.getText().trim();
            String instructions = dlgInstructions.getText().trim();

            if (prescription.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Prescription cannot be empty.", "Validation",
                        javax.swing.JOptionPane.WARNING_MESSAGE);
                return;
            }

            boolean updated = Model.TreatmentPlanDAO.updatePlan(
                    planId, doctor, prescription, nextAppt, instructions);

            if (updated) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Treatment plan updated successfully!",
                        "Updated", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Update failed.", "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int selectedRow = historyTable.getSelectedRow();

        if (selectedRow < 0) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Please select a row from the table to delete.",
                    "No Row Selected", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        String pidText = txtPatientID.getText().trim();
        if (pidText.isEmpty()) {
            return;
        }
        int patientId = Integer.parseInt(pidText);

        java.util.List<java.util.Map<String, Object>> rows
                = Model.MedicalHistoryDAO.getHistoryForPatient(patientId);

        if (selectedRow >= rows.size()) {
            return;
        }
        int historyId = (int) rows.get(selectedRow).get("history_id");

        int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete this record?",
                "Confirm Delete", javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.WARNING_MESSAGE);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            boolean deleted = Model.MedicalHistoryDAO.deleteHistory(historyId);
            if (deleted) {
                refreshHistoryTable(patientId);
                javax.swing.JOptionPane.showMessageDialog(this,
                        "🗑️ Record deleted.", "Deleted",
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } else {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "Delete failed.", "Error",
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void refreshHistoryTable(int patientId) {
        java.util.List<java.util.Map<String, Object>> rows
                = Model.MedicalHistoryDAO.getHistoryForPatient(patientId);

        javax.swing.table.DefaultTableModel tModel
                = (javax.swing.table.DefaultTableModel) historyTable.getModel();
        tModel.setRowCount(0);

        for (java.util.Map<String, Object> row : rows) {
            tModel.addRow(new Object[]{
                row.get("visit_date"),
                row.get("diagnosis"),
                row.get("allergies"),
                row.get("previous_treatment")
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup grpGender;
    private javax.swing.JTable historyTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private main.JImagePanel jImagePanel1;
    private main.JImagePanel jImagePanel2;
    private main.JImagePanel jImagePanel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel panelPersonal;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtSearchID;
    // End of variables declaration//GEN-END:variables
}
