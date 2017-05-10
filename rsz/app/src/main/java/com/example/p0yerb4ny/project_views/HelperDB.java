package com.example.p0yerb4ny.project_views;

/**
 * Created by Aleksander on 2017-05-10.
 */

public class HelperDB {
    String login;
    double weight;
    double height;

    HelperDB(String _login, double _weight, double _height)
    {
        this.login = _login;
        this.weight = _weight;
        this.height = _height;
    }

    String getLogin()
    {
        return login;
    }

    double getWeight()
    {
        return weight;
    }

    double getHeight()
    {
        return height;
    }

    void setLogin(String _login)
    {
        this.login = _login;
    }

    void setWeight(double _weight)
    {
        this.weight = _weight;
    }

    void setLogin(double _height)
    {
        this.height = _height;
    }
}

