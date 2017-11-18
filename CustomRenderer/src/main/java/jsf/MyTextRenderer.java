package jsf;

import com.sun.faces.renderkit.html_basic.TextRenderer;
import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;

public class MyTextRenderer extends TextRenderer {

    @Override
    protected void getEndTextToRender(FacesContext context,
            UIComponent component,
            String currentValue)
            throws IOException {
        String[] attributes = {"player-nickname", "player-mother-name", "player-father-name"};
        ResponseWriter writer = context.getResponseWriter();
        for (String attribute : attributes) {
            String value = (String) component.getAttributes().get(attribute);
            if (value != null) {
                writer.writeAttribute(attribute, value, attribute);
            }
        }
        super.getEndTextToRender(context, component, currentValue);
    }

}
