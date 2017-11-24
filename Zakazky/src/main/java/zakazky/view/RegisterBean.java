/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.view;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RegisterBean {

    private String password;

    private String password2;

    public void validateDate(ComponentSystemEvent event) {
        UIInput ui = (UIInput) event.getSource();
        UIInput pswi1 = (UIInput) ui.findComponent("passw");
        String psw1 = (String) pswi1.getLocalValue();
        UIInput pswi2 = (UIInput) ui.findComponent("passw1");
        String psw2 = (String) pswi1.getLocalValue();
        if (password.equals(password2)) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(ui.getClientId(), new FacesMessage("<>"));
            context.renderResponse();
        }
    }

    public String register() {
        return "home";
    }

    /**
     * @return the username
     */


    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
