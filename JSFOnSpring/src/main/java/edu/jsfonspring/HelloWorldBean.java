/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.jsfonspring;

import java.util.Date;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorldBean {
    public String getHello() {
        return "Hello " + new Date();
    }
}
