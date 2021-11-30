package com.example.app001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view){
        //Creamos el Intent
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
         EditText txtNom = (EditText)findViewById(R.id.txtEditNombre);
         EditText txtTel = (EditText)findViewById(R.id.txtTelefono);
        EditText txtFec = (EditText)findViewById(R.id.txtFechaNac);
        //EditText txtSex = (EditText)findViewById(R.id);

        // Creamos la información a pasar entre actividades - Pares Key-Value
         Bundle b = new Bundle();
         b.putString("NOMBRE", txtNom.getText().toString());
         b.putString("TELEFONO", txtTel.getText().toString());
        b.putString("FECHA", txtTel.getText().toString());
        //b.putString("se", txtTel.getText().toString());
        // Añadimos la información al intent
         intent.putExtras(b);
        // Iniciamos la nueva actividad
         startActivity(intent);
}
}