/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telhaisystems;

/**
 *
 * @author Nitzan
 */
public class User {
    String username;
    String password;
    int permission;
    
    public User(String username,String password,int permission)
    {
        this.username=username;
        this.password=password;
        this.permission=permission;
    }
}
