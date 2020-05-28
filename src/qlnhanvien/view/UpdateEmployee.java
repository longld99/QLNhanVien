/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhanvien.view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import qlnhanvien.controller.Combo_controller;
import qlnhanvien.controller.NhanVien_Controller;
import qlnhanvien.model.NhanVien_model;

/**
 *
 * @author nhatnguyen
 */
public class UpdateEmployee extends javax.swing.JFrame {

    String phongban = null;
    String chucvu = null;
    String trinhdo = null;
    NhanVien_Controller nv_ct = new NhanVien_Controller();

    public UpdateEmployee() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        PhongBan2();
        ChucVu2();
        TrinhDo2();
        showData();
        authen();

    }
    
    public void authen() {
        if (Login.role == 1) {
            btnLuu.setEnabled(false);
            btnHuy.setEnabled(false);
            lbHeader.setText("THÔNG TIN NHÂN VIÊN");
        }else{
             
        }
    }

    public void showData() {
        txtMaNV.disable();
        txtMaNV.setText(Main.manv);
        txtHoTen.setText(Main.hoten);
        txtNgaySinh.setText(Main.ngaysinh);
        txtQueQuan.setText(Main.quequan);
        cboGioiTinh.setSelectedItem(Main.gioitinh);
        cboDanToc.setSelectedItem(Main.dantoc);
        txtSodt.setText(Main.sodt);
        cboHeSo.setSelectedItem(Main.heso);
        txtLuongCB.setText(Main.luongcb);
        if (Main.image.equals("")) {
            path.setText("null");
        } else {
            path.setText(Main.image);
        }

        cboPhongBan.setSelectedItem(Main.mapb);
        cboChucVu.setSelectedItem(Main.macv);
        cboTrinhDo.setSelectedItem(Main.matdhv);

    }

    public void ChucVu2() {

        Combo_controller cv = new Combo_controller();
        for (int i = 0; i < cv.getCombo_ChucVu().size(); i++) {
            cboChucVu.addItem(cv.getCombo_ChucVu().get(i).getTencv());
        }
    }

    public void PhongBan2() {
        Combo_controller cv = new Combo_controller();
        for (int i = 0; i < cv.getCombo_PhongBan().size(); i++) {
            cboPhongBan.addItem(cv.getCombo_PhongBan().get(i).getTenpb());
        }
    }

    public void TrinhDo2() {
        Combo_controller cv = new Combo_controller();
        for (int i = 0; i < cv.getCombo_TrinhDo().size(); i++) {
            cboTrinhDo.addItem(cv.getCombo_TrinhDo().get(i).getTentd());
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

        lbHeader = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtQueQuan = new javax.swing.JTextField();
        cboGioiTinh = new javax.swing.JComboBox();
        txtSodt = new javax.swing.JTextField();
        btnChonAnh = new javax.swing.JButton();
        cboDanToc = new javax.swing.JComboBox();
        cboPhongBan = new javax.swing.JComboBox();
        cboChucVu = new javax.swing.JComboBox();
        cboTrinhDo = new javax.swing.JComboBox();
        cboHeSo = new javax.swing.JComboBox();
        txtLuongCB = new javax.swing.JTextField();
        lbImage = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        path = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN");

        lbHeader.setBackground(new java.awt.Color(0, 96, 181));
        lbHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbHeader.setForeground(new java.awt.Color(255, 255, 255));
        lbHeader.setText("SỬA THÔNG TIN NHÂN VIÊN");
        lbHeader.setOpaque(true);
        lbHeader.setPreferredSize(new java.awt.Dimension(162, 22));

        jLabel2.setText("Mã nhân viên:");

        jLabel3.setText("Họ tên:");

        jLabel4.setText("Ngày sinh:");

        jLabel5.setText("Quê quán:");

        jLabel6.setText("Số ĐT:");

        jLabel7.setText("Giới tính:");

        jLabel8.setText("Ảnh:");

        jLabel9.setText("Dân tộc:");

        jLabel10.setText("Trình độ:");

        jLabel11.setText("Phòng ban:");

        jLabel12.setText("Lương CB:");

        jLabel13.setText("Hệ số:");

        jLabel14.setText("Chức vụ:");

        cboGioiTinh.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nam", "Nữ" }));

        btnChonAnh.setBackground(new java.awt.Color(0, 96, 181));
        btnChonAnh.setText("Chọn ảnh");
        btnChonAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChonAnhMouseClicked(evt);
            }
        });

        cboDanToc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kinh", "Chứt", "Mường", "Thổ", "Bố Y", "Giáy", "Lào", "Lự", "Nùng", "Sán Chay", "Tày", "Thái", "Dao", "Mông", "Pà thẻn", "Cờ lao", "La Chí", "La ha", "Pu péo", "Chăm", "Chu-ru", "Ê đê", "Gia-rai", "Ra-glai", "Hoa", "Ngái", "Sán dìu", "Cống", "Hà nhì", "La hủ", "Lô lô", "Phù lá", "Si la" }));

        cboPhongBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhongBanActionPerformed(evt);
            }
        });

        cboChucVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChucVuActionPerformed(evt);
            }
        });

        cboTrinhDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboTrinhDoActionPerformed(evt);
            }
        });

        cboHeSo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "1.2", "1.4", "1.6", "1.8", "2", "2.2", "2.4", "2.6", "2.8", "3", "3.2", "3.4", "3.6", "3.8", "4" }));

        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnLuu.setText("Lưu lại");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setText("Làm mới");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLuu)
                        .addGap(39, 39, 39)
                        .addComponent(btnHuy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnThoat))
                    .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnChonAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSodt)
                    .addComponent(cboGioiTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQueQuan)
                    .addComponent(txtNgaySinh)
                    .addComponent(txtMaNV)
                    .addComponent(txtHoTen))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboHeSo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboDanToc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboPhongBan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cboTrinhDo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboPhongBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboTrinhDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cboHeSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(btnChonAnh)))
                    .addComponent(txtLuongCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbImage, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(path, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnHuy)
                    .addComponent(btnThoat))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboPhongBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhongBanActionPerformed
        Combo_controller cv = new Combo_controller();
        String tenpb = cboPhongBan.getSelectedItem().toString().trim();
        phongban = cv.mapb(tenpb);
        System.out.println(phongban);
    }//GEN-LAST:event_cboPhongBanActionPerformed

    private void cboChucVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChucVuActionPerformed
        Combo_controller cv = new Combo_controller();
        String tencv = cboChucVu.getSelectedItem().toString().trim();
        chucvu = cv.macv(tencv);
        System.out.println(chucvu);
    }//GEN-LAST:event_cboChucVuActionPerformed

    private void cboTrinhDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboTrinhDoActionPerformed
        Combo_controller cv = new Combo_controller();
        String tentd = cboTrinhDo.getSelectedItem().toString().trim();
        trinhdo = cv.matdhv(tentd);
        System.out.println(trinhdo);
    }//GEN-LAST:event_cboTrinhDoActionPerformed

    private void btnChonAnhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChonAnhMouseClicked
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new FileNameExtensionFilter(
                "Image (jpg, jpeg, png, bmp, gif)",
                "jpg", "jpeg", "png", "bmp", "gif"
        ));

        int n = fc.showOpenDialog(null);
        String f = fc.getSelectedFile().getAbsolutePath();
        File selected = fc.getSelectedFile();
        if (n == JFileChooser.APPROVE_OPTION) {
            path.setText(selected.getName());
        }else{
            path.setText("null");
        }
        lbImage.setIcon(new ImageIcon(new ImageIcon(f).getImage().getScaledInstance(250, 120, Image.SCALE_DEFAULT)));
    }//GEN-LAST:event_btnChonAnhMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
         int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(rootPane, "Bạn muốn thoát không?", "Xác nhận", dialogButton);

        if (dialogResult == JOptionPane.YES_NO_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (txtMaNV.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin, nhập lại!");
        } else if (txtHoTen.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin, nhập lại!");
        } else if (txtNgaySinh.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin, nhập lại!");
        } else if (txtQueQuan.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin, nhập lại!");
        } else if (txtSodt.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin, nhập lại!");
        } else if (txtLuongCB.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập đủ thông tin, nhập lại!");
        } else {

            NhanVien_model nv = new NhanVien_model();
            nv.setManv(txtMaNV.getText().trim());
            nv.setHoten(txtHoTen.getText().trim());
            nv.setNgaysinh(txtNgaySinh.getText().trim());
            nv.setQuequan(txtQueQuan.getText().trim());
            nv.setGioitinh(cboGioiTinh.getSelectedItem().toString().trim());
            nv.setDantoc(cboDanToc.getSelectedItem().toString().trim());
            nv.setSodt(txtSodt.getText().trim());
            nv.setHeso(Float.parseFloat(cboHeSo.getSelectedItem().toString().trim()));
            nv.setLuongcb(Float.parseFloat(txtLuongCB.getText().trim()));
            nv.setImage(path.getText().trim());
            nv.setMapb(phongban.trim());
            nv.setMacv(chucvu.trim());
            nv.setMatdhv(trinhdo.trim());

            int rowInserted = nv_ct.UpdateNV(nv);
            if (rowInserted > 0) {
                JOptionPane.showMessageDialog(rootPane, "Sửa thông tin nhân viên thành công");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Sửa thông tin nhân viên thất bại!");
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        txtHoTen.setText("");
        txtNgaySinh.setText("");
        txtQueQuan.setText("");
        txtSodt.setText("");
        txtLuongCB.setText("");
    }//GEN-LAST:event_btnHuyActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UpdateEmployee().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JComboBox cboChucVu;
    private javax.swing.JComboBox cboDanToc;
    private javax.swing.JComboBox cboGioiTinh;
    private javax.swing.JComboBox cboHeSo;
    private javax.swing.JComboBox cboPhongBan;
    private javax.swing.JComboBox cboTrinhDo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbHeader;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel path;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuongCB;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtQueQuan;
    private javax.swing.JTextField txtSodt;
    // End of variables declaration//GEN-END:variables
}
