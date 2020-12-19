package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class welcome extends AppCompatActivity implements View.OnClickListener {
   private TextView tvHello,tvName,aciklama;
   private Button motivasyonBtn,alintiBtn,dusunurlerBtn,sarkilarBtn,burclarBtn;
   private String strName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        tvName =(TextView)findViewById(R.id.tvName);
        Bundle bundle= getIntent().getExtras();
        strName = bundle.getString("NAME");
        tvName.setText(strName);

        motivasyonBtn=(Button) findViewById(R.id.motivasyonBtn);
        motivasyonBtn.setOnClickListener(this);

        alintiBtn=(Button) findViewById(R.id.alintiBtn);
        alintiBtn.setOnClickListener(this::onClickSecond);

        dusunurlerBtn=(Button) findViewById(R.id.dusunurlerBtn);
        dusunurlerBtn.setOnClickListener(this::onClickThird);

        sarkilarBtn=(Button) findViewById(R.id.sarkilarBtn);
        sarkilarBtn.setOnClickListener(this::onClickFourth);

        burclarBtn=(Button) findViewById(R.id.burclarBtn);
        burclarBtn.setOnClickListener(this::onClickFifth);
    }

    @Override
    public void onClick(View v) {
    goToMotivasyon();
    }

    private void goToMotivasyon() {
        Intent intent = new Intent(this, motivasyon.class);
        startActivity(intent);
    }

    private void onClickSecond(View view) {
    goToAlinti();
    }

    private void goToAlinti() {
        Intent intent = new Intent(this, alinti.class);
        startActivity(intent);
    }

    private void onClickThird(View view) {
        goToDusunurler();
    }

    private void goToDusunurler() {
        Intent intent = new Intent(this, dusunurler.class);
        startActivity(intent);
    }

    private void onClickFourth(View view) {
        goToSarkilar();
    }

    private void goToSarkilar() {
        Intent intent = new Intent(this, sarkilar.class);
        startActivity(intent);
    }

    private void onClickFifth(View view) {
        goToBurclar();
    }

    private void goToBurclar() {
        Intent intent = new Intent(this, burclar.class);
        startActivity(intent);
    }


}