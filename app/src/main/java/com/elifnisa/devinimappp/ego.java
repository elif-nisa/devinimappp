package com.elifnisa.devinimappp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessaging;

public class ego extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button egoSecBtn;
    private static final String TAG = "ego";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ego);
        baslik=(TextView) findViewById(R.id.baslik);
        aciklamaa=(TextView) findViewById(R.id.aciklamaa);
        egoSecBtn=(Button) findViewById(R.id.egoSecBtn);
        egoSecBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FirebaseMessaging.getInstance().subscribeToTopic("ego" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(ego.this, msg, Toast.LENGTH_SHORT).show();
                });
    }
}