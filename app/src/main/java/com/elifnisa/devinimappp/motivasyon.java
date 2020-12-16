package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class motivasyon extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button motivasyonSecBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivasyon);
        baslik=(TextView) findViewById(R.id.baslik);
        aciklamaa=(TextView) findViewById(R.id.aciklamaa);
        motivasyonSecBtn=(Button) findViewById(R.id.motivasyonSecBtn);
        motivasyonSecBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}