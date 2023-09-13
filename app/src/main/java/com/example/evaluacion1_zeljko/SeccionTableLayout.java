package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeccionTableLayout extends AppCompatActivity {

    private Button btn12, btn13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_table_layout);

        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        anterior();
        home();
    }

    public void anterior(){
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ante = new Intent(SeccionTableLayout.this, SeccionLayouts.class);
                startActivity(ante);
            }
        });
    }

    public void home(){
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regr = new Intent(SeccionTableLayout.this, MainActivity.class);
                startActivity(regr);
            }
        });
    }

}