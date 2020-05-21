package org.instituserpis.ed.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Espada extends AppCompatActivity {
    private TextView tv1;
    private int vidaJugador;
    private ImageView corazon1;
    private ImageView corazon2;
    private ImageView corazon3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espada);
        tv1 = (TextView) findViewById(R.id.txt_numvida);
        tv1.setText(String.valueOf(5));
        corazon1 = (ImageView) findViewById(R.id.corazon1);
        corazon2 = (ImageView) findViewById(R.id.corazon2);
        corazon3 = (ImageView) findViewById(R.id.corazon3);
        vidaJugador = 3;
    }

    public void Return(View view) {
        Intent Empezar = new Intent(this, SeleccionJuego.class);
        startActivity(Empezar);
    }

    public void AtacarDerecha(View view){
        Random random = new Random();
        int numero = random.nextInt(2) +1 ;
        if (numero==1){
            int vidamons = Integer.parseInt(tv1.getText().toString());
            vidamons -= 1;
            String vida = String.valueOf(vidamons);
            tv1.setText(vida);
            if (vidamons==0){
                tv1.setText(String.valueOf(5));
                if (vidaJugador!=3){
                    vidaJugador+=1;
                    Toast.makeText(this,"VIDA EXTRA", Toast.LENGTH_LONG).show();
                }
            }
        } else {
            vidaJugador -= 1;
        }
        Comprobarvida(view);
    }

    public void AtacarIzquierda(View view){
        Random random = new Random();
        int numero = random.nextInt(2) +1 ;
        if (numero==1){
            int vidamons = Integer.parseInt(tv1.getText().toString());
            vidamons -= 1;
            String vida = String.valueOf(vidamons);
            tv1.setText(vida);
            if (vidamons==0){
                tv1.setText(String.valueOf(5));
                if (vidaJugador!=3){
                    vidaJugador+=1;
                    Toast.makeText(this,"VIDA EXTRA", Toast.LENGTH_LONG).show();
                }
            }
        } else {
            vidaJugador -= 1;
        }
        Comprobarvida(view);
    }

    public void Comprobarvida(View view){
        switch (vidaJugador){
            case 3:
                corazon1.setVisibility(View.VISIBLE);
                corazon2.setVisibility(View.VISIBLE);
                corazon3.setVisibility(View.VISIBLE);
                break;

            case 2:
                corazon1.setVisibility(View.VISIBLE);
                corazon2.setVisibility(View.VISIBLE);
                corazon3.setVisibility(View.INVISIBLE);
                break;

            case 1:
                corazon1.setVisibility(View.VISIBLE);
                corazon2.setVisibility(View.INVISIBLE);
                corazon3.setVisibility(View.INVISIBLE);
                break;

            case 0:
                Toast.makeText(this,"GAME OVER", Toast.LENGTH_LONG).show();
                vidaJugador = 3;
                tv1.setText(String.valueOf(5));
                corazon1.setVisibility(View.VISIBLE);
                corazon2.setVisibility(View.VISIBLE);
                corazon3.setVisibility(View.VISIBLE);
                break;
        }
    }
}



