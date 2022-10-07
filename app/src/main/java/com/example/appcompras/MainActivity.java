package com.example.appcompras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    CheckBox cbA, cbL, cbC, cbF, cbJ;
    Button btTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbA = (CheckBox) findViewById(R.id.cbA);
        cbL = (CheckBox) findViewById(R.id.cbL);
        cbC = (CheckBox) findViewById(R.id.cbC);
        cbF = (CheckBox) findViewById(R.id.cbF);
        cbJ = (CheckBox) findViewById(R.id.cbJ);
        btTotal = (Button) findViewById(R.id.btTotal);

        btTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                double total = 0;
                if (cbA.isChecked()){total += 2.69;}
                if (cbL.isChecked()){total += 5.00;}
                if (cbC.isChecked()){total += 9.70;}
                if (cbF.isChecked()){total += 2.30;}

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle("Aviso");
        dialogo.setMessage("Valor total da compra :"+ String.valueOf(total));
        dialogo.setNeutralButton("OK",null);
        dialogo.show();

            }
        });
    }
}