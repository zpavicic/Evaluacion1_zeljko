package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeccionLayouts extends AppCompatActivity {

    private Button btn5, btn11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_layouts);

        btn5 = (Button) findViewById(R.id.btn5);
        btn11 = (Button) findViewById(R.id.btn11);
        seccionTableLayout();
        home();

    }

    public void seccionTableLayout(){
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sig = new Intent(SeccionLayouts.this, SeccionTableLayout.class);
                startActivity(sig);
            }
        });
    }
    public void home(){
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regresar = new Intent(SeccionLayouts.this, MainActivity.class);
                startActivity(regresar);
            }
        });
    }
}