package com.example.localkits;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Kitsplash extends AppCompatActivity {

    private ProgressBar pgbProgreso;

    private final Handler handler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            pgbProgreso.incrementProgressBy(msg.arg1);
        }
    };

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kitsplash);

        pgbProgreso = findViewById(R.id.pgbProgreso);
        pgbProgreso.setProgress(0);

        Thread timer = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    for (int i = 0; i < 10; i++) {
                        sleep(300);

                        Message msg = handler.obtainMessage();
                        msg.arg1 = 10;
                        handler.sendMessage(msg);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent abreVentanaPrincipal = new Intent(Kitsplash.this, Kitsmenu.class);
                    startActivity(abreVentanaPrincipal);
                    finish();
                }
            }
        };
        timer.start();
    }
}