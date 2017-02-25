package com.proyecto2.carlos.appmovil2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.proyecto2.carlos.appmovil2.R;

public class MainActivity extends AppCompatActivity {

    String selector="3";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton=(Button)findViewById(R.id.buttonVerContacts);
        RadioGroup rdgGrupo = (RadioGroup)findViewById(R.id.rdgGrupo);

        rdgGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if (checkedId == R.id.radioButton1){
                   selector="0";
                }else if (checkedId == R.id.radioButton2){
                    selector="1";
                }else if (checkedId == R.id.radioButton3){
                    selector="2";
                }
            }
        });

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!selector.equalsIgnoreCase("3")){
                    Intent nuevoForm = new Intent(MainActivity.this, ContactActivity.class);
                    nuevoForm.putExtra("selection", selector);
                    startActivity(nuevoForm);
                }else
                    Toast.makeText(getApplicationContext(),"DEBE SELECCIONAR UNA OPCION",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
