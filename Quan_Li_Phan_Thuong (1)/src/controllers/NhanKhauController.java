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
import java.util.ArrayList;
import java.util.List;
import models.nhan_khau;
import services.MysqlConnection;

public class NhanKhauController {
    public static List<nhan_khau> get_nhankhau() throws SQLException, ClassNotFoundException{
        List<nhan_khau> l_nhankhau = new ArrayList<>();
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM nhan_khau");
        while (rs.next()) {                
            nhan_khau nhankhau = new nhan_khau(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),LocalDate.parse(rs.getString(9)),rs.getString(10),rs.getString(11));
            l_nhankhau.add(nhankhau);
        }
        connection.close();
        return l_nhankhau;
    }
    public static List<nhan_khau> get_nhankhau(String s) throws SQLException, ClassNotFoundException{
        List<nhan_khau> l_nhankhau = new ArrayList<>();
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM nhan_khau where ID like '%"+s+"%'");
        while (rs.next()) {                
            nhan_khau nhankhau = new nhan_khau(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),LocalDate.parse(rs.getString(9)),rs.getString(10),rs.getString(11));
            l_nhankhau.add(nhankhau);
        }
        connection.close();
        return l_nhankhau;
    }
    public static List<nhan_khau> get_nhankhau1(String s) throws SQLException, ClassNotFoundException{
        List<nhan_khau> l_nhankhau = new ArrayList<>();
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM nhan_khau where IDHoKhau = '"+s+"'");
        while (rs.next()) {                
            nhan_khau nhankhau = new nhan_khau(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),LocalDate.parse(rs.getString(9)),rs.getString(10),rs.getString(11));
            l_nhankhau.add(nhankhau);
        }
        connection.close();
        return l_nhankhau;
    }
    public static int getslnhankhau() throws SQLException, ClassNotFoundException{
        int sl =0;
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT count(ID) FROM nhan_khau");
        while (rs.next()) {                
            sl = rs.getInt(1);
        }
        return sl;
    } public static List<nhan_khau> get_nhankhau(int t1, int t2, String ThanhTich) throws SQLException, ClassNotFoundException{
        List<nhan_khau> l_nhankhau = new ArrayList<>();
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs;
        if(ThanhTich=="Không"){
        rs = st.executeQuery("SELECT * FROM `nhan_khau` WHERE Timestampdiff(year,NgaySinh,Now())>="+t1+" and TimeStampDiff(Year, NgaySinh, Now())<="+t2+" ");}
        else{
            String sql = "SELECT * FROM `nhan_khau` WHERE Timestampdiff(year,NgaySinh,Now())>="+t1+" and TimeStampDiff(Year, NgaySinh, Now())<="+t2+" and ThanhTich = N'"+ThanhTich+"'";
            rs = st.executeQuery(sql);
        }
        while (rs.next()) {                
            nhan_khau nhankhau = new nhan_khau(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getString(8),LocalDate.parse(rs.getString(9)),rs.getString(10),rs.getString(11));
            l_nhankhau.add(nhankhau);
        }
        connection.close();
        return l_nhankhau;
    }
    
}
