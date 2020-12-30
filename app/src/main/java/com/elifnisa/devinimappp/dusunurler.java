package com.elifnisa.devinimappp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;

public class dusunurler extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button dusunurlerSecBtn;
    private static final String TAG = "dusunurler";

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
        FirebaseMessaging.getInstance().subscribeToTopic("dusunurler" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(dusunurler.this, msg, Toast.LENGTH_SHORT).show();
                });
    }
}