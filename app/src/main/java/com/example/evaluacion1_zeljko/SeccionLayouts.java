package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeccionLayouts extends AppCompatActivity {

    private Button btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_layouts);

        btn5 = (Button) findViewById(R.id.btn5);
        regresar();

    }

    public void regresar(){
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regr = new Intent(SeccionLayouts.this, MainActivity.class);
                startActivity(regr);
            }
        });
    }
}