package com.example.holausuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Referencia a los controles de la interfaz
        txtNombre=(EditText)findViewById(R.id.TxtNombre);
        btnAceptar=(Button)findViewById(R.id.BtnAceptar);

        // Implementacion del evento click del boton
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            /** Abrir la actividad y pasarle los datos */
            @Override
            public void onClick(View v) {
                // Creamos el Intent
                /** Un intent es el elemento básico de comunicación entre los distintos componentes Android	que	hemos descrito	anteriormente.(Activity,view,Service,Content Provider,Broadcast Receiver,Widget)
                 *  Se	pueden	entender	como	los	mensajes o peticiones que son enviados	entre los distintos	componentes	de una	aplicación	o entre	 distintas	 aplicaciones.
                 *  Mediante un intent	se	puede	mostrar	una	actividad desde cualquier otra,	iniciar	un	servicio,	enviar un mensaje	broadcast,	iniciar	 otra aplicación,etc.
                 **/
                Intent intent = new Intent(MainActivity.this,SaludosActivity.class);
                // Creamos el Bundle
                /** Para pasar datos en el intent,tenemos que crear un bundle que es +- un map de clave-valor **/
                Bundle bundle=new Bundle();
                bundle.putString("NOMBRE",txtNombre.getText().toString());  //clave NOMBRE, Valor txtNombre.getText().toString()

                // Añadimos el bundle al intent
                intent.putExtras(bundle);
                // iniciar la nueva actividad
                startActivity(intent);




            }
        });



    }
}