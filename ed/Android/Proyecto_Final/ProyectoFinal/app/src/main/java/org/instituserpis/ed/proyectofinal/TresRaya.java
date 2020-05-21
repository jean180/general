package org.instituserpis.ed.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TresRaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres_raya);
    }

    public void Return(View view) {
        Intent Empezar = new Intent(this, SeleccionJuego.class);
        startActivity(Empezar);
    }
}
