package com.example.p0yerb4ny.project_views;

/**
 * Created by B on 10.05.2017.
 */

public class Posilek {

    private Integer ID_produkt;
    private Integer ID_posilek;
    Produkt produkt;
    private Integer ilosc_kcal;

    Posilek(Integer _ID_produkt, Integer _ID_posilek, Integer _ilosc_kcal,Produkt _produkt)
    {
        produkt = _produkt;
        this.ID_produkt = _ID_produkt;
        this.ID_posilek = _ID_posilek;
        this.ilosc_kcal = _ilosc_kcal;
    }

    public Integer getID_produkt() {
        return ID_produkt;
    }

    public void setID_produkt(Integer ID_produkt) {
        this.ID_produkt = ID_produkt;
    }

    public Integer getID_posilek() {
        return ID_posilek;
    }

    public void setID_posilek(Integer ID_posilek) {
        this.ID_posilek = ID_posilek;
    }

    public Integer getIlosc_kcal() {
        return ilosc_kcal;
    }

    public void setIlosc_kcal(Integer ilosc_kcal) {
        this.ilosc_kcal = ilosc_kcal;
    }
}
