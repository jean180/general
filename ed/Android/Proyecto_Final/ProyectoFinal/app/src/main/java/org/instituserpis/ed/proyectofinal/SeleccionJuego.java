package org.instituserpis.ed.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SeleccionJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_juego);
    }

    public void Play_Dados(View view) {
        Intent Empezar = new Intent(this, Dados.class);
        startActivity(Empezar);
    }

    public void Play_Espada(View view) {
        Intent Empezar = new Intent(this, Espada.class);
        startActivity(Empezar);
    }

}
