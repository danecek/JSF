package jsfonspring;

import javax.faces.bean.ManagedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ManagedBean
@Component
public class HelloWorldBean {

    @Autowired
    SpringBean sb;

    public String getHello() {
        return sb.getHello();
    }
}
