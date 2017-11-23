package jsfonspring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class HelloWorldBean {

    private String text = "ccc";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUpper() {
        text = text.toUpperCase();
       // return "HelloW";
    }

}
