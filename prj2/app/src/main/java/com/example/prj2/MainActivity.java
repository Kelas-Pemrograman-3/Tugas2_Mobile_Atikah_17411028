package com.example.prj2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

EditText edtNpm;
EditText edtNama;
Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNpm =(EditText)findViewById(R.id.edtNpm);
        edtNama =(EditText)findViewById(R.id.edtNama);

        btnSend =(Button) findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

String Npm =edtNpm.getText().toString();
String Nama =edtNama.getText().toString();

                Intent lanjut = new Intent(MainActivity.this,Halaman2.class);

                lanjut.putExtra("Npm", Npm);
                lanjut.putExtra("Nama", Nama);

                startActivity(lanjut);
                finish();
            }

        } );

    }

    }