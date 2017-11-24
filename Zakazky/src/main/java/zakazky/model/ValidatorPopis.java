/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.model;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author admin
 */
@FacesValidator("zakazky.model.ValidatorPopis")
public class ValidatorPopis implements Validator {

    @Override
    public void validate(FacesContext fc, UIComponent uic, Object o) throws ValidatorException {
        String popis = (String) o;
        if (popis.length() < 3) {
            throw new ValidatorException(new FacesMessage("Chyba: (< 3)"));
        }

    }

}
