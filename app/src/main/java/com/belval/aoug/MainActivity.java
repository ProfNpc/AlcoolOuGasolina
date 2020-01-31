package com.belval.aoug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editEtanol;
    private EditText editGasolina;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editEtanol = findViewById(R.id.editEtanol);
        editGasolina = findViewById(R.id.editGasolina);
        txtResultado = findViewById(R.id.txtResultado);
        txtResultado.setText("");

        Button btnCalc = findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double precoLitroEtanol = Double.parseDouble(editEtanol.getText().toString());
                Double precoLitroGasolina = Double.parseDouble(editGasolina.getText().toString());
                if (precoLitroEtanol != null && precoLitroGasolina != null) {
                    if (precoLitroEtanol < precoLitroGasolina * 0.7) {
                        txtResultado.setText("Abasteça com álcool");
                    } else {
                        txtResultado.setText("Abasteça com gasolina");
                    }
                }
            }
        });
    }

    private Double getPreco(EditText edit) {
        String valStr = edit.getText().toString();
        Double val = null;
        try {
            val = Double.parseDouble(valStr);
        } catch(Exception e) {
        }
        return val;
    }
}
