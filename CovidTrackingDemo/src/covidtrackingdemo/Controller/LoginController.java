/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covidtrackingdemo.Controller;

import covidtrackingdemo.Entity.User;
import java.io.IOException;

/**
 *
 * @author User
 */
public class LoginController {
    
    public LoginController() {}
    
    public String login(String username, String password) throws IOException {
    
        User user = new User();
        return user.login(username, password);
    }
}
