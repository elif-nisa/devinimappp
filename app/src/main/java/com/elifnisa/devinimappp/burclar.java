package com.elifnisa.devinimappp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class burclar extends AppCompatActivity  {
    private TextView baslik,aciklamaa;
    private static final String TAG = "burclar";
    private ImageButton ariesBtn,aquariusBtn,cancerBtn,capricornBtn,geminiBtn,leoBtn,libraBtn,piscesBtn,sagittariusBtn,scorpioBtn,taurusBtn,virgoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burclar);
        baslik=(TextView) findViewById(R.id.baslik);
        aciklamaa=(TextView) findViewById(R.id.aciklamaa);

        ariesBtn=(ImageButton) findViewById(R.id.ariesBtn);
        ariesBtn.setOnClickListener(this::onClickAries);

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

    private void onClickAries(View view) {
         /*FirebaseMessaging.getInstance().subscribeToTopic("aries" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                });*/
    }

    private void onClickVirgo(View view) {
        /*FirebaseMessaging.getInstance().subscribeToTopic("virgo" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                });*/
    }

    private void onClickTaurus(View view) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("taurus" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                });*/
    }

    private void onClickScorpio(View view) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("scorpio" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                });*/
    }

    private void onClickSagittarius(View view) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("sagittarius" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                });*/
    }

    private void onClickPisces(View view) {
     /*   FirebaseMessaging.getInstance().subscribeToTopic("pisces" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                }); */
    }

    private void onClickLibra(View view) {
      /*  FirebaseMessaging.getInstance().subscribeToTopic("libra" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                }); */
    }

    private void onClickLeo(View view) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("leo" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                }); */
    }

    private void onClickGemini(View view) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("gemini" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                }); */
    }

    private void onClickCapricorn(View view) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("capricorn" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                }); */
    }

    private void onClickCancer(View view) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("cancer" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                }); */
    }

    private void onClickAquarius(View view) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("aquarius" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(burclar.this, msg, Toast.LENGTH_SHORT).show();
                }); */
    }
}