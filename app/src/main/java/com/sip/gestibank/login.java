package com.sip.gestibank;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.sip.gestibank.models.User;
import com.sip.gestibank.remote.APIUtils;
import com.sip.gestibank.remote.AuthService;
import com.sip.gestibank.remote.ClientService;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class login extends AppCompatActivity {
    //Binder le bouton avec  l'activité dashbordClient
    //ImageButton myImageButtonLogin;
    AuthService authService;

    EditText email;
    EditText password;
    String myEmail="";
    String myPassword="";
    User user;
    String  role = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//       myImageButtonLogin = findViewById(R.id.Idlogin);
        // affectation des attributs aux view

        email = (EditText) findViewById(R.id.editTextEmail);
        password = (EditText) findViewById(R.id.editTextPassword);
        authService = APIUtils.getAuthService();

    }
    public void dashboardUser(View v){
        Toast.makeText(login.this, "login " , Toast.LENGTH_SHORT).show();
        Intent intentlogin = new Intent(getApplicationContext(), dashboardAdmin.class);
        startActivity(intentlogin);


       /* myEmail = email.getText().toString();
        myPassword = password.getText().toString();

       Toast.makeText(login.this, "Login : "+ myEmail +" Password : "+ myPassword, Toast.LENGTH_SHORT).show();
*/
        // récupération du user et donc de son role

       /* Call<User> call = authService.getUserByEmail(myEmail);

        call.enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    user = response.body();
                    role = user.getRole();
                }
            }
            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Log.e("ERROR: ", t.getMessage());
            }
        });
        // fin récupération

        //...


        //role =user.getRole();
        //Redirection vers le dashboard en question : Admin, Client ou Agent

        switch(role)
        {
            case "AGENT" : //.... redirection vers dashboard Agent
                Intent intent1 = new Intent(login.this, dashboardAgent.class);
                startActivity(intent1);
                break;

            case "CLIENT" : //.... redirection vers dashboard Agent
                Intent intent2 = new Intent(login.this, dashboardClient.class);
                startActivity(intent2);
                break;

            case "ADMIN" : //.... redirection vers dashboard Agent
                Intent intent3 = new Intent(login.this, dashboardAdmin.class);
                startActivity(intent3);
                break;
        }*/
    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }




   /* public void Navigate(View v){
        switch (v.getId()){
            case R.id.btnAdmin:
                Intent intentA = new Intent(getApplicationContext(), dashboardAdmin.class);
                startActivity(intentA);
                break;
            case R.id.btnAgent:
                Intent intentB = new Intent(getApplicationContext(), dashboardAgent.class);
                startActivity(intentB);
                break;
            case R.id.btnClient:
                Intent intentC = new Intent(getApplicationContext(), dashboardClient.class);
                startActivity(intentC);
                break;
            case R.id.Idlogin:
                Intent intentLogin = new Intent(getApplicationContext(), dashboardAdmin.class);
                startActivity(intentLogin);
                break;

            case R.id.btnDeconnecter:
                Intent intentD = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentD);
                finish();
                break;
        }

    }*/
}