/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Model.User;
import Model.Connect;

/**
 *
 * @author khaaz
 */
public class Control_User {

    Connect Info = new Connect();

    public Control_User() {

    }

    public boolean Login(User Login_User) {
        try (Connection con = DriverManager.getConnection(Info.getUrl(), Info.getUser(), Info.getPassword());) {
            String SQL_Ins = "select * from tb_user where login_name = ?";
            PreparedStatement PreStm = con.prepareStatement(SQL_Ins);
            PreStm.setString(1, Login_User.getName());
            ResultSet rs = PreStm.executeQuery();
            User Data_User = new User();
            while (rs.next()) {
                Data_User.setName(rs.getString("login_name"));
                Data_User.setPass(rs.getString("login_pass"));
            }
            if (Login_User.getPass().equals(Data_User.getPass())) {
                return true;

            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public User Search_User(String Login_Name) {
        try (Connection con = DriverManager.getConnection(Info.getUrl(), Info.getUser(), Info.getPassword());) {
            User Find_User = new User();
            String SQL_Ins = "select * from tb_user where login_name = ?";
            PreparedStatement PreStm = con.prepareStatement(SQL_Ins);
            PreStm.setString(1, Login_Name);
            ResultSet rs = PreStm.executeQuery();
            while(rs.next())
            {
                Find_User.setName(rs.getString("login_name"));
                Find_User.setPass(rs.getString("login_pass"));
            }
            if(Find_User.getName() == null)
            {
                return null;
            }
            return Find_User;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    public void Work()
    {
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Control_User a = new Control_User();
        a.Search_User("Prad");
    }
}
