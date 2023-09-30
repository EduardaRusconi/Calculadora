package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView res;
    private EditText num1;
    private EditText num2;
    private Button btSoma;
    //criando as outras variaveis para os botões
    private Button btSubtrai;
    private Button btDivide;
    private Button btMultiplica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = findViewById(R.id.resultado);
        num1 = findViewById(R.id.editNum1);
        num2 = findViewById(R.id.editNum2);
        btSoma = findViewById(R.id.somaBtn);

        //populando outras variaveis dos botões
        btSubtrai = findViewById(R.id.subBtn);
        btDivide = findViewById(R.id.divisaoBtn);
        btMultiplica = findViewById(R.id.multiplicacaoBtn);

        //métodos para os botões
        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(String.valueOf(num1.getText())); //Muitas Conversões
                int n2 = Integer.parseInt(String.valueOf(num2.getText()));
                int resultSoma = n1 + n2;
                res.setText("Resultado: " + resultSoma);
            }
        });

        btSubtrai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(String.valueOf(num1.getText()));
                int n2 = Integer.parseInt(String.valueOf(num2.getText()));
                int resultSubtracao = n1 - n2;
                res.setText("Resultado: " + resultSubtracao);

            }
        });

        btMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(String.valueOf(num1.getText()));
                int n2 = Integer.parseInt(String.valueOf(num2.getText()));
                int resultMultiplicacao = n1 * n2;
                res.setText("Resultado: " + resultMultiplicacao);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(String.valueOf(num1.getText()));
                int n2 = Integer.parseInt(String.valueOf(num2.getText()));
                int resultDivisao = n1 / n2;
                res.setText("Resultado: " + resultDivisao);
            }
        });
    }
}