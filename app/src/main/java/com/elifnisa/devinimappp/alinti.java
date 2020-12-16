package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class alinti extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button alintiSecBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alinti);
        baslik=(TextView) findViewById(R.id.baslik);
        aciklamaa=(TextView) findViewById(R.id.aciklamaa);
        alintiSecBtn=(Button) findViewById(R.id.alintiSecBtn);
        alintiSecBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}