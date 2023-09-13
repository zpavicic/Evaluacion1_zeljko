package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // private Button btn1, btn2, btn3, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // btn1 = (Button) findViewById(R.id.btn1);
        // btn2 = (Button) findViewById(R.id.btn2);
        // btn3 = (Button) findViewById(R.id.btn3);
        // btn4 = (Button) findViewById(R.id.btn4);

    }

    public void seccionLayouts(View v){
        Intent sig = new Intent(this, SeccionLayouts.class);
        startActivity(sig);
    }
    public void seccionWidgets(View v){
        Intent sig = new Intent(this, SeccionWidgets.class);
        startActivity(sig);
    }
    public void seccionContainers(View v){
        Intent sig = new Intent(this, SeccionContainers.class);
        startActivity(sig);
    }
    public void seccionAcerca(View v){
        Intent sig = new Intent(this, SeccionAcerca.class);
        startActivity(sig);
    }

}