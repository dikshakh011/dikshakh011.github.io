package com.myapp.struts;

/**
 *
 * @author kheta
 */
public class LoginForm extends org.apache.struts.action.ActionForm {
    
    private String Name;
    
    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}
     