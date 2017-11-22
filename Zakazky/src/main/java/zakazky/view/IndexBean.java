package zakazky.view;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import zakazky.model.Zakazka;
import zakazky.model.Zakazky;

@Component
@RequestScope
public class IndexBean {

    @Autowired
    Zakazky zakazky;

    public List<Zakazka> getZakazky() {
        return zakazky.getVsechny();
    }

}
