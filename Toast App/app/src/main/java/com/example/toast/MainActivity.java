package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText num1,num2;
    Button add,sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.tf1);
        num2=findViewById(R.id.tf2);
        add=findViewById(R.id.b1);
        sub=findViewById(R.id.b2);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=Integer.parseInt(num1.getText().toString());
                int j=Integer.parseInt(num2.getText().toString());
                int k=i-j;
                Toast.makeText(MainActivity.this, "DIFFERENCE : "+k, Toast.LENGTH_SHORT).show();

            }
        });

    }

    public void sum(View view){

        int i=Integer.parseInt(num1.getText().toString());
        int j=Integer.parseInt(num2.getText().toString());
        int k=i+j;
        Toast.makeText(this, "SUM : "+k, Toast.LENGTH_SHORT).show();
    }
}