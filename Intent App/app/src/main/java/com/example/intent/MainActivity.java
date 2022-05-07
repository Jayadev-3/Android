package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText tf1;
    Button bt1;
    CheckBox c1;
    public static  final String msg="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tf1=findViewById(R.id.tf1);
        bt1=findViewById(R.id.b1);
        c1=findViewById(R.id.cb1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c1.isChecked()){
                    Intent i1=new Intent(MainActivity.this,MainActivity2.class);
                    i1.putExtra(msg,tf1.getText().toString());
                    startActivity(i1);
                }
            }
        });

    }
}