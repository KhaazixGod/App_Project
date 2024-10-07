/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class Connect {
    private String Url = "jdbc:sqlserver://DESKTOP-6I91O35:1433;databaseName=Hospital;integratedSecurity=true";
    private String User = "Pread";
    private String Password = "123";
    public String getUrl()
    {
        return this.Url;
    }
    public String getUser()
    {
        return this.User;
    }
    public String getPassword()
    {
        return this.Password;
    }
}
