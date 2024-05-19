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
public class BloodTakenList extends javax.swing.JFrame {

    /**
     * Creates new form BloodTakenList
     */
    String name;
    public BloodTakenList(String username) {
        initComponents();
        this.name = username;
        this.setLocationRelativeTo(null);
        PreparedStatement ps;
        ResultSet rs;
        String showQuery = "SELECT `request_id`,`blood_gp`, `quantity`, `Cause`, `status` FROM `patient_request` WHERE `username` = ?";
        try {
            ps = MySqlConnection.getConnection().prepareStatement(showQuery);
            ps.setString(1, name);
            rs = ps.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            DefaultTableModel model = (DefaultTableModel) listTable.getModel();
            int cols = rsmd.getColumnCount();
            model.setRowCount(0);
            while(rs.next()){
            Vector v = new Vector();
            for(int i=0; i<cols;i++){
                v.add(rs.getString("request_id"));
                v.add(rs.getString("blood_gp"));
                v.add(rs.getString("quantity"));
                v.add(rs.getString("Cause"));
                v.add(rs.getString("status"));
            }
             model.addRow(v);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private BloodTakenList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        Login_title = new javax.swing.JLabel();
        P_request = new javax.swing.JButton();
        P_list = new javax.swing.JButton();
        P_dashboard = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        Login_title.setBackground(new java.awt.Color(0, 153, 153));
        Login_title.setFont(new java.awt.Font("Palatino Linotype", 1, 24)); // NOI18N
        Login_title.setText("List of Donation");

        P_request.setBackground(new java.awt.Color(0, 84, 180));
        P_request.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        P_request.setForeground(new java.awt.Color(255, 255, 255));
        P_request.setText("Request");
        P_request.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_requestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_requestMouseExited(evt);
            }
        });
        P_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_requestActionPerformed(evt);
            }
        });

        P_list.setBackground(new java.awt.Color(0, 153, 153));
        P_list.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        P_list.setForeground(new java.awt.Color(255, 255, 255));
        P_list.setText("List");
        P_list.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_listMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_listMouseExited(evt);
            }
        });
        P_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_listActionPerformed(evt);
            }
        });

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
                "Request_ID", "Blood Group", "Quantity ", "Cause", "Status"
            }
        ));
        jScrollPane1.setViewportView(listTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        Cancel.setBackground(new java.awt.Color(0, 84, 180));
        Cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
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
                    .addComponent(P_list, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_request, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(Cancel)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Login_title)
                        .addGap(315, 315, 315))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(Login_title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cancel))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(P_dashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(P_request, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(P_list, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(122, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))))
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(279, 279, 279)
                        .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(283, 283, 283))))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(close)
                            .addComponent(minimize))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P_requestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_requestMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_P_requestMouseEntered

    private void P_requestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_requestMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_P_requestMouseExited

    private void P_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_requestActionPerformed
        requestPatient rp = new requestPatient(name);
        rp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_P_requestActionPerformed

    private void P_listMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_listMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_P_listMouseEntered

    private void P_listMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_listMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_P_listMouseExited

    private void P_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_listActionPerformed
        BloodTakenList btl = new BloodTakenList(name);
        btl.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_P_listActionPerformed

    private void P_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_dashboardMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_P_dashboardMouseEntered

    private void P_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_dashboardMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_P_dashboardMouseExited

    private void P_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_dashboardActionPerformed
        patientDashboard pdb = new patientDashboard(name);
        pdb.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_P_dashboardActionPerformed

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

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        String status = "Canceled";
        DefaultTableModel model = (DefaultTableModel) listTable.getModel();
        int row = listTable.getSelectedRow();
        int id = Integer.parseInt(model.getValueAt(row, 0).toString());
        PreparedStatement ps;
        ResultSet rs;
        String showQuery = "UPDATE `patient_request` SET `status`= ? WHERE request_id = ?";
        try {
            ps = MySqlConnection.getConnection().prepareStatement(showQuery);
            ps.setString(1, status);
            ps.setInt(2, id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Blood request hase been canceled succesfully");
        } catch (SQLException ex) {
            Logger.getLogger(DonorDonateList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(BloodTakenList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BloodTakenList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BloodTakenList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BloodTakenList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodTakenList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Login_title;
    private javax.swing.JButton P_dashboard;
    private javax.swing.JButton P_list;
    private javax.swing.JButton P_request;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listTable;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}
