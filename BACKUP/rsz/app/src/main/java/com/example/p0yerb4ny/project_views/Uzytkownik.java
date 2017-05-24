package com.example.p0yerb4ny.project_views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Uzytkownik extends AppCompatActivity {
    EditText login,weight,height;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzytkownik);
        Button save = (Button)findViewById(R.id.button);
        login = (EditText)findViewById(R.id.editText);
        weight = (EditText)findViewById(R.id.editText);
        height = (EditText)findViewById(R.id.editText);
    }

    public void onClick(View view)
    {

        HelperDB user = new HelperDB(login.getText().toString(),Double.parseDouble(weight.getText().toString()),Double.parseDouble(height.getText().toString()));

    }
}
