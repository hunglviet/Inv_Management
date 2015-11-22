/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv_management;

import ListView.frmLisStoreOutputSplit;
import ListView.frmListBinCard;
import ListView.frmListCustSupp;
import ListView.frmListDepartment;
import ListView.frmListEmployee;
import ListView.frmListInwardStore;
import ListView.frmListManufacture;
import ListView.frmListOther;
import ListView.frmListProduct;

/**
 *
 * @author lvhung
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        new CloseOtherWindows().closeWin();
        //this.lblHeader.setText(this.btnBinCard.getText());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        footer = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        bntEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        bntPrint = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        bntHelp = new javax.swing.JButton();
        Table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ScrollMenu = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SubMenu = new javax.swing.JTable();
        paneMenu = new javax.swing.JPanel();
        btnProduct = new javax.swing.JButton();
        btnStoreOutputSplit = new javax.swing.JButton();
        btnCustSup = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnDepartment = new javax.swing.JButton();
        btnBinCard = new javax.swing.JButton();
        btnManufacture = new javax.swing.JButton();
        btnOtherList = new javax.swing.JButton();
        btnInwardStore = new javax.swing.JButton();
        panelHeader = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory Managment");
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        footer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        footer.setLayout(new java.awt.GridLayout(1, 0));

        jToolBar1.setRollover(true);
        jToolBar1.setInheritsPopupMenu(true);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        btnAdd.setText("Add");
        btnAdd.setFocusable(false);
        btnAdd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnAdd);

        bntEdit.setText("Edit");
        bntEdit.setFocusable(false);
        bntEdit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntEdit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(bntEdit);

        btnDelete.setText("Delete");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnDelete);

        bntPrint.setText("Print");
        bntPrint.setFocusable(false);
        bntPrint.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntPrint.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(bntPrint);

        btnFind.setText("Find");
        btnFind.setFocusable(false);
        btnFind.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFind.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(btnFind);

        bntHelp.setText("Help");
        bntHelp.setFocusable(false);
        bntHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bntHelp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(bntHelp);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jToolBar1.add(jPanel2);

        Table.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setCellSelectionEnabled(true);
        jTable1.setInheritsPopupMenu(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        javax.swing.GroupLayout TableLayout = new javax.swing.GroupLayout(Table);
        Table.setLayout(TableLayout);
        TableLayout.setHorizontalGroup(
            TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap())
        );
        TableLayout.setVerticalGroup(
            TableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );

        ScrollMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        SubMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));
        jScrollPane2.setViewportView(SubMenu);

        javax.swing.GroupLayout ScrollMenuLayout = new javax.swing.GroupLayout(ScrollMenu);
        ScrollMenu.setLayout(ScrollMenuLayout);
        ScrollMenuLayout.setHorizontalGroup(
            ScrollMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        ScrollMenuLayout.setVerticalGroup(
            ScrollMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        paneMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnProduct.setText("Product");
        btnProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnStoreOutputSplit.setText("Store output split");
        btnStoreOutputSplit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStoreOutputSplit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreOutputSplitActionPerformed(evt);
            }
        });

        btnCustSup.setText("Customer/Supplier");
        btnCustSup.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCustSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustSupActionPerformed(evt);
            }
        });

        btnEmployee.setText("Employee");
        btnEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnDepartment.setText("Department");
        btnDepartment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepartmentActionPerformed(evt);
            }
        });

        btnBinCard.setText("Bin Card (Book store)");
        btnBinCard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBinCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBinCardActionPerformed(evt);
            }
        });

        btnManufacture.setText("Manufacture");
        btnManufacture.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManufactureActionPerformed(evt);
            }
        });

        btnOtherList.setText("Other lists");
        btnOtherList.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOtherList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherListActionPerformed(evt);
            }
        });

        btnInwardStore.setText("Inward Stote");
        btnInwardStore.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInwardStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInwardStoreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneMenuLayout = new javax.swing.GroupLayout(paneMenu);
        paneMenu.setLayout(paneMenuLayout);
        paneMenuLayout.setHorizontalGroup(
            paneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnCustSup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProduct, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStoreOutputSplit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBinCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManufacture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOtherList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInwardStore, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        paneMenuLayout.setVerticalGroup(
            paneMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInwardStore)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStoreOutputSplit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBinCard)
                .addGap(4, 4, 4)
                .addComponent(btnProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustSup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnManufacture)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDepartment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmployee)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOtherList)
                .addContainerGap())
        );

        lblHeader.setText("INVENTORY MANAGMENT");
        lblHeader.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                lblHeaderComponentShown(evt);
            }
        });

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblHeader)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuBar.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                menuBarComponentHidden(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ScrollMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(paneMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(footer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(footer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ScrollMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paneMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnCustSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustSupActionPerformed
        // TODO add your handling code here:
        //new frmAddCust_Sup().setVisible(true);
        new CloseOtherWindows().closeWin();

        new frmListCustSupp().setVisible(true);

       // this.lblHeader.setText(this.btnCustSup.getText());
    }//GEN-LAST:event_btnCustSupActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
        // TODO add your handling code here:
        //new frmAddEmployee().setVisible(true);
        new CloseOtherWindows().closeWin();

        new frmListEmployee().setVisible(true);
        //this.lblHeader.setText(this.btnProduct.getText());
       // this.lblHeader.setText(this.btnEmployee.getText());
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        new CloseOtherWindows().closeWin();

        new frmListProduct().setVisible(true);
       // this.lblHeader.setText(this.btnProduct.getText());


    }//GEN-LAST:event_btnProductActionPerformed

    private void lblHeaderComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_lblHeaderComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_lblHeaderComponentShown

    private void btnStoreOutputSplitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreOutputSplitActionPerformed
        // TODO add your handling code here:
        new CloseOtherWindows().closeWin();
        new frmLisStoreOutputSplit().setVisible(true);
       // this.lblHeader.setText(this.btnProduct.getText());
    }//GEN-LAST:event_btnStoreOutputSplitActionPerformed

    private void btnDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepartmentActionPerformed
        // TODO add your handling code here:
        new CloseOtherWindows().closeWin();

        new frmListDepartment().setVisible(true);
        //this.lblHeader.setText(this.btnProduct.getText());
       // this.lblHeader.setText(this.btnDepartment.getText());
    }//GEN-LAST:event_btnDepartmentActionPerformed

    private void btnBinCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBinCardActionPerformed
        // TODO add your handling code here:
        new CloseOtherWindows().closeWin();
        new frmListBinCard().setVisible(true);
       // this.lblHeader.setText(this.btnBinCard.getText());
    }//GEN-LAST:event_btnBinCardActionPerformed

    private void menuBarComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_menuBarComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_menuBarComponentHidden

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void btnManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManufactureActionPerformed
        // TODO add your handling code here:
        //new frmAddManufacture().setVisible(true);
        new CloseOtherWindows().closeWin();

        new frmListManufacture().setVisible(true);
        //this.lblHeader.setText(this.btnProduct.getText());
       // this.lblHeader.setText(this.btnManufacture.getText());

    }//GEN-LAST:event_btnManufactureActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnOtherListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherListActionPerformed
        // TODO add your handling code here:
        new CloseOtherWindows().closeWin();
        new frmListOther().setVisible(true);
    }//GEN-LAST:event_btnOtherListActionPerformed

    private void btnInwardStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInwardStoreActionPerformed
        // TODO add your handling code here:
        new CloseOtherWindows().closeWin();
        new frmListInwardStore().setVisible(true);
        //this.lblHeader.setText(this.btnInwardStore.getText());
        //tao menu report
        //tbReport = new javax.swing.JTable();

        SubMenu.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {"Purchase by supplier"},
                    {"Purchase by product"},
                    {"Purchae by employee"}
                    
                },
                new String[]{
                    "Report"
                }
        ));
    }//GEN-LAST:event_btnInwardStoreActionPerformed

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
                if (!"Windows".equals(info.getName())) {
                } else {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ScrollMenu;
    private javax.swing.JTable SubMenu;
    private javax.swing.JPanel Table;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton bntEdit;
    private javax.swing.JButton bntHelp;
    private javax.swing.JButton bntPrint;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBinCard;
    private javax.swing.JButton btnCustSup;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDepartment;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnInwardStore;
    private javax.swing.JButton btnManufacture;
    private javax.swing.JButton btnOtherList;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnStoreOutputSplit;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel footer;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel paneMenu;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
