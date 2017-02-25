package com.proyecto2.carlos.appmovil2.Activity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.proyecto2.carlos.appmovil2.R;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button boton=(Button)findViewById(R.id.btnIngresar);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user= ((EditText)findViewById(R.id.editTextUser)).getText().toString();
                String password= ((EditText)findViewById(R.id.editTextPassword)).getText().toString();

                if(user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")){
                    Intent nuevoForm=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(nuevoForm);
                }else{
                    Toast.makeText(getApplicationContext(),"Credenciales Incorrectos",Toast.LENGTH_SHORT).show();
                }


            }
        });
    }


}
