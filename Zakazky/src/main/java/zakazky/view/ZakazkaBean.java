/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import zakazky.model.Zakazka;
import zakazky.model.Zakazky;

@Component
@RequestScope
public class ZakazkaBean {

    @Autowired
    Zakazky zakazky;

    Zakazka zakazka;

    private int id;

//    public int getId() {
//        return 3333;
//    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
       // this.id = id;
        zakazka = zakazky.get(id);
    }

    public Zakazka getZakazka() {
        return zakazka;
    }

}
