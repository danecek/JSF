/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zakazky.model;

/**
 *
 * @author danecek
 */
public class Zakazka {

    private int id;
    private String popis;

    public Zakazka(int id, String popis) {
        this.id = id;
        this.popis = popis;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the popis
     */
    public String getPopis() {
        return popis;
    }

    /**
     * @param popis the popis to set
     */
    public void setPopis(String popis) {
        this.popis = popis;
    }

    @Override
    public String toString() {
        return "Zakazka{" + "id=" + id + ", popis=" + popis + '}';
    }

}
