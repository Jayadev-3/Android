package com.example.dialogbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button) findViewById(R.id.button);
        Button b2=(Button) findViewById(R.id.b2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);
                builder.setTitle(R.string.alerttitle);

                builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Toast.makeText(getApplicationContext(),"you choose Yes action for alertbox",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                        Toast.makeText(getApplicationContext(),"you choose No action for alertbox",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setMessage(R.string.message);
                AlertDialog dig=builder.create();
                dig.show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder custom=new AlertDialog.Builder(MainActivity.this);
                final View vw= LayoutInflater.from(MainActivity.this).inflate(R.layout.custom_alertdialog,null);
                custom.setView(vw);
                custom.setMessage("Custom ALertDialog");
                custom.setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        EditText editText=vw.findViewById(R.id.editText);
                        String name=editText.getText().toString();
                        Toast.makeText(getApplicationContext(), "You Entered "+name, Toast.LENGTH_SHORT).show();
                    }
                });
                custom.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                });
                AlertDialog ad=custom.create();
                ad.show();
            }
        });

    }
}