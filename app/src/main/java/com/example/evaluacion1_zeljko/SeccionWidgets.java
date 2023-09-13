package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class SeccionWidgets extends AppCompatActivity {

    private Button btn6, btn13;
    private CheckBox cb1, cb2, cb3;
    private RadioButton rb1, rb2;
    private ProgressBar pb1;
    private RatingBar rbar1;
    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_widgets);

        btn6 = (Button) findViewById(R.id.btn6);
        btn13 = (Button) findViewById(R.id.btn13);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        pb1 = (ProgressBar) findViewById(R.id.pb1);
        rbar1 = (RatingBar) findViewById(R.id.rbar1);
        regresar();
        prog();
    }

    public void regresar(){
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regr = new Intent(SeccionWidgets.this, MainActivity.class);
                startActivity(regr);
            }
        });
    }
    public void comprobarCbox(View v) {
        String comprobarCB1 = "";
        String comprobarCB2 = "";
        String comprobarCB3 = "";
        String etiqueta = "";

        if (cb1.isChecked() == true)
            comprobarCB1 = cb1.getText().toString();
        if (cb2.isChecked() == true)
            comprobarCB2 = cb2.getText().toString();
        if (cb3.isChecked() == true)
            comprobarCB3 = cb3.getText().toString();
        if (comprobarCB1 == "" && comprobarCB2 == "" && comprobarCB3 == "")
            Toast.makeText(SeccionWidgets.this, "No has seleccionado ninguna opción!", Toast.LENGTH_SHORT).show();
        else {
            etiqueta = (comprobarCB1 + " " + comprobarCB2 + " " + comprobarCB3);
            Toast.makeText(SeccionWidgets.this, "Las opciones seleccionadas son: " + etiqueta, Toast.LENGTH_SHORT).show();
        }
    }

    public void comprobarRadioButton(View v){
        String tipo = "";
        if (rb1.isChecked()){
            tipo = rb1.getText().toString();
        }else{
            tipo = rb2.getText().toString();
        }
        Toast.makeText(SeccionWidgets.this, "El RadioButton seleccionado es: " + tipo, Toast.LENGTH_SHORT).show();
    }

    public void prog(){
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Timer t = new Timer();
                TimerTask tt = new TimerTask() {
                    @Override
                    public void run() {
                        contador++;
                        pb1.setProgress(contador);
                        if (contador == 100)
                            t.cancel();
                    }
                };
                t.schedule(tt,0,100);
            }
        });
    }

    public void cuantasEstrellas(View v){
        Toast.makeText(SeccionWidgets.this, "Usted ha otorgado: " + rbar1.getRating() + " estrellas!", Toast.LENGTH_SHORT).show();
    }


}