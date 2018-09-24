package com.example.root.heperdido;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Movimiento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movimiento);

        final Button ok = (Button) findViewById(R.id.ok);
        ok.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText nombre = (EditText) findViewById(R.id.respuesta);
                        Intent intent = new Intent(Movimiento.this, Respuesta.class);
                        //Crear información a pasar
                        Bundle b = new Bundle();
                        if (nombre.getText().toString().equals("El futuro está en tus manos") ||
                                nombre.getText().toString().equals("el futuro está en tus manos") ||
                                nombre.getText().toString().equals("El futuro esta en tus manos") ||
                                nombre.getText().toString().equals("el futuro esta en tus manos") ||
                                nombre.getText().toString().equals("EL FUTURO ESTÁ EN TUS MANOS") ||
                                nombre.getText().toString().equals("EL FUTURO ESTA EN TUS MANOS")) {
                            b.putString("respuesta", "MOVIMIENTO NARANJA, MOVIMIENTO CIUDADANO ");
                        }
                        else b.putString("respuesta", "Eso no es...");

                        intent.putExtras(b);
                        startActivity(intent);
                    }
                }

        );
    }
}
