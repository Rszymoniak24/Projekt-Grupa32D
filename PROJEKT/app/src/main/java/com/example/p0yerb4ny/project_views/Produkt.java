package com.example.p0yerb4ny.project_views;

/**
 * Created by B on 10.05.2017.
 */

public class Produkt {

    private Integer ID_produkt;
    private String nazwa_produkt;
    private String nazwa_atrybutu;



    Produkt(Integer _ID_produkt, String _nazwa_produkt, String _nazwa_atrybutu)
    {
        this.ID_produkt = _ID_produkt;
        this.nazwa_produkt = _nazwa_produkt;
        this.nazwa_atrybutu = _nazwa_atrybutu;
    }

    public Integer getID_produkt() {
        return ID_produkt;
    }

    public void setID_produkt(Integer ID_produkt) {
        this.ID_produkt = ID_produkt;
    }

    public String getNazwa_produkt() {
        return nazwa_produkt;
    }

    public void setNazwa_produkt(String nazwa_produkt) {
        this.nazwa_produkt = nazwa_produkt;
    }

    public String getNazwa_atrybutu() {
        return nazwa_atrybutu;
    }

    public void setNazwa_atrybutu(String nazwa_atrybutu) {
        this.nazwa_atrybutu = nazwa_atrybutu;
    }
}
