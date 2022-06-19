/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;
public class trao_thuong {
    private double GiaTriPhanQua;
    private int IDNhanKhau;
    private String TenPhanThuong;

    public trao_thuong(double GiaTriPhanQua, int IDNhanKhau, String TenPhanThuong) {
        this.GiaTriPhanQua = GiaTriPhanQua;
        this.IDNhanKhau = IDNhanKhau;
        this.TenPhanThuong = TenPhanThuong;
    }

    public double getGiaTriPhanQua() {
        return GiaTriPhanQua;
    }

    public void setGiaTriPhanQua(double GiaTriPhanQua) {
        this.GiaTriPhanQua = GiaTriPhanQua;
    }

    public int getIDNhanKhau() {
        return IDNhanKhau;
    }

    public void setIDNhanKhau(int IDNhanKhau) {
        this.IDNhanKhau = IDNhanKhau;
    }

    public String getTenPhanThuong() {
        return TenPhanThuong;
    }

    public void setTenPhanThuong(String TenPhanThuong) {
        this.TenPhanThuong = TenPhanThuong;
    }
    
}
