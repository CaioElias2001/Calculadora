package com.minhaempresa.calculadora;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber1;
    EditText editTextNumber2;

    Button adcBtn;
    Button subBtn;
    Button multBtn;
    Button divBtn;

    TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vincularComponentes();
        criarListeners();
    }

    private void vincularComponentes() {
        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);

        adcBtn = findViewById(R.id.adcBtn);
        subBtn = findViewById(R.id.subBtn);
        multBtn = findViewById(R.id.multBtn);
        divBtn = findViewById(R.id.divBtn);

        resultadoTextView = findViewById(R.id.resultadoTextView);
    }

    private void criarListeners() {
        adcBtn.setOnClickListener(evt -> adicionar());
        subBtn.setOnClickListener(evt -> subtrair());
        multBtn.setOnClickListener(evt -> multiplicar());
        divBtn.setOnClickListener(evt -> dividir());
    }

    private void adicionar() {
        String num1String = editTextNumber1.getText().toString();
        String num2String = editTextNumber2.getText().toString();
        if (num1String.isEmpty() || num2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return; }
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        double resultado = num1 + num2;
        resultadoTextView.setText(String.valueOf(resultado));
    }

    private void subtrair() {
        String num1String = editTextNumber1.getText().toString();
        String num2String = editTextNumber2.getText().toString();
        if (num1String.isEmpty() || num2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return; }
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        double resultado = num1 - num2;
        resultadoTextView.setText(String.valueOf(resultado));
    }

    private void multiplicar() {
        String num1String = editTextNumber1.getText().toString();
        String num2String = editTextNumber2.getText().toString();
        if (num1String.isEmpty() || num2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return; }
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        double resultado = num1 * num2;
        resultadoTextView.setText(String.valueOf(resultado));
    }

    private void dividir() {
        String num1String = editTextNumber1.getText().toString();
        String num2String = editTextNumber2.getText().toString();
        if (num1String.isEmpty() || num2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return; }
        double num1 = Double.parseDouble(num1String);
        double num2 = Double.parseDouble(num2String);
        if (num2 == 0) {
            Toast.makeText(this, "Não é possível dividir por 0", Toast.LENGTH_LONG).show();
            return; }
        double resultado = num1 / num2;
        resultadoTextView.setText(String.valueOf(resultado));
    }
}