package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_cadastrar = (Button) findViewById(R.id.btn_cadastro);
        TextView txt_nome = (TextView) findViewById(R.id.TXTV_nome);
        EditText edt_nome = (EditText) findViewById(R.id.edt_nome);

        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_nome.setText(edt_nome.getText());
            }
        });
    }
}