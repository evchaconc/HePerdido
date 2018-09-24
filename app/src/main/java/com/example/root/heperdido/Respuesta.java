package com.example.root.heperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Respuesta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta);

        TextView respuesta = (TextView) findViewById(R.id.respuesta);

        Bundle b = this.getIntent().getExtras();
        respuesta.setText(b.getString("respuesta"));

       final Button atras = (Button) findViewById(R.id.atras);
        atras.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Respuesta.this, MainActivity.class);
                        startActivity(intent);
                    }
                }

        );

        final Button boton1 = (Button) findViewById(R.id.boton1);
        boton1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(Respuesta.this, Perder.class);
                        startActivity(intent);
                    }
                }

        );
    }
}
