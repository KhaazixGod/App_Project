/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author khaaz
 */
public class User {
    private String Login_Name;
    private String Password;
    public User()
    {
        this.Login_Name = null;
        this.Password = null;
    }
    public User(String Log_Name,String Log_Pass)
    {
        this.Login_Name = Log_Name;
        this.Password = Log_Pass;
    }
    public void setName(String Log_Name)
    {
        this.Login_Name = Log_Name;
    }
    public void setPass(String Log_Pass)
    {
        this.Password = Log_Pass;
    }
    public String getName()
    {
        return this.Login_Name;
    }
    public String getPass()
    {
        return this.Password;
    }
}
