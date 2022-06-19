
package controllers;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import models.tai_khoan;
import services.MysqlConnection;

public class LoginController {
    
    public static tai_khoan currentUser;
    
    public boolean login(String userName, String password) throws SQLException, ClassNotFoundException{
        Connection connection = MysqlConnection.getMysqlConnection();
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM tai_khoan WHERE TaiKhoan = '" + userName +"' and MatKhau = '" + password +"'");
        if (rs == null) {
            return false;
        }
        while (rs.next()) {                
            currentUser = new tai_khoan(rs.getString(1),rs.getString(2),rs.getInt(3));
            connection.close();
            return true;
        }
        connection.close();
        return false;
    }
    
}
