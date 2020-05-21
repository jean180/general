package org.instituserpis.ed.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Play(View view) {
        Toast.makeText(this,"Entrando...", Toast.LENGTH_LONG).show();
        Intent Empezar = new Intent(this, SeleccionJuego.class);
        startActivity(Empezar);
    }
}
