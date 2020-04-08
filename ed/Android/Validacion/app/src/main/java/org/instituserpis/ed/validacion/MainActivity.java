package org.instituserpis.ed.validacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_usuario);
        et2 = (EditText) findViewById(R.id.txt_password);
    }

    public void Validar (View view){
        String nombre = et1.getText().toString();
        String password = et2.getText().toString();

        if (nombre.length()==0){
            Toast.makeText(this,"DEBES INTRODUCIR UN NOMBRE",Toast.LENGTH_LONG).show();
        }
        if (password.length()==0){
            Toast.makeText(this,"DEBES INTRODUCIR UNA CONTRASEÑA",Toast.LENGTH_LONG).show();
        }
        if (nombre.length()!=0 && password.length()!=0){
            Toast.makeText(this,"VALIDANDO...",Toast.LENGTH_LONG).show();
            Intent validar = new Intent(this, SegundoActivity.class);
            validar.putExtra("Nombre",et1.getText().toString());
            startActivity(validar);
        }
    }
}
