/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloodbankmanagementsystem;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pc
 */
public class RequestOfDonor extends javax.swing.JFrame {

    /**
     * Creates new form RequestOfDonor
     */
    public RequestOfDonor() {
        initComponents();
        this.setLocationRelativeTo(null);
        PreparedStatement ps;
        ResultSet rs;
        String showQuery = "SELECT * FROM `donor_request`";
        try {
            ps = MySqlConnection.getConnection().prepareStatement(showQuery);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) listTable.getModel();
            int cols = rsmd.getColumnCount();
            model.setRowCount(0);
            while(rs.next()){
            Vector v = new Vector();
            for(int i=0; i<cols;i++){
                v.add(rs.getString("request_id"));
                v.add(rs.getString("username"));
                v.add(rs.getString("blood_group"));
                v.add(rs.getString("quantity"));
                v.add(rs.getString("diseases"));
                v.add(rs.getString("status"));
            }
             model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        P_dashboard = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        A_list = new javax.swing.JButton();
        A_requestD = new javax.swing.JButton();
        A_requestP = new javax.swing.JButton();
        Accept = new javax.swing.JButton();
        Reject = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        P_dashboard.setBackground(new java.awt.Color(0, 84, 180));
        P_dashboard.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        P_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        P_dashboard.setText("Dashboard");
        P_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_dashboardMouseExited(evt);
            }
        });
        P_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_dashboardActionPerformed(evt);
            }
        });

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request_ID", "Username", "Blood Group", "Quantity", "Diseases", "Status"
            }
        ));
        jScrollPane1.setViewportView(listTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("List of donor request.");

        A_list.setBackground(new java.awt.Color(0, 84, 180));
        A_list.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        A_list.setForeground(new java.awt.Color(255, 255, 255));
        A_list.setText("List");
        A_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A_listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A_listMouseExited(evt);
            }
        });
        A_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_listActionPerformed(evt);
            }
        });

        A_requestD.setBackground(new java.awt.Color(0, 153, 153));
        A_requestD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        A_requestD.setForeground(new java.awt.Color(255, 255, 255));
        A_requestD.setText("Donor Request");
        A_requestD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A_requestD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A_requestDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A_requestDMouseExited(evt);
            }
        });
        A_requestD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_requestDActionPerformed(evt);
            }
        });

        A_requestP.setBackground(new java.awt.Color(0, 84, 180));
        A_requestP.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        A_requestP.setForeground(new java.awt.Color(255, 255, 255));
        A_requestP.setText("Patient Request");
        A_requestP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        A_requestP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                A_requestPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A_requestPMouseExited(evt);
            }
        });
        A_requestP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_requestPActionPerformed(evt);
            }
        });

        Accept.setBackground(new java.awt.Color(0, 84, 180));
        Accept.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Accept.setForeground(new java.awt.Color(255, 255, 255));
        Accept.setText("Accept");
        Accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptActionPerformed(evt);
            }
        });

        Reject.setBackground(new java.awt.Color(0, 84, 180));
        Reject.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Reject.setForeground(new java.awt.Color(255, 255, 255));
        Reject.setText("Reject");
        Reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(P_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A_requestD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(A_requestP, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(447, 447, 447))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Accept)
                        .addGap(55, 55, 55)
                        .addComponent(Reject)
                        .addGap(57, 57, 57))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(P_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(A_list, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(A_requestD, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(A_requestP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Accept)
                    .addComponent(Reject))
                .addGap(21, 21, 21))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Management System");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Blood Bank");

        close.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        close.setText(" X");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        minimize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        minimize.setText(" -");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(230, 230, 230)
                        .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(247, 247, 247))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(minimize)
                            .addComponent(close))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_dashboardMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_P_dashboardMouseEntered

    private void P_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_dashboardMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_P_dashboardMouseExited

    private void P_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_dashboardActionPerformed
        adminDashboard adb = new adminDashboard();
        adb.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_P_dashboardActionPerformed

    private void A_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A_listMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_A_listMouseEntered

    private void A_listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A_listMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_A_listMouseExited

    private void A_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_listActionPerformed
        ListOfAll loa = new ListOfAll();
        loa.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_A_listActionPerformed

    private void A_requestDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A_requestDMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_A_requestDMouseEntered

    private void A_requestDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A_requestDMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_A_requestDMouseExited

    private void A_requestDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_requestDActionPerformed
        RequestOfDonor rod = new RequestOfDonor();
        rod.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_A_requestDActionPerformed

    private void A_requestPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A_requestPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_A_requestPMouseEntered

    private void A_requestPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A_requestPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_A_requestPMouseExited

    private void A_requestPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_requestPActionPerformed
        RequestOfPatient rop = new RequestOfPatient();
        rop.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_A_requestPActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        Border lebel_border = BorderFactory.createMatteBorder(2,2,2,2, Color.white);
        close.setBorder(lebel_border);
        close.setForeground(Color.white);
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        Border lebel_border = BorderFactory.createMatteBorder(2,2,2,2, Color.black);
        close.setBorder(lebel_border);
        close.setForeground(Color.black);
    }//GEN-LAST:event_closeMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        Border lebel_border = BorderFactory.createMatteBorder(2,2,2,2, Color.white);
        minimize.setBorder(lebel_border);
        minimize.setForeground(Color.white);
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        Border lebel_border = BorderFactory.createMatteBorder(2,2,2,2, Color.black);
        minimize.setBorder(lebel_border);
        minimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_minimizeMouseExited

    int Quantity;
    private void AcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptActionPerformed
        String status = "Accepted";
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        int row = listTable.getSelectedRow();
        int id = Integer.parseInt(model.getValueAt(row, 0).toString());
        int Q = Integer.parseInt(model.getValueAt(row, 3).toString());
        String bloodGroup = model.getValueAt(row, 2).toString();
        PreparedStatement ps;
        ResultSet rs;
        String showQuery = "UPDATE `donor_request` SET `status`= ? WHERE request_id = ?";
        try {
            ps = MySqlConnection.getConnection().prepareStatement(showQuery);
            ps.setString(1, status);
            ps.setInt(2, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Blood donation request hase been accepted succesfully");
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(bloodGroup.equals("A+")){
            String AQuery = "SELECT `quantity` FROM `blood_db` WHERE `blood_group` = 'A+';";
            try {
                ps = MySqlConnection.getConnection().prepareStatement(AQuery);
                rs = ps.executeQuery();
                if(rs.next()){
                    Quantity = rs.getInt("quantity");
                    Quantity +=Q;
                    String updateQuery = "UPDATE `blood_db` SET `quantity`= ? WHERE blood_group = ?";
                     try {
            ps = MySqlConnection.getConnection().prepareStatement(updateQuery);
            ps.setInt(1, Quantity);
            ps.setString(2, bloodGroup);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(requestDonor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(bloodGroup.equals("A-")){
            String AQuery = "SELECT `quantity` FROM `blood_db` WHERE `blood_group` = 'A-';";
            try {
                ps = MySqlConnection.getConnection().prepareStatement(AQuery);
                rs = ps.executeQuery();
                if(rs.next()){
                    Quantity = rs.getInt("quantity");
                    Quantity +=Q;
                    String updateQuery = "UPDATE `blood_db` SET `quantity`= ? WHERE blood_group = ?";
                     try {
            ps = MySqlConnection.getConnection().prepareStatement(updateQuery);
            ps.setInt(1, Quantity);
            ps.setString(2, bloodGroup);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(requestDonor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(bloodGroup.equals("B+")){
            String AQuery = "SELECT `quantity` FROM `blood_db` WHERE `blood_group` = 'B+';";
            try {
                ps = MySqlConnection.getConnection().prepareStatement(AQuery);
                rs = ps.executeQuery();
                if(rs.next()){
                    Quantity = rs.getInt("quantity");
                    Quantity +=Q;
                    String updateQuery = "UPDATE `blood_db` SET `quantity`= ? WHERE blood_group = ?";
                     try {
            ps = MySqlConnection.getConnection().prepareStatement(updateQuery);
            ps.setInt(1, Quantity);
            ps.setString(2, bloodGroup);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(requestDonor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(bloodGroup.equals("B-")){
            String AQuery = "SELECT `quantity` FROM `blood_db` WHERE `blood_group` = 'B-';";
            try {
                ps = MySqlConnection.getConnection().prepareStatement(AQuery);
                rs = ps.executeQuery();
                if(rs.next()){
                    Quantity = rs.getInt("quantity");
                    Quantity +=Q;
                    String updateQuery = "UPDATE `blood_db` SET `quantity`= ? WHERE blood_group = ?";
                     try {
            ps = MySqlConnection.getConnection().prepareStatement(updateQuery);
            ps.setInt(1, Quantity);
            ps.setString(2, bloodGroup);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(requestDonor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(bloodGroup.equals("AB+")){
            String AQuery = "SELECT `quantity` FROM `blood_db` WHERE `blood_group` = 'AB+';";
            try {
                ps = MySqlConnection.getConnection().prepareStatement(AQuery);
                rs = ps.executeQuery();
                if(rs.next()){
                    Quantity = rs.getInt("quantity");
                    Quantity +=Q;
                    String updateQuery = "UPDATE `blood_db` SET `quantity`= ? WHERE blood_group = ?";
                     try {
            ps = MySqlConnection.getConnection().prepareStatement(updateQuery);
            ps.setInt(1, Quantity);
            ps.setString(2, bloodGroup);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(requestDonor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(bloodGroup.equals("AB-")){
            String AQuery = "SELECT `quantity` FROM `blood_db` WHERE `blood_group` = 'AB-';";
            try {
                ps = MySqlConnection.getConnection().prepareStatement(AQuery);
                rs = ps.executeQuery();
                if(rs.next()){
                    Quantity = rs.getInt("quantity");
                    Quantity +=Q;
                    String updateQuery = "UPDATE `blood_db` SET `quantity`= ? WHERE blood_group = ?";
                     try {
            ps = MySqlConnection.getConnection().prepareStatement(updateQuery);
            ps.setInt(1, Quantity);
            ps.setString(2, bloodGroup);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(requestDonor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(bloodGroup.equals("O+")){
            String AQuery = "SELECT `quantity` FROM `blood_db` WHERE `blood_group` = 'O+';";
            try {
                ps = MySqlConnection.getConnection().prepareStatement(AQuery);
                rs = ps.executeQuery();
                if(rs.next()){
                    Quantity = rs.getInt("quantity");
                    Quantity +=Q;
                    String updateQuery = "UPDATE `blood_db` SET `quantity`= ? WHERE blood_group = ?";
                     try {
            ps = MySqlConnection.getConnection().prepareStatement(updateQuery);
            ps.setInt(1, Quantity);
            ps.setString(2, bloodGroup);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(requestDonor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(bloodGroup.equals("O-")){
            String AQuery = "SELECT `quantity` FROM `blood_db` WHERE `blood_group` = 'O-';";
            try {
                ps = MySqlConnection.getConnection().prepareStatement(AQuery);
                rs = ps.executeQuery();
                if(rs.next()){
                    Quantity = rs.getInt("quantity");
                    Quantity +=Q;
                    String updateQuery = "UPDATE `blood_db` SET `quantity`= ? WHERE blood_group = ?";
                     try {
            ps = MySqlConnection.getConnection().prepareStatement(updateQuery);
            ps.setInt(1, Quantity);
            ps.setString(2, bloodGroup);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(requestDonor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
     
        
    }//GEN-LAST:event_AcceptActionPerformed

    private void RejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectActionPerformed
        String status = "Rejected";
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        int row = listTable.getSelectedRow();
        int id = Integer.parseInt(model.getValueAt(row, 0).toString());
        PreparedStatement ps;
        ResultSet rs;
        String showQuery = "UPDATE `donor_request` SET `status`= ? WHERE request_id = ?";
        try {
            ps = MySqlConnection.getConnection().prepareStatement(showQuery);
            ps.setString(1, status);
            ps.setInt(2, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Blood donation request hase been rejected succesfully");
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_RejectActionPerformed

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
            java.util.logging.Logger.getLogger(RequestOfDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequestOfDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequestOfDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequestOfDonor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequestOfDonor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A_list;
    private javax.swing.JButton A_requestD;
    private javax.swing.JButton A_requestP;
    private javax.swing.JButton Accept;
    private javax.swing.JButton P_dashboard;
    private javax.swing.JButton Reject;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTable;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
