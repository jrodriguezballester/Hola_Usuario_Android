package com.example.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SaludosActivity extends AppCompatActivity {

    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludos);
        //Recuperar la informacion pasada por el intent (bundle)
        Bundle bundle=this.getIntent().getExtras();

        // localizar la etiqueta
        txtSaludo = (TextView) findViewById(R.id.TxtSaludo);
        // Construir mensaje a mostrar
        txtSaludo.setText("Hola "+bundle.getString("NOMBRE"));

    }
}