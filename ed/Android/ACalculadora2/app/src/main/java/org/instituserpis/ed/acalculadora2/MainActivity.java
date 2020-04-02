package org.instituserpis.ed.acalculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_resultado);
        rb1 = (RadioButton) findViewById(R.id.rB_sumar);
        rb2 = (RadioButton) findViewById(R.id.rB_restar);
        rb3 = (RadioButton) findViewById(R.id.rB_multiplicacion);
        rb4 = (RadioButton) findViewById(R.id.rB_division);

    }

    public void  Calcular (View view) {
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        if (rb1.isChecked() == true) {
            int suma = num1 + num2;
            tv1.setText(String.valueOf(suma));
        } else if (rb2.isChecked() == true) {
            int resta = num1 - num2;
            tv1.setText(String.valueOf(resta));
        } else if (rb3.isChecked() == true) {
            int multi = num1 * num2;
            tv1.setText(String.valueOf(multi));
        } else if (rb4.isChecked() == true) {
            if (num2 != 0){
                int division = num1 / num2;
                tv1.setText(String.valueOf(division));
            } else {
                Toast.makeText(this,"No se puede dividir entre 0",Toast.LENGTH_LONG).show();
            }
        } else {
            tv1.setText("Selecciona un opción");
        }
    }
}
