/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import models.de_muc_phan_thuong;
import models.nhan_khau;
import services.MysqlConnection;

public class QuaTangController {
    public static List<de_muc_phan_thuong> getPhanThuong() throws SQLException, ClassNotFoundException{
        List<de_muc_phan_thuong> ds_qua = new LinkedList<>();
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM de_muc_phan_thuong");
        while (rs.next()) {                
            de_muc_phan_thuong qua = new de_muc_phan_thuong(rs.getString(1),rs.getString(2),rs.getDouble(3),LocalDate.parse(rs.getString(4)));
            ds_qua.add(qua);
        }
        connection.close();
        return ds_qua;                
    }
    public static void addQua(String ten,String dangthuong, double giatri, LocalDate ngaythuong) throws SQLException, ClassNotFoundException{
        String sql = "insert into de_muc_phan_thuong(TenPhanThuong,DangThuong,GiaTri,NgayThuong) values ('"+ten+"','"+dangthuong+"','"+giatri+"','"+ngaythuong.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))+"')";
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        st.executeUpdate(sql);
    }
    public static void updateQua(String ten,String dangthuong, double giatri, LocalDate ngaythuong) throws SQLException, ClassNotFoundException{
        String sql = "update de_muc_phan_thuong set DangThuong='"+dangthuong+"',GiaTri='"+giatri+"',NgayThuong='"+ngaythuong.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"))+"' where TenPhanThuong = '"+ten+"'";
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        st.executeUpdate(sql);
    }
    public static void deleteQua(String ten) throws SQLException, ClassNotFoundException{
        String sql = "delete de_muc_phan_thuong where TenPhanThuong = '"+ten+"'";
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        st.executeUpdate(sql);
    }
}
