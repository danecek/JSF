package zakazky.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Service;

@Service
public class Zakazky {

    private final NavigableMap<Integer, Zakazka> zakazky;

    public Zakazky() {
        zakazky = new TreeMap<>();
    }

    public List<Zakazka> getVsechny() {
        return new ArrayList(zakazky.values());
    }

    public void vytvor(String popis) {
        int id = 1;
        if (!zakazky.isEmpty()) {
            id = zakazky.lastKey() + 1;
        }
        Zakazka z = new Zakazka(id, popis);
        zakazky.put(z.getId(), z);
    }

    @PostConstruct
    void init() {
        vytvor("mala");
        vytvor("rychla");
    }

    public Zakazka get(int id) {
        return zakazky.get(id);
    }
}
