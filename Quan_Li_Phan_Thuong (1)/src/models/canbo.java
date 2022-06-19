/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

public class canbo {
    private String Ten;
    private int MaCanBo;
    private String ChucVu;
    private String DiaChi;

    public canbo(String Ten, int MaCanBo, String ChucVu, String DiaChi) {
        this.MaCanBo = MaCanBo;
        this.ChucVu = ChucVu;
        this.DiaChi = DiaChi;
        this.Ten=Ten;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }



    public int getMaCanBo() {
        return MaCanBo;
    }

    public void setMaCanBo(int MaCanBo) {
        this.MaCanBo = MaCanBo;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }
    
}
