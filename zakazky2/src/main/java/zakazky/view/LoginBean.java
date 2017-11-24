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
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    private String user;

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
    private String logged = A;

    public String login() {
        logged = user;
        user=null;
        return "home";
    }

    public String logout() {
        logged = A;
        return "index";
    }

    public boolean isAnonym() {
        return A.equals(logged);
    }

}
