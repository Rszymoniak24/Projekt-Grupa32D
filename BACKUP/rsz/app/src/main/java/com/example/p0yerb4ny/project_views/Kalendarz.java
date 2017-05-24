package com.example.p0yerb4ny.project_views;

/**
 * Created by B on 10.05.2017.
 */

public class Kalendarz {

    private Integer Data;
    private Integer ID_Treningu;

    Kalendarz(Integer _data, Integer _ID_Treningu)
    {
        this.setData(_data);
        this.setID_Treningu(_ID_Treningu);
    }

    Integer getData()
    {
        return Data;
    }

    public void setData(Integer data) {
        Data = data;
    }

    public Integer getID_Treningu() {
        return ID_Treningu;
    }

    public void setID_Treningu(Integer ID_Treningu) {
        this.ID_Treningu = ID_Treningu;
    }
}
