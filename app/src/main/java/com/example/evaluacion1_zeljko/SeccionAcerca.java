package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeccionAcerca extends AppCompatActivity {

    private Button btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_acerca);

        btn8 = (Button) findViewById(R.id.btn8);
        regresar();
    }

    public void regresar(){
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regr = new Intent(SeccionAcerca.this, MainActivity.class);
                startActivity(regr);
            }
        });
    }


}