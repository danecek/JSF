/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.view;

import javax.inject.Inject;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import zakazky.model.ZakazkyDAO;

@Component
@RequestScope
public class VytvorBean {

    /**
     * @return the popis
     */
    public String getPopis() {
        return popis;
    }

    /**
     * @param popis the popis to set
     */
    public void setPopis(String popis) {
        this.popis = popis;
    }

    @Inject
    ZakazkyDAO zakazkyDAO;
    
    private String popis;
    
    public String create() {
        zakazkyDAO.vytvor(popis);
        return "home";
        
    }
    
    

}
