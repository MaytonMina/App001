package com.example.app001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txtSaludo = (TextView) findViewById(R.id.lblDatos);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        txtSaludo.setText("ESTOS SON LOS DATOS PASADOS \n " + bundle.getString("NOMBRE") +
                "\n" +bundle.getString("TELEFONO") +
                "\n" +bundle.getString("FECHA")+
                "\n" +bundle.getString("SEXO"));

    }
}