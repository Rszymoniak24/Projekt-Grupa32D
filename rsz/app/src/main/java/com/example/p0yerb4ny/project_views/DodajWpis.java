package com.example.p0yerb4ny.project_views;

/**
 * Created by P0YERB4NY on 09.05.2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;


public class DodajWpis extends AppCompatActivity {

    private int modyfi_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.treningi_cwiczenia);
    }

    public void wyslij (View view)
    {
        EditText nazwaCwiczenia = (EditText) findViewById
                (R.id.NazwaCwiczenia);
        EditText iloscPowtorzen = (EditText)
                findViewById (R.id.IloscPowtorzen);
        EditText iloscSerii = (EditText) findViewById
                (R.id.IloscSerii);
        Cwiczenie c = new Cwiczenie(
                nazwaCwiczenia.getText().toString(),
                Integer.valueOf(iloscPowtorzen.getText().toString()),
                Integer.valueOf(iloscSerii.getText().toString())
        );
        Intent intencja = new Intent();
        intencja.putExtra("nowy", c);
        setResult(RESULT_OK, intencja);
        finish();
    }

}
