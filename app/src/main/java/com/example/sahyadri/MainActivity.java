package com.example.sahyadri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button workshop;
    private Button seminar;
    private Button profile;
    private Button event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        workshop=(Button)findViewById(R.id.workshop);
        seminar=(Button)findViewById(R.id.seminar);
        profile=(Button)findViewById(R.id.profile);
        event=(Button)findViewById(R.id.event);

        workshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent work=new Intent(MainActivity.this,Workshop.class);
                startActivity(work);
            }
        });

        seminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sem=new Intent(MainActivity.this,Seminar.class);
                startActivity(sem);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pro=new Intent(MainActivity.this,Profile.class);
                startActivity(pro);
            }
        });

        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent eve=new Intent(MainActivity.this,Events.class);
                startActivity(eve);
                overridePendingTransition(R.anim.pull_in_left, R.anim.push_out_right);
            }
        });
    }
}
