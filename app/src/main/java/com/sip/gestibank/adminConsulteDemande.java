package com.sip.gestibank;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import  androidx.fragment.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View;

import android.os.Bundle;
public class adminConsulteDemande extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_consulte_agent);
    }

    public class ConsulterDemande extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle saveInstanceState) {
            //Inflate the layout for this fragment
            return inflater.inflate(R.layout.activity_admin_consulte_demande, container, false);
        }
    }
}