/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class so_ho_khau {
    private int ID;
    private String TenChuHo;
    private String DiaChi;

    public so_ho_khau(int ID, String TenChuHo, String DiaChi) {
        this.ID = ID;
        this.TenChuHo = TenChuHo;
        this.DiaChi = DiaChi;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenChuHo() {
        return TenChuHo;
    }

    public void setTenChuHo(String TenChuHo) {
        this.TenChuHo = TenChuHo;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
}
