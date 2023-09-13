package com.example.evaluacion1_zeljko;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class SeccionContainers extends AppCompatActivity {

    private Button btn7;
    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion_containers);

        btn7 = (Button) findViewById(R.id.btn7);
        regresar();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        itemAdapter = new ItemAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        itemAdapter.setData(getData());
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
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

    private List<Item> getData() {
        List<Item> List = new ArrayList<>();
        List.add(new Item(R.drawable.facebook, "Facebook"));
        List.add(new Item(R.drawable.instagram, "Instagram"));
        List.add(new Item(R.drawable.messenger, "Messenger"));
        List.add(new Item(R.drawable.reddit, "Reddit"));
        List.add(new Item(R.drawable.tumblr, "Tumblr"));
        List.add(new Item(R.drawable.twitter, "Twitter"));
        List.add(new Item(R.drawable.whatsapp, "WhatsApp"));
        List.add(new Item(R.drawable.youtube, "Youtube"));
        return List;
    }


}