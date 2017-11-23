package jsfonspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class HelloWorldBean {

    @Autowired
    SpringBean sb;

    public String getHello() {
        return sb.getHello();
    }
}
