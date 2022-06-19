/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;

public class nhan_khau {
    private int ID;
    private String HoTen;
    private String NguyenQuan;
    private String DiachiThuongTru;
    private int IDHoKhau;
    private String CCCD;
    private String GioiTinh;
    private String Quanhevoichuho;
    private LocalDate Ngaysinh;
    private String NgheNghiep;
    private String ThanhTich;

    
    public nhan_khau(int ID, String HoTen, String NguyenQuan, String DiachiThuongTru, int IDHoKhau, String CCCD, String GioiTinh, String Quanhevoichuho, LocalDate Ngaysinh, String NgheNghiep, String ThanhTich) {
        this.ID = ID;
        this.HoTen = HoTen;
        this.NguyenQuan = NguyenQuan;
        this.DiachiThuongTru = DiachiThuongTru;
        this.IDHoKhau = IDHoKhau;
        this.CCCD = CCCD;
        this.GioiTinh = GioiTinh;
        this.Quanhevoichuho = Quanhevoichuho;
        this.Ngaysinh = Ngaysinh;
        this.NgheNghiep = NgheNghiep;
        this.ThanhTich = ThanhTich;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getNguyenQuan() {
        return NguyenQuan;
    }

    public void setNguyenQuan(String NguyenQuan) {
        this.NguyenQuan = NguyenQuan;
    }

    public String getDiachiThuongTru() {
        return DiachiThuongTru;
    }

    public void setDiachiThuongTru(String DiachiThuongTru) {
        this.DiachiThuongTru = DiachiThuongTru;
    }

    public int getIDHoKhau() {
        return IDHoKhau;
    }

    public void setIDHoKhau(int IDHoKhau) {
        this.IDHoKhau = IDHoKhau;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getQuanhevoichuho() {
        return Quanhevoichuho;
    }

    public void setQuanhevoichuho(String Quanhevoichuho) {
        this.Quanhevoichuho = Quanhevoichuho;
    }

    public LocalDate getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(LocalDate Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getNgheNghiep() {
        return NgheNghiep;
    }

    public void setNgheNghiep(String NgheNghiep) {
        this.NgheNghiep = NgheNghiep;
    }

    public String getThanhTich() {
        return ThanhTich;
    }

    public void setThanhTich(String ThanhTich) {
        this.ThanhTich = ThanhTich;
    }
    
    
}
