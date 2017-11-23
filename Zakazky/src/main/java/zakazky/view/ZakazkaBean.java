/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.view;

import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import zakazky.model.Zakazka;
import zakazky.model.ZakazkyDAO;

@Component
@RequestScope
public class ZakazkaBean {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
      //  setZakazka(getZakazkyDAO().get(id));
        this.id = id;
    }

    /**
     * @return the zakazkyDAO
     */
    public ZakazkyDAO getZakazkyDAO() {
        return zakazkyDAO;
    }

    /**
     * @param zakazkyDAO the zakazkyDAO to set
     */
    public void setZakazkyDAO(ZakazkyDAO zakazkyDAO) {
        this.zakazkyDAO = zakazkyDAO;
    }
    
    private int id;
 //   private Zakazka zakazka;
    
//    @PostConstruct
//    void init() {
//        FacesContext fc = FacesContext.getCurrentInstance();
//        Map<String, String> rm = fc.getExternalContext().getRequestParameterMap();
//        int id = Integer.valueOf(rm.get("id"));
//        setZakazka(getZakazkyDAO().get(id));
//    }
    
    @Inject
    private ZakazkyDAO zakazkyDAO;

    /**
     * @return the zakazka
     */
    public Zakazka getZakazka() {
        return getZakazkyDAO().get(id);
    }

//    /**
//     * @param zakazka the zakazka to set
//     */
//    public void setZakazka(Zakazka zakazka) {
//        this.zakazka = zakazka;
//    }
}
