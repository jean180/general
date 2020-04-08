package org.instituserpis.ed.validacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {
    private TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        tv2 = (TextView)findViewById(R.id.txt_Bienvenida);
        String nombre = getIntent().getStringExtra("Nombre");
        tv2.setText("Bienvenid@ " + nombre);
    }

    public void Cerrar(View view){
        Intent cerrar = new Intent(this, MainActivity.class);
        startActivity(cerrar);
    }
}
