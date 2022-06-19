/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class ThongKeTraTraoThuong {
    private String tenPhanThuong;
    private int soLuong;
    private double giaTriPhanQua;

    public ThongKeTraTraoThuong(String tenPhanThuong, int soLuong, double giaTriPhanQua) {
        this.tenPhanThuong = tenPhanThuong;
        this.soLuong = soLuong;
        this.giaTriPhanQua = giaTriPhanQua;
    }

    public String getTenPhanThuong() {
        return tenPhanThuong;
    }

    public void setTenPhanThuong(String tenPhanThuong) {
        this.tenPhanThuong = tenPhanThuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaTriPhanQua() {
        return giaTriPhanQua;
    }

    public void setGiaTriPhanQua(double giaTriPhanQua) {
        this.giaTriPhanQua = giaTriPhanQua;
    }
    
    
}
