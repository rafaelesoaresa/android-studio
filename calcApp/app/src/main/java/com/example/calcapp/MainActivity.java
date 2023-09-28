package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

 double n1,n2,res;

    //Edt
    EditText Edt_numeric = (EditText)findViewById(R.id.Edt_numeric);
    EditText Edt_numeric2 = (EditText)findViewById(R.id.Edt_numeric2);
    //

    //Btn
    Button Btn_mais=(Button) findViewById(R.id.Btn_mais);
    Button Btn_menos=(Button) findViewById(R.id.Btn_menos);
    Button Btn_divisao=(Button) findViewById(R.id.Btn_divisao);
    Button Btn_veses=(Button) findViewById(R.id.Btn_veses);
    //

    //Txt
    TextView TxtV_titulo=(TextView)findViewById(R.id.TxtV_titulo);
    TextView Txt_resultado=(TextView)findViewById(R.id.Txt_resultado);
    TextView Txt_resultado2 =(TextView)findViewById(R.id.Txt_resultado2);
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Btn_mais.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View view) {
                //Double
              //  n1 = Double.parseDouble(Edt_numeric.getText().toString());
                //n2 = Double.parseDouble(Edt_numeric2.getText().toString());
                //res = n1 + n2;

                //Txt_resultado.setText(String.valueOf(res));
          //  }
        //});

    }
    public void mais(View view){

        n1 = Double.parseDouble(Edt_numeric.getText().toString());
        n2 = Double.parseDouble(Edt_numeric2.getText().toString());
        res = n1 + n2;

        Txt_resultado.setText(String.valueOf(res));
    }
    public void menos (View view){

        n1 = Double.parseDouble(Edt_numeric.getText().toString());
        n2 = Double.parseDouble(Edt_numeric2.getText().toString());
        res = n1 - n2;

        Txt_resultado.setText(String.valueOf(res));
    }

    public void divisao (View view){

        n1 = Double.parseDouble(Edt_numeric.getText().toString());
        n2 = Double.parseDouble(Edt_numeric2.getText().toString());
        res = n1 / n2;

        Txt_resultado.setText(String.valueOf(res));
    }

    public void veses (View view){

        n1 = Double.parseDouble(Edt_numeric.getText().toString());
        n2 = Double.parseDouble(Edt_numeric2.getText().toString());
        res = n1 * n2;

        Txt_resultado.setText(String.valueOf(res));
    }
}