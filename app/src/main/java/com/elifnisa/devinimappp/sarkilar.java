package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sarkilar extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button sarkilarSecBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sarkilar);
        baslik=(TextView) findViewById(R.id.baslik);
        aciklamaa=(TextView) findViewById(R.id.aciklamaa);
        sarkilarSecBtn=(Button) findViewById(R.id.sarkilarSecBtn);
        sarkilarSecBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}