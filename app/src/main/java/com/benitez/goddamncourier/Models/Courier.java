package com.benitez.goddamncourier.Models;

/**
 * Created by marlo on 6/23/2016.
 */
public class Courier
{
    //region [ Fields ]

    private int id;

    private String name;

    private String username;

    private String password;

    private String phone;

    //endregion

    //region [ Constructors ]

    public Courier (int id, String name, String username, String password, String phone)
    {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.phone = phone;
    }

    public Courier (String name, String username, String password)
    {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    //endregion

    //region [ Getters and Setters ]

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //endregion

}
