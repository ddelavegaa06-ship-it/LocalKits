package com.example.localkits;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Kitsmenu extends AppCompatActivity {

    private Button btnComidaCorrida, btnComidaRapida, btnMexicana, btnExtranjera, btnCafes, btnOtros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitsmenu);

        btnComidaCorrida = findViewById(R.id.btnComidaCorrida);
        btnComidaRapida = findViewById(R.id.btnComidaRapida);
        btnMexicana = findViewById(R.id.btnMexicana);
        btnExtranjera = findViewById(R.id.btnExtranjera);
        btnCafes = findViewById(R.id.btnCafes);
        btnOtros = findViewById(R.id.btnOtros);
    }
}