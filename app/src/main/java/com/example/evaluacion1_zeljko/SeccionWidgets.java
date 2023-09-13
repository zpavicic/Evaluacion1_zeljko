package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeccionWidgets extends AppCompatActivity {

    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_widgets);

        btn6 = (Button) findViewById(R.id.btn6);
        regresar();
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
}