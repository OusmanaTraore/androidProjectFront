package com.sip.gestibank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class adminAjouterAgent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_ajouter_agent);
    }
    public class AjouterAgent extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle saveInstanceState) {
            //Inflate the layout for this fragment
            return inflater.inflate(R.layout.activity_admin_ajouter_agent, container, false);
        }
    }
}