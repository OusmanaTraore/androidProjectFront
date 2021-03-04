package com.sip.gestibank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import  androidx.fragment.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import  android.view.ViewGroup;

import android.view.LayoutInflater;


public class adminDashbord2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashbord2);

        Button fragmentConsulterDemande = findViewById(R.id.btn_Consulter_Demandes);
        Button fragmentConsulterAgent = findViewById(R.id.btn_Consulter_Agents);
        Button fragmentAjouterAgent = findViewById(R.id.btn_Ajouter_Agent);

        //final Fragment ConsulterDemande =new ConsulterDemande();
        //final Fragment ConsulterAgent =new ConsulterAgent();
        //final Fragment AjouterAgent =new AjouterAgent();

        //Get Fragment Manager Object

        androidx.fragment.app.FragmentManager fragmentManager = getSupportFragmentManager();

        /*FragmentTransaction fragmentTransaction=  FragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_FrameLayout, ConsulterDemande).commit();

        fragmentConsulterDemande.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main_FrameLayout,ConsulterDemande).commit();
            }
        });
        fragmentConsulterAgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main_FrameLayout,ConsulterAgent).commit();
            }
        });
        fragmentAjouterAgent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.main_FrameLayout,AjouterAgent).commit();
            }
        });
    }*/
//
    }}