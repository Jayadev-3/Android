package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton op1,op2,op3,op4;
    RadioGroup g1,g2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        op1=findViewById(R.id.rb1);
        op2=findViewById(R.id.rb2);
        op3=findViewById(R.id.rb3);
        op4=findViewById(R.id.rb4);
        g1=findViewById(R.id.rg1);
        g2=findViewById(R.id.rg2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(op1.isChecked())
                    Toast.makeText(MainActivity.this, "You've selected "+op1.getText().toString(), Toast.LENGTH_SHORT).show();
                else if(op2.isChecked())
                    Toast.makeText(MainActivity.this, "You've selected "+op2.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=g2.getCheckedRadioButtonId();
                RadioButton rb=findViewById(i);
                Toast.makeText(MainActivity.this, "You've selected "+rb.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}