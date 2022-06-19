/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import static controllers.LoginController.currentUser;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.tai_khoan;
import models.canbo;
import services.MysqlConnection;

public class CanBoController {
    public static canbo canbo;
    
    public canbo getcanbo() throws SQLException, ClassNotFoundException{
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM can_bo WHERE MaCanBo = '"+LoginController.currentUser.getMaCanBo()+"'");
        if (rs == null) {
            return canbo;
        }
        while (rs.next()) {                
            canbo = new canbo(rs.getString(1),rs.getInt(2),rs.getString(3),rs.getString(4));
            connection.close();
        }
        return canbo;
    }
}
