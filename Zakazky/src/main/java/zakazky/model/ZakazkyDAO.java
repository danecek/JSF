/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.model;

import java.util.Collection;
import java.util.NavigableMap;
import java.util.TreeMap;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class ZakazkyDAO {

    private NavigableMap<Integer, Zakazka> zakazky = new TreeMap<>();

    public Collection<Zakazka> vsechny() {
        return zakazky.values();
    }
    
    public void vytvor(String popis) {
       int id = 1;
       if (!zakazky.isEmpty())
           id = zakazky.lastKey() + 1;
        Zakazka z = new Zakazka(id, popis);
       zakazky.put(z.getId(), z);
        
    }
    
    @PostConstruct
    void init() {
        vytvor("mala");
        vytvor("velka");
    }
    
    
}
