package com.sip.gestibank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class devise extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Spinner spinnerDe, spinnerVers;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_devise);
// Spinner de la source
        spinnerDe = findViewById(R.id.idSpinnerDe);
        String[] devisesDe = {"Dollars","Euro","TND","MRU"};
        ArrayAdapter<String> adapterDe = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, devisesDe);
        spinnerDe.setAdapter(adapterDe);
// Spinner de la destination
        spinnerVers = findViewById(R.id.idSpinnerVers);
        String[] devisesVers = {"Dollars","Euro","TND","MRU"};
        ArrayAdapter<String> adapterVers = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, devisesVers);
        spinnerVers.setAdapter(adapterVers);
    }
}