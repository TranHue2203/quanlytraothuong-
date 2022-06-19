package views;

import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.nhan_khau;
import models.so_ho_khau;


public class NhanKhauManagePanel extends javax.swing.JPanel {

    /**
     * Creates new form NhanKhauManagePanel
     */
    private JFrame parentJFrame;
    private DefaultTableModel dtm;
    public NhanKhauManagePanel(JFrame parentFrame) throws ClassNotFoundException {
        this.parentJFrame = parentFrame;
        initComponents();
        dtm = (DefaultTableModel) tblNhanKhau.getModel();
        Load("");
    }
    public void Load(String s) throws ClassNotFoundException{
        dtm.setRowCount(0);
        try {
            List<nhan_khau> ds_nhankhau = controllers.NhanKhauController.get_nhankhau(s);
            for (nhan_khau nhankhau : ds_nhankhau) {
                dtm.addRow(new Object[]{nhankhau.getID(),nhankhau.getHoTen(),nhankhau.getNgaysinh().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")).toString(),nhankhau.getGioiTinh(),nhankhau.getDiachiThuongTru()});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(parentJFrame, "Khong the ket noi csdl","Error",JOptionPane.ERROR_MESSAGE);
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

        jtfSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanKhau = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jtfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        tblNhanKhau.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tblNhanKhau.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ Tên", "Ngày Sinh", "Giới Tính", "Địa Chỉ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblNhanKhau);
        if (tblNhanKhau.getColumnModel().getColumnCount() > 0) {
            tblNhanKhau.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Nhập ID nhân khẩu");

        btnTimKiem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(392, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try {
            Load(jtfSearch.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NhanKhauManagePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfSearch;
    private javax.swing.JTable tblNhanKhau;
    // End of variables declaration//GEN-END:variables
}
