package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=(EditText)findViewById(R.id.editTextTextPersonName2);
        e2=(EditText)findViewById(R.id.editTextTextPersonName3);
        t1=(TextView)findViewById(R.id.textView);
        b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();

                Integer i1=Integer.parseInt(s1);
                Integer i2=Integer.parseInt(s2);

                Integer i3=i1+i2;
                String s3=Integer.toString(i3);
                t1.setText(s3);
                Toast.makeText(MainActivity.this, "The Answer is"+s3, Toast.LENGTH_SHORT).show();
            }
        });
    }
}