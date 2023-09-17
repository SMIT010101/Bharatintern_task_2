package com.example.conobi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText valueEditText;
    TextView ans;
    private Button convertcToFButton;
    private Button convertfToCButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valueEditText = findViewById(R.id.value);
        convertcToFButton = findViewById(R.id.conf);
        convertfToCButton = findViewById(R.id.conc);
        ans = findViewById(R.id.Answer);

        convertcToFButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String que = valueEditText.getText().toString();
                double Quee = Double.parseDouble(que);
              double  resultctof = (Quee *9/5) +32;


                String resultf = String.valueOf(resultctof);
                ans.setText(resultf);
            }
        });

        convertfToCButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String quee = valueEditText.getText().toString();
                double Queee = Double.parseDouble(quee);
                double resultftoc = ((Queee - 32) * 5/9) ;




                String resultff = String.valueOf(resultftoc);
                ans.setText(resultff);

            }
        });

    }


}
