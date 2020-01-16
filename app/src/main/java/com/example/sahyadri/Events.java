package com.example.sahyadri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Events extends AppCompatActivity {

    private Button iit;
    private Button nit;
    private Button pvt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        iit=(Button)findViewById(R.id.iit);
        nit=(Button)findViewById(R.id.nit);
        pvt=(Button)findViewById(R.id.pvt);

        iit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt1=new Intent(Events.this,IIT.class);
                startActivity(bt1);
            }
        });

        nit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  bt2=new Intent(Events.this,NIT.class);
                startActivity(bt2);
            }
        });

        pvt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bt3=new Intent(Events.this,PVT.class);
                startActivity(bt3);
            }
        });

    }

    public void onBackPressed(){
        super.onBackPressed();
        overridePendingTransition(R.anim.pull_in_right, R.anim.push_out_left);
    }


}
