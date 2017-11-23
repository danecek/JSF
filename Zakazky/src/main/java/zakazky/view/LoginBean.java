/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.view;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class LoginBean {

    /**
     * @return the A
     */
    public static String getA() {
        return A;
    }

    /**
     * @param aA the A to set
     */
    public static void setA(String aA) {
        A = aA;
    }

    /**
     * @return the logged
     */
    public String getLogged() {
        return logged;
    }

    /**
     * @param logged the logged to set
     */
    public void setLogged(String logged) {
        this.logged = logged;
    }

    private static String A = "anonym";
    private String logged  = A;
    
    
}
