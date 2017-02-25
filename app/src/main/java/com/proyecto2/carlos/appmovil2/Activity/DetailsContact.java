package com.proyecto2.carlos.appmovil2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.proyecto2.carlos.appmovil2.Entity.Contact;
import com.proyecto2.carlos.appmovil2.R;

public class DetailsContact extends AppCompatActivity {
    TextView textView1,textView2,textView3,textView4 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_contact);
        textView1=(TextView)findViewById(R.id.textViewName);
        textView2=(TextView)findViewById(R.id.textViewEdad);
        textView3=(TextView)findViewById(R.id.textViewOcupacion);
        textView4=(TextView)findViewById(R.id.textViewSexo);

        Button boton=(Button)findViewById(R.id.btnVerImgContact);

        final Contact objeto = (Contact) getIntent().getExtras().getSerializable("CONTACTO");


        textView1.setText(objeto.getNombre());
        textView2.setText(objeto.getEdad().toString());
        textView3.setText(objeto.getOcupacion());
        if(objeto.getSexo()==1){
            textView4.setText("MASCULINO");
        }else
            textView4.setText("FEMENINO");


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent nuevoForm = new Intent(DetailsContact.this, ImgContactActivity.class);
                    nuevoForm.putExtra("Img", objeto.getNombre());
                    startActivity(nuevoForm);
            }
        });
    }


}
