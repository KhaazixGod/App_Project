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
import Model.Patient;
import Model.Connect;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author khaaz
 */
public class Control_Patient {
    private Connect Info = new Connect();
    public Control_Patient()
    {
        
    }
    public void Add_Patient(Patient New_Pat)
    {
        try(Connection con = DriverManager.getConnection(Info.getUrl(),Info.getUser(),Info.getPassword());)
        {
            String SQL_Ins = "insert into tb_patient values (?,?,?,?,?,?)";
            PreparedStatement PreStm = con.prepareStatement(SQL_Ins);
            PreStm.setString(1,New_Pat.getID());
            PreStm.setString(2,New_Pat.getName());
            PreStm.setInt(3,Integer.parseInt(New_Pat.getAge()));
            PreStm.setString(4,New_Pat.getAddress());
            PreStm.setString(5, New_Pat.getPhone());
            PreStm.setString(6, New_Pat.getMail());
            PreStm.execute();
            PreStm.close();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
    public void Delete_Patient (String ID)
    {
        try (Connection con = DriverManager.getConnection(Info.getUrl(),Info.getUser(),Info.getPassword());)
        {
            String SQL_ins = "delete from tb_patient where ID = ?;";
            PreparedStatement PreStm = con.prepareStatement(SQL_ins);
            PreStm.setString(1,ID);
            PreStm.execute();
            PreStm.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    public Patient Search_Patient(String ID)
    {
        try (Connection con = DriverManager.getConnection(Info.getUrl(),Info.getUser(),Info.getPassword());)
        {
            String SQL_ins = "select * from tb_patient where ID = ?";
            PreparedStatement PreStm = con.prepareStatement(SQL_ins);
            PreStm.setString(1, ID);
            ResultSet rs = PreStm.executeQuery();
            while(rs.next())
            {
                Patient new_pat = new Patient(rs.getString("id"),rs.getString("name"),rs.getString("age"),rs.getString("address"),rs.getString("phone"),rs.getString("email"));
                return new_pat;
            }
            return null;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public List<Patient> List_Patient(String Column_Name,String Filter,int Begin)
    {
        try (Connection con = DriverManager.getConnection(Info.getUrl(),Info.getUser(),Info.getPassword());)
        {
            if(!Filter.equals(""))
            {
                Filter = "where name like '%"+Filter+"%'";
            }
            List<Patient> Lst_Patient = new ArrayList<>();
            String SQL_ins = "select * from tb_patient "+Filter+ " order by "+Column_Name+" offset ? rows fetch next 10 rows only";
            PreparedStatement PreStm = con.prepareStatement(SQL_ins);
            PreStm.setInt(1, Begin*10);
            ResultSet rs = PreStm.executeQuery();
            while(rs.next())
            {
                Lst_Patient.add(new Patient(rs.getString("id"),rs.getString("name"),rs.getString("age"),rs.getString("address"),rs.getString("phone"),rs.getString("email")));
            }
            return Lst_Patient;
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }public int Number_Of_Patient()
    {
        try (Connection con = DriverManager.getConnection(Info.getUrl(),Info.getUser(),Info.getPassword());)
        {
            String SQL_ins = "select count(*) from tb_patient";
            PreparedStatement PreStm = con.prepareStatement(SQL_ins);
            ResultSet rs = PreStm.executeQuery();
            if(rs.next())
            {
                int Number_pages = rs.getInt(1);
                if (Number_pages % 10 == 0)
                {
                return Number_pages/10;
                }
                else
                {
                    return Number_pages/10+1;
                }
            }
            return 1;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return 0;
        }
    }
}
