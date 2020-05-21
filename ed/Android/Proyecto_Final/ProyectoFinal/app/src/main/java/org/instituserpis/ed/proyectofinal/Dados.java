package org.instituserpis.ed.proyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Dados extends AppCompatActivity {
    private TextView tv1, tv2, tv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);

        tv1 = (TextView) findViewById(R.id.txt_numero);
        tv1.setText(String.valueOf(10));
        tv2 = (TextView) findViewById(R.id.txt_dado);
        tv3 = (TextView) findViewById(R.id.txt_dado2);
    }

    public void Return(View view) {
        Intent Empezar = new Intent(this, SeleccionJuego.class);
        startActivity(Empezar);
    }

    public void Lanzar(View view){
        Random random = new Random();
        int numero1 = random.nextInt(6) +1;
        int numero2 = random.nextInt(6)+1;
        String num1 = String.valueOf(numero1);
        String num2 = String.valueOf(numero2);
        tv2.setText(num1);
        tv3.setText(num2);
        Puntuacion(view, numero1, numero2);

    }

    public void Puntuacion(View view, int numero1, int numero2){
        if (numero1==numero2){
            int puntuacion = Integer.parseInt(tv1.getText().toString());
            puntuacion += 5;
            tv1.setText(String.valueOf(puntuacion));
        } else {
            int puntuacion = Integer.parseInt(tv1.getText().toString());
            if (puntuacion != 0) {
                puntuacion -= 1;
                tv1.setText(String.valueOf(puntuacion));
            }
            if (puntuacion==0){
                Toast.makeText(this,"GAME OVER", Toast.LENGTH_LONG).show();
                tv1.setText(String.valueOf(10));
            }
        }
    }
}
