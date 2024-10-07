/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author admin
 */
public class Patient {
    private String ID;
    private String Name;
    private String Age;
    private String Address;
    private String Phone;
    private String Email;
    public Patient()
    {
        
    }
    public String getName()
    {
        return this.Name;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public void setAge(String Age)
    {
        this.Age = Age;
    }
    public String getAge()
    {
        return this.Age;
    }
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public String getID()
    {
        return this.ID;
    }
    public void setEmail(String Mail)
    {
        this.Email = Mail;
    }
    public String getMail()
    {
        return this.Email;
    }
    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    public String getAddress()
    {
        return this.Address;
    }
    public void setPhone(String Phone)
    {
        this.Phone = Phone;
    }
    public String getPhone()
    {
        return this.Phone;
    }
    public Patient(String ID,String name,String age,String address,String phone,String mail)
    {
        this.ID = ID;
        this.Name = name;
        this.Age = age;
        this.Address = address;
        this.Phone = phone;
        this.Email = mail;
    }
}