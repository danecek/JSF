package jsfonspring;

import java.util.Date;
import org.springframework.stereotype.Service;

@Service
public class SpringBean {

    public String getHello() {
        return "Hello " + new Date();
    }
}
