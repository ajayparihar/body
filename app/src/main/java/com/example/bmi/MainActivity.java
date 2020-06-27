package com.example.bmi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText w = findViewById(R.id.t1);
                EditText h = findViewById(R.id.t2);
                double hb = Double.parseDouble(h.getText().toString());
                double bmi = Double.parseDouble(w.getText().toString()) / (hb * hb);

                if (bmi >= 25) {
                    Toast.makeText(MainActivity.this, "YOU ARE OVERWEIGHT !!!", Toast.LENGTH_SHORT).show();
                } else if (bmi >= 18.5 && bmi <= 24.9) {
                    Toast.makeText(MainActivity.this, "YOU ARE PERFECTLY FIT !!!", Toast.LENGTH_SHORT).show();
                } else if (bmi < 18.5)
                    Toast.makeText(MainActivity.this, "YOU ARE UNDERWEIGHT", Toast.LENGTH_SHORT).show();
            }
        });
    }
}