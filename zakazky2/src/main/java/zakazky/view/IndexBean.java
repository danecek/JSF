/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.view;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import zakazky.model.Zakazka;
import zakazky.model.ZakazkyDAO;

@Component
@SessionScope
public class IndexBean {

    /**
     * @return the zakazky
     */
    public List<Zakazka> getZakazky() {
        return zakazky;
    }

    /**
     * @param zakazky the zakazky to set
     */
    public void setZakazky(List<Zakazka> zakazky) {
        this.zakazky = zakazky;
    }

    @Inject
    ZakazkyDAO zakazkyDAO;

    private List<Zakazka> zakazky;

    @PostConstruct
    public void init() {
        zakazky = new ArrayList<>(zakazkyDAO.vsechny());
    }

}
