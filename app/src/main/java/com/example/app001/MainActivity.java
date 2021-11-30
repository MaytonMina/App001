package com.example.app001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

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
        RadioButton rbF = (RadioButton)findViewById(R.id.rbFemenino);
        RadioButton rbM = (RadioButton)findViewById(R.id.rbMasculino);
        //EditText txtSex = (EditText)findViewById(R.id);

        // Creamos la información a pasar entre actividades - Pares Key-Value
         Bundle b = new Bundle();
         b.putString("NOMBRE", txtNom.getText().toString());
         b.putString("TELEFONO", txtTel.getText().toString());
         b.putString("FECHA", txtFec.getText().toString());
        if (rbM.isChecked())
        {
            b.putString("SEXO", rbM.getText().toString());
        }
        else if (rbF.isChecked()){
            b.putString("SEXO", rbF.getText().toString());
        }
        else {
            b.putString("SEXO", "No definido");
        }
        // Añadimos la información al intent
         intent.putExtras(b);
        // Iniciamos la nueva actividad
         startActivity(intent);
}
}