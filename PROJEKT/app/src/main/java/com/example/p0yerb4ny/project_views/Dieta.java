package com.example.p0yerb4ny.project_views;

/**
 * Created by B on 10.05.2017.
 */

public class Dieta {
    private Integer ID_osoba;
    private Integer ID_posilek;

    Dieta(Integer _ID_osoba, Integer _ID_posilek)
    {
        this.setID_osoba(_ID_osoba);
        this.setID_posilek(_ID_posilek);
    }


    public Integer getID_osoba() {
        return ID_osoba;
    }

    public void setID_osoba(Integer ID_osoba) {
        this.ID_osoba = ID_osoba;
    }

    public Integer getID_posilek() {
        return ID_posilek;
    }

    public void setID_posilek(Integer ID_posilek) {
        this.ID_posilek = ID_posilek;
    }
}
