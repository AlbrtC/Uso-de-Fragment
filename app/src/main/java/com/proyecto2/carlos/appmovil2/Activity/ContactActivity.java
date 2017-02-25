package com.proyecto2.carlos.appmovil2.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.proyecto2.carlos.appmovil2.Entity.Contact;
import com.proyecto2.carlos.appmovil2.R;

import java.util.ArrayList;

public class ContactActivity extends AppCompatActivity {

    ListView listView;
    Contact[] contactos=new Contact[4];
    ArrayList<Contact> dataContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        String selector_in = getIntent().getStringExtra("selection");

        listView=(ListView)findViewById(R.id.listView);
        contactos[0]=new Contact("CARLOS",23,"ESTUDIANTE",1);
        contactos[1]=new Contact("JAIME",23,"ADMINISTRADOR",1);
        contactos[2]=new Contact("JESUS",22,"BOMBERO",1);
        contactos[3]=new Contact("MARIA",20,"ESTUDIANTE",2);

        //FEMENINO=2
        //MASCULINO=1

        dataContact= new ArrayList<Contact>();
        ArrayList<String> data = new ArrayList<String>();


            if(Integer.parseInt(selector_in)==0) {
                for (int i = 0; i < contactos.length; i++) {
                    dataContact.add(contactos[i]);
                    data.add(contactos[i].getNombre());
                }
            }else
                for (int i = 0; i < contactos.length; i++) {
                    if(contactos[i].getSexo()==Integer.parseInt(selector_in)) {
                        dataContact.add(contactos[i]);
                        data.add(contactos[i].getNombre());
                    }
            }



        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,data);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nuevoForm=new Intent(ContactActivity.this,DetailsContact.class);
                nuevoForm.putExtra("CONTACTO", dataContact.get(position));
                startActivity(nuevoForm);
                //Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_SHORT).show();

            }
        });

    }
}
