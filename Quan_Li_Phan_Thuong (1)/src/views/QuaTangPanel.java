/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.de_muc_phan_thuong;
import models.nhan_khau;

public class QuaTangPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuaTangPanel
     */
    private JFrame parentFrame;
    List<de_muc_phan_thuong> ds_qua = new LinkedList<>();
    private DefaultTableModel dtm ;
    public QuaTangPanel(JFrame parentFrame) throws ClassNotFoundException {
        this.parentFrame = parentFrame;
        initComponents();
        dtm = (DefaultTableModel) tblQua.getModel();
        Load();
    }
    public void Load() throws ClassNotFoundException{
        dtm.setRowCount(0);
        try {
            ds_qua = controllers.QuaTangController.getPhanThuong();
            for (de_muc_phan_thuong qua: ds_qua) {
                dtm.addRow(new Object[]{qua.getTenPhanThuong(), qua.getDangThuong(),qua.getGiaTri(),qua.getNgayThuong().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(parentFrame, "Khong the ket noi csdl","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void Load2(){
        dtm.setRowCount(0);
        for (de_muc_phan_thuong qua: ds_qua) {
                dtm.addRow(new Object[]{qua.getTenPhanThuong(), qua.getDangThuong(),qua.getGiaTri(),qua.getNgayThuong().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))});
            }
    }
    public void reset(){
        jtfTen.setText("");
        jtfDangThuong.setText("");
        jtfGiaTri.setText("");
        jtfNgayThuong.setText("");
        btnThem.setEnabled(true);
        jtfTen.setEditable(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfTen = new javax.swing.JTextField();
        jtfDangThuong = new javax.swing.JTextField();
        jtfGiaTri = new javax.swing.JTextField();
        jtfNgayThuong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQua = new javax.swing.JTable();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setPreferredSize(new java.awt.Dimension(855, 465));
        setLayout(null);

        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("S???a");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("X??a");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnThem)
                .addGap(38, 38, 38)
                .addComponent(btnSua)
                .addGap(37, 37, 37)
                .addComponent(btnXoa)
                .addContainerGap(292, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(725, 0, 130, 465);

        jLabel1.setText("D???ng Th?????ng:");

        jLabel2.setText("T??n Ph???n Th?????ng:");

        jLabel3.setText("Gi?? Tr???:");

        jLabel4.setText("Ng??y Th?????ng:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jtfDangThuong, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jtfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfNgayThuong))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jtfGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(610, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDangThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNgayThuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        add(jPanel2);
        jPanel2.setBounds(0, 0, 720, 100);

        tblQua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T??n ph???n th?????ng", "D???ng Th?????ng", "Gi?? Tr???", "Ng??y Th?????ng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblQua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblQua);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 100, 720, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        double giatri = 0;
        LocalDate dt = null;
        if(jtfTen.getText()==""||jtfDangThuong.getText()==""||jtfGiaTri.getText()==""||jtfNgayThuong.getText()==""){
            JOptionPane.showMessageDialog(parentFrame, "b???n c???n ??i???n ?????y ????? th??ng tin");
        }else{
        try{
            giatri = Double.parseDouble(jtfGiaTri.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(parentFrame, "Gi?? tr??? ph???i l?? s??? th???c");
        }
        try{
            dt = LocalDate.parse(jtfNgayThuong.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(parentFrame, "Ph???i nh???p ????ng ?????nh d???ng ng??y th??ng");
        }
        try {
            controllers.QuaTangController.addQua(jtfTen.getText(), jtfDangThuong.getText(), giatri, dt);
            ds_qua.add(new de_muc_phan_thuong(jtfTen.getText(), jtfDangThuong.getText(), giatri, dt));
            JOptionPane.showMessageDialog(parentFrame, "Th??m th??nh c??ng");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(parentFrame, "T??n qu?? t???ng ???? t???n t???i vui l??ng l???y qu?? kh??c");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuaTangPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
            Load2();
            reset();}
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        double giatri = 0;
        LocalDate dt = null;
        if(jtfTen.getText()==""||jtfDangThuong.getText()==""||jtfGiaTri.getText()==""||jtfNgayThuong.getText()==""){
            JOptionPane.showMessageDialog(parentFrame, "b???n c???n ??i???n ?????y ????? th??ng tin");
        }else{
        try{
            giatri = Double.parseDouble(jtfGiaTri.getText());
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(parentFrame, "Gi?? tr??? ph???i l?? s??? th???c");
        }
        try{
            dt = LocalDate.parse(jtfNgayThuong.getText(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(parentFrame, "Ph???i nh???p ????ng ?????nh d???ng ng??y th??ng");
        }
        try {
            controllers.QuaTangController.updateQua(jtfTen.getText(), jtfDangThuong.getText(), giatri, dt);
            ds_qua.remove(index);
            ds_qua.add(new de_muc_phan_thuong(jtfTen.getText(), jtfDangThuong.getText(), giatri, dt));
            JOptionPane.showMessageDialog(parentFrame, "S???a th??nh c??ng");
        } catch (SQLException ex) {
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuaTangPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        Load2();
        reset();}
        
    }//GEN-LAST:event_btnSuaActionPerformed
    int index;
    private void tblQuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuaMouseClicked
        index = tblQua.getSelectedRow();
        if(index == -1) JOptionPane.showMessageDialog(parentFrame, "Ch???n sai d??ng r???i");
        else if(ds_qua.size()==0) JOptionPane.showMessageDialog(parentFrame, "Kh??ng c?? th??ng tin n??o ????? ch???n");
        else{
        de_muc_phan_thuong qua = ds_qua.get(index);
        jtfTen.setText(qua.getTenPhanThuong());
        jtfDangThuong.setText(qua.getDangThuong());
        jtfGiaTri.setText(""+qua.getGiaTri()+"");
        jtfNgayThuong.setText(qua.getNgayThuong().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        btnThem.setEnabled(false);
        jtfTen.setEditable(false);
        }
    }//GEN-LAST:event_tblQuaMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            controllers.QuaTangController.deleteQua(jtfTen.getText());
        } catch (SQLException ex) {
            Logger.getLogger(QuaTangPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuaTangPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        ds_qua.remove(index);
        Load2();
        reset();
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jtfDangThuong;
    private javax.swing.JTextField jtfGiaTri;
    private javax.swing.JTextField jtfNgayThuong;
    private javax.swing.JTextField jtfTen;
    private javax.swing.JTable tblQua;
    // End of variables declaration//GEN-END:variables
}
