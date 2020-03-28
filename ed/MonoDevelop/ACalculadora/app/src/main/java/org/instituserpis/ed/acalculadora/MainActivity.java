package org.instituserpis.ed.acalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1,et2;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txt_num1);
        et2 = (EditText) findViewById(R.id.txt_num2);
        tv1 = (TextView) findViewById(R.id.txt_Resultado);
    }

    public void Sumar(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        int suma = num1 + num2;

        tv1.setText(String.valueOf(suma));
    }

    public void Restar(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        int resta = num1 - num2;

        tv1.setText(String.valueOf(resta));
    }

    public void Multi(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        int multi = num1 * num2;

        tv1.setText(String.valueOf(multi));
    }

    public void Division(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        int division;

        if (num2!=0){
            division = num1/num2;
            tv1.setText(String.valueOf(division));
        } else {
            tv1.setText("ERROR - Num2 no puede ser 0");
        }

    }
}
