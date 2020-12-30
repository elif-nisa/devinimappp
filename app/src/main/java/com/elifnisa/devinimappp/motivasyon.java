package com.elifnisa.devinimappp;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import com.google.firebase.messaging.FirebaseMessaging;

import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.push.HmsMessaging;

import java.io.IOException;
import java.security.Policy;
import java.util.Arrays;
import java.util.List;

import static com.huawei.hms.aaid.constant.AaidIdConstant.getToken;
import static java.lang.System.err;

public class motivasyon<options> extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button motivasyonSecBtn;
    private static final String TAG = "motivasyon";

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
        FirebaseMessaging.getInstance().subscribeToTopic("motivasyon" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(motivasyon.this, msg, Toast.LENGTH_SHORT).show();
                });
    }
}