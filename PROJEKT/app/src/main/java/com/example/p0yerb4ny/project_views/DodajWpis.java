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
        setContentView(R.layout.cwiczenia_dodaj);

//        ArrayAdapter gatunki = new ArrayAdapter(
//                this,
//                android.R.layout.simple_spinner_dropdown_item,
//                new String[] {"masa", "rzezba", "inne"});
//        Spinner gatunek = (Spinner) findViewById
//                (R.id.);
//        gatunek.setAdapter(gatunki);
        //edycja
        Bundle extras = getIntent().getExtras();
            try {
                if (extras.getSerializable("element") != null) {
                    Cwiczenie c = (Cwiczenie)
                            extras.getSerializable("element");
                    EditText NazwaCwiczenia = (EditText)
                            findViewById(R.id.NazwaCwiczenia);
                    EditText IloscSerii = (EditText)
                            findViewById(R.id.IloscSerii);
                    EditText IloscPowtorzen = (EditText)
                            findViewById(R.id.IloscPowtorzen);
                    NazwaCwiczenia.setText(c.getNazwaCwiczenia());
                    IloscSerii.setText(
                            Float.toString(c.getIloscSerii()));
                    IloscPowtorzen.setText(
                            Float.toString(c.getIloscPowtorzen()));
                    this.modyfi_id = c.getId();
                }
            } catch (Exception ex) {
                this.modyfi_id = 0;
            }

    }

    public void wyslij (View view)
    {
        EditText NazwaCwiczenia = (EditText) findViewById
                (R.id.NazwaCwiczenia);
        EditText IloscPowtorzen = (EditText)
                findViewById (R.id.IloscPowtorzen);
        EditText IloscSerii = (EditText) findViewById
                (R.id.IloscSerii);
        Cwiczenie c = new Cwiczenie(
                NazwaCwiczenia.getText().toString(),
                Integer.valueOf(IloscPowtorzen.getText().toString()),
                Integer.valueOf(IloscSerii.getText().toString())
        );
        c.setId(this.modyfi_id); //end
        Intent intencja = new Intent();
        intencja.putExtra("nowy", c);
        setResult(RESULT_OK, intencja);
        finish();
    }

}
