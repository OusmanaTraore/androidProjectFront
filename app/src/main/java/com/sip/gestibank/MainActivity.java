package com.sip.gestibank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        videoView= findViewById(R.id.videoView);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.animelogo2));
        videoView.setMediaController(new MediaController(this));
        videoView.requestFocus();
        videoView.start();

        //Binder le bouton avec  l'activité devise
        Button myButtonDevise=  findViewById(R.id.btnGoToTheDevise);

        myButtonDevise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Currency_Activity.class);
                startActivity(intent);
            }
        });
        //Binder le bouton avec  l'activité creation de compte
        Button myButtonCreationCompte=  findViewById(R.id.btnGoToTheCreationCompte);

        myButtonCreationCompte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), creationCompte.class);
                startActivity(intent);
            }
        });
    };



    public void interfaceConversionDevise(View v){

    }


    public void addNewClient(View v){

        Intent intent = new Intent(MainActivity.this, NewClient.class);
        startActivity(intent);
    }
}