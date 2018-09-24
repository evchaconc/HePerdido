package com.example.root.heperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Perder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perder);

        final Button atras = (Button) findViewById(R.id.atras);
        atras.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Perder.this, MainActivity.class); //Para relacionar las dos clases entre ella (va a llamar a la segunda pantalla)
                        startActivity(intent);
                    }
                }

        );

        final Button boton2 = (Button) findViewById(R.id.boton2);
        boton2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText nombre = (EditText) findViewById(R.id.respuesta);
                        Intent intent = new Intent(Perder.this, Movimiento.class); //Para relacionar las dos clases entre ella (va a llamar a la segunda pantalla)
                        startActivity(intent);
                    }
                }

        );
    }
}
