package com.example.prj2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Halaman2 extends AppCompatActivity {

    TextView Vdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        Vdata = (TextView) findViewById(R.id.viewNpm);

        Intent data = getIntent();
        String Npm = data.getStringExtra("Npm");
        String Nama = data.getStringExtra("Nama");

        Vdata.setText(Npm +"\n" + Nama);


}
    @Override
    public void onBackPressed(){
        Intent back =new Intent(Halaman2.this,MainActivity.class);
    startActivity(back);
    finish();
    }


}
