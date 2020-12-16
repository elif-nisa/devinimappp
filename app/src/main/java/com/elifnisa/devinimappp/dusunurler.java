package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class dusunurler extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button dusunurlerSecBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dusunurler);
        baslik=(TextView) findViewById(R.id.baslik);
        aciklamaa=(TextView) findViewById(R.id.aciklamaa);
        dusunurlerSecBtn=(Button) findViewById(R.id.dusunurlerSecBtn);
        dusunurlerSecBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}