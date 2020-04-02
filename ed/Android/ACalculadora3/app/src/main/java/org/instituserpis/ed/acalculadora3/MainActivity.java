package org.instituserpis.ed.acalculadora3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv1;
    private CheckBox cb1, cb2, cb3, cb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
        cb1 = (CheckBox) findViewById(R.id.CB_Suma);
        cb2 = (CheckBox) findViewById(R.id.CB_Resta);
        cb3 = (CheckBox) findViewById(R.id.CB_Multiplicacion);
        cb4 = (CheckBox) findViewById(R.id.CB_Division);
    }

    public void Calcular (View view) {
    int num1 = Integer.parseInt(et1.getText().toString());
    int num2 = Integer.parseInt(et2.getText().toString());
    String resultado = "";
    if (cb1.isChecked() == true) {
        int suma = num1 + num2;
        resultado = "La suma es: " + suma + "\n";
    }
    if (cb2.isChecked() == true) {
        int resta = num1 - num2;
        resultado = resultado + "La resta es: " + resta + "\n";
    }
    if (cb3.isChecked() == true){
        int multi = num1 * num2;
        resultado = resultado + "La multiplicación es: " + multi + "\n";
    }
    if (cb4.isChecked() == true) {
        if (num2 != 0){
            int division = num1 / num2;
            resultado = resultado+ "La división es: " + division;
        } else {
            Toast.makeText(this,"No se puede dividir entre 0",Toast.LENGTH_LONG).show();
        }
        }
    tv1.setText(resultado);
    }

}
