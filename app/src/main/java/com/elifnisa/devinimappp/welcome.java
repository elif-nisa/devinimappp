package com.elifnisa.devinimappp;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.huawei.agconnect.auth.AGConnectAuth;

public class welcome extends AppCompatActivity implements View.OnClickListener {
   private TextView tvHello,tvName,aciklama;
   private Button motivasyonBtn,alintiBtn,dusunurlerBtn,sarkilarBtn,burclarBtn,cikisBtn,ego_btn;
   private String strName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

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

        ego_btn=(Button)  findViewById(R.id.ego_btn);
        ego_btn.setOnClickListener(this::onClickSixth);

        cikisBtn=(Button) findViewById(R.id.cikisBtn);
        cikisBtn.setOnClickListener(this::onClickcikisBtn);
    }

    private void onClickSixth(View view) {
        goToEgo();
    }

    private void goToEgo() {
        Intent intent = new Intent(this, ego.class);
        startActivity(intent);
    }

    private void onClickcikisBtn(View view) {
        AGConnectAuth.getInstance().signOut();
        startActivity(new Intent(welcome.this, MainActivity.class));
        finish();
    }

    @Override
    public void onClick(View v) {
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