package com.example.p0yerb4ny.project_views;

import java.io.Serializable;

/**
 * Created by P0YERB4NY on 09.05.2017.
 */

public class Cwiczenie implements Serializable {


    private int id;
    private String nazwaCwiczenia;
    private int iloscPowtorzen;
    private int iloscSerii;

    public Cwiczenie(){}

    public Cwiczenie(String nazwaCwiczenia, int iloscPowtorzen, int iloscSerii){
        super();
        this.nazwaCwiczenia=nazwaCwiczenia;
        this.iloscPowtorzen=iloscPowtorzen;
        this.iloscSerii=iloscSerii;
    }

    @Override
    public String toString(){
        return "Zwierze: [id="+id+",nazwa cwiczenia="+nazwaCwiczenia+",ilosc powtorzen ="+iloscPowtorzen+"ilosc serii ="+iloscSerii+"]" ;

    }

    public String getNazwaCwiczenia(){return nazwaCwiczenia;}

    public int getIloscPowtorzen() {
        return iloscPowtorzen;
    }
    public int getIloscSerii() {
        return iloscSerii;
    }
    public int getId(){return id;}
    public void setId(int id){this.id=id;}
}
