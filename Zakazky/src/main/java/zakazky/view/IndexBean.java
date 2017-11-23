/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.view;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import zakazky.model.Zakazka;
import zakazky.model.ZakazkyDAO;

@Component
@RequestScope
public class IndexBean {
    
   // private List<Zakazka> zakazky;
    
    @Inject
    ZakazkyDAO zakazkyDAO;

    public List<Zakazka> getZakazky() {
        return new ArrayList<>(zakazkyDAO.vsechny());
    }

//    public void setZakazky(List<Zakazka> zakazky) {
//        this.zakazky = zakazky;
//    }
    
}
