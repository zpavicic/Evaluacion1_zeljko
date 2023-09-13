package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeccionContainers extends AppCompatActivity {

    private Button btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_containers);

        btn7 = (Button) findViewById(R.id.btn7);
        regresar();
    }

    public void regresar(){
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regr = new Intent(SeccionContainers.this, MainActivity.class);
                startActivity(regr);
            }
        });
    }
}