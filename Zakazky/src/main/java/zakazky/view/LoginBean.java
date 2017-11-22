/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.view;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class LoginBean {

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

    private static final String A = "anonym";
    private String user;
    private String logged = A;
    private final Set<String> users = new HashSet<>();

    @PostConstruct
    void init() {
        Collections.addAll(users, "bob", "tom");
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String login() {
        setLogged(user);
        user = null;
        return "home";
    }

    public void logout() {
        setLogged(A);
        user = null;
    }

    public boolean isAnonym() {
        return logged.equals(A);
    }

}
