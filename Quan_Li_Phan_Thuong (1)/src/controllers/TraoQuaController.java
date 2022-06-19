/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import models.ThongKeTraTraoThuong;
import models.nhan_khau;
import models.trao_thuong;
import services.MysqlConnection;

public class TraoQuaController {
    
    public static void addTraoQua(List<nhan_khau> ds_nhankhau,double giatri,String ten) throws SQLException, ClassNotFoundException{
        List<trao_thuong> ds_trao_thuong = new LinkedList<>();
        for (nhan_khau nhankhau : ds_nhankhau) {
            trao_thuong traothuong = new trao_thuong(giatri,nhankhau.getID(),ten);
            ds_trao_thuong.add(traothuong);
        }
        for (trao_thuong traothuong : ds_trao_thuong) {
            String sql = "insert into trao_thuong(GiaTriPhanQua,IDNhanKhau,TenPhanThuong) values ('"+traothuong.getGiaTriPhanQua()+"','"+traothuong.getIDNhanKhau()+"','"+traothuong.getTenPhanThuong()+"')";
            Connection connection = MysqlConnection.getMysqlConnection();
            Statement st = connection.createStatement();
            st.executeUpdate(sql);
        }
    }
    
    public ArrayList<Object> get() throws SQLException, ClassNotFoundException {
        String query = "select distinct `TenPhanThuong`, count(IdNhanKhau) as so_luong,sum(GiaTriPhanQua) as tong_chi_phi from trao_thuong group by `TenPhanThuong`;";
        try{
            PreparedStatement preStmt = (new MysqlConnection()).getMysqlConnection().prepareStatement(query);
            ResultSet resultSet = preStmt.executeQuery();
            ArrayList<Object> arrList = new ArrayList<>();
            while (resultSet.next()) {
                ThongKeTraTraoThuong temp = new ThongKeTraTraoThuong(resultSet.getString(1),resultSet.getInt(2),resultSet.getDouble(3));
                arrList.add(temp);
            }
            return arrList;
        } catch (Exception ex) {
            return null;
        }
    }
}
