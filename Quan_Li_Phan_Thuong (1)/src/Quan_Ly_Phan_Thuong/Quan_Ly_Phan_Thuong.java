/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Quan_Ly_Phan_Thuong;

import javax.swing.UIManager;
import views.LoginUI;

public class Quan_Ly_Phan_Thuong {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (Exception e) {
        }
        LoginUI loginUI = new LoginUI();
        loginUI.setVisible(true);
    }
}
