package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.nio.Buffer;

public class MainActivity extends AppCompatActivity {
    int a, b;
    boolean plusclick,equal,Clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.screen);
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button plus = findViewById(R.id.plus);
        Button equal = findViewById(R.id.equal);
        Button clear =findViewById(R.id.Clear);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "2");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "+");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(textView.getText() + "=");
            }
        });
       clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    a = Integer.parseInt(textView.getText().toString());
                    textView.setText("");
                } catch (NumberFormatException exception) {
                    exception.printStackTrace();
                }
                if (plusclick) {
                    int sum = a + b;
                    textView.setText("" + sum);
                    plusclick = false;
                }
            }
        });
    }
}