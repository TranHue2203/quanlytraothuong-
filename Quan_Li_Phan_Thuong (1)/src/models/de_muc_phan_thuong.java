/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

public class de_muc_phan_thuong {
    private String TenPhanThuong;
    private String DangThuong;
    private double GiaTri;
    private LocalDate NgayThuong;

    public de_muc_phan_thuong(String TenPhanThuong, String DangThuong, double GiaTri, LocalDate NgayThuong) {
        this.TenPhanThuong = TenPhanThuong;
        this.DangThuong = DangThuong;
        this.GiaTri = GiaTri;
        this.NgayThuong = NgayThuong;
    }

    public String getTenPhanThuong() {
        return TenPhanThuong;
    }

    public void setTenPhanThuong(String TenPhanThuong) {
        this.TenPhanThuong = TenPhanThuong;
    }

    public String getDangThuong() {
        return DangThuong;
    }

    public void setDangThuong(String DangThuong) {
        this.DangThuong = DangThuong;
    }

    public double getGiaTri() {
        return GiaTri;
    }

    public void setGiaTri(double GiaTri) {
        this.GiaTri = GiaTri;
    }

    public LocalDate getNgayThuong() {
        return NgayThuong;
    }

    public void setNgayThuong(LocalDate NgayThuong) {
        this.NgayThuong = NgayThuong;
    }
    
}
