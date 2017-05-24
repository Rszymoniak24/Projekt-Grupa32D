package com.example.p0yerb4ny.project_views;


/**
 * Created by Łukasz on 2017-05-11.
 */
class Trening {
    private int id;
    private String nazwaTreningu;
    private String rodzajTreningu;
    private  String opisTreningu;

    public Trening(){}

    public Trening(String nazwaTreningu, String rodzajTreningu, String opisTreningu)  {
        super();
        this.nazwaTreningu = nazwaTreningu;
        this.rodzajTreningu = rodzajTreningu;
        this.opisTreningu = opisTreningu;


    }
    @Override
    public String toString() {
        return "Trening [id=" + id + ", nazwaTreningu=" + nazwaTreningu + ", rodzajTreningu=" + rodzajTreningu + opisTreningu + ", opisTreningu="+ "]";
    }
    public String getNazwaTreningu(){return nazwaTreningu;}

    public String getRodzajTreningu() {
        return rodzajTreningu;
    }
    public String getOpisTreningu() {
        return opisTreningu;
    }

    public int getId(){return id;}
    public void setId(int id){this.id=id;}
}
