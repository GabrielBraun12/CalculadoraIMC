package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultId;
    private EditText editPeso;
    private EditText editAltura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultId = findViewById(R.id.resultId);
        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
    }


    public void calcularIMC(View view) {
        Double peso = Double.parseDouble(editPeso.getText().toString());
        Double altura = Double.parseDouble(editAltura.getText().toString());

        Double result = peso / (altura * altura);
        if (result < 19){
            resultId.setText("Abaixo do Peso");
        }
        else if (result <=19 && result < 25) {
            resultId.setText("Normal");
        }
        else if (result >= 25 && result < 30) {
            resultId.setText("Sobrepeso");
        }
        else if (result >= 29 && result < 40) {
            resultId.setText("Obeso");
        }
        else if (result > 40) {
            resultId.setText("Obeso Mórbido");
        }
    }

}
