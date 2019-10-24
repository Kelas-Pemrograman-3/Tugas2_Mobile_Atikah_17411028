package com.example.prj1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNpm;
    TextView txtnama;
    EditText edtNpm;
    EditText edtnama;
    Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNpm=(TextView)findViewById(R.id.txtNpm);
        txtnama=(TextView)findViewById(R.id.txtnama);
        edtNpm=(EditText)findViewById(R.id.edtNpm);
        edtnama=(EditText)findViewById(R.id.edtnama);
        btnsubmit=(Button)findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick (View v){
                String strNpm = edtNpm.getText().toString();
                String strNama = edtnama.getText().toString();

                txtNpm.setText(strNpm);
                txtnama.setText(strNama);
            }
        });


    }
}
