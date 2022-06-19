/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class tai_khoan {
    private String TaiKhoan;
    private String MatKhau;
    private int MaCanBo;

    public tai_khoan() {
    }

    public tai_khoan(String TaiKhoan, String MatKhau, int MaCanBo) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.MaCanBo = MaCanBo;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getMaCanBo() {
        return MaCanBo;
    }

    public void setMaCanBo(int MaCanBo) {
        this.MaCanBo = MaCanBo;
    }

    
    
}
