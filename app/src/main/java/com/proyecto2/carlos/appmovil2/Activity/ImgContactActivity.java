package com.proyecto2.carlos.appmovil2.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.proyecto2.carlos.appmovil2.R;

public class ImgContactActivity extends AppCompatActivity {

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_contact);

        imageView=(ImageView)findViewById(R.id.imageViewContact);

        String selector_img = getIntent().getStringExtra("Img");

        switch (selector_img){
            case "CARLOS":
                imageView.setImageResource(R.drawable.carlos);
                break;
            case "JAIME":
                imageView.setImageResource(R.drawable.jaime);
                break;
            case "JESUS":
                imageView.setImageResource(R.drawable.jesus);
                break;
            case "MARIA":
                imageView.setImageResource(R.drawable.maria);
                break;
            default:
                break;
        }
    }
}
