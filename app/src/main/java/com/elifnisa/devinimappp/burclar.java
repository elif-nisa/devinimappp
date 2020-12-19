package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class burclar extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private ImageButton ariesBtn,aquariusBtn,cancerBtn,capricornBtn,geminiBtn,leoBtn,libraBtn,piscesBtn,sagittariusBtn,scorpioBtn,taurusBtn,virgoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burclar);
        baslik=(TextView) findViewById(R.id.baslik);
        aciklamaa=(TextView) findViewById(R.id.aciklamaa);

        ariesBtn=(ImageButton) findViewById(R.id.ariesBtn);
        ariesBtn.setOnClickListener(this);

        aquariusBtn=(ImageButton) findViewById(R.id.aquariusBtn);
        aquariusBtn.setOnClickListener(this::onClickAquarius);

        cancerBtn=(ImageButton) findViewById(R.id.cancerBtn);
        cancerBtn.setOnClickListener(this::onClickCancer);

        capricornBtn=(ImageButton) findViewById(R.id.capricornBtn);
        capricornBtn.setOnClickListener(this::onClickCapricorn);

        geminiBtn=(ImageButton) findViewById(R.id.geminiBtn);
        geminiBtn.setOnClickListener(this::onClickGemini);

        leoBtn=(ImageButton) findViewById(R.id.leoBtn);
        leoBtn.setOnClickListener(this::onClickLeo);

        libraBtn=(ImageButton) findViewById(R.id.libraBtn);
        libraBtn.setOnClickListener(this::onClickLibra);

        piscesBtn=(ImageButton) findViewById(R.id.piscesBtn);
        piscesBtn.setOnClickListener(this::onClickPisces);

        sagittariusBtn=(ImageButton) findViewById(R.id.sagittariusBtn);
        sagittariusBtn.setOnClickListener(this::onClickSagittarius);

        scorpioBtn=(ImageButton) findViewById(R.id.scorpioBtn);
        scorpioBtn.setOnClickListener(this::onClickScorpio);

        taurusBtn=(ImageButton) findViewById(R.id.taurusBtn);
        taurusBtn.setOnClickListener(this::onClickTaurus);

        virgoBtn=(ImageButton) findViewById(R.id.virgoBtn);
        virgoBtn.setOnClickListener(this::onClickVirgo);
    }

    private void onClickVirgo(View view) {

    }

    private void onClickTaurus(View view) {

    }

    private void onClickScorpio(View view) {

    }

    private void onClickSagittarius(View view) {

    }

    private void onClickPisces(View view) {

    }

    private void onClickLibra(View view) {

    }

    private void onClickLeo(View view) {

    }

    private void onClickGemini(View view) {

    }

    private void onClickCapricorn(View view) {

    }

    private void onClickCancer(View view) {

    }

    private void onClickAquarius(View view) {

    }

    @Override
    public void onClick(View v) {

    }
}