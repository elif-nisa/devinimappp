package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.push.HmsMessaging;

import java.security.Policy;

import static com.huawei.hms.aaid.constant.AaidIdConstant.getToken;
import static java.lang.System.err;

public class motivasyon extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button motivasyonSecBtn;
    private static final String TAG = "motivasyon";
    private String motivasyon;

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
        subscribe(motivasyon);

       if (v.getId()==R.id.motivasyonSecBtn) {
           Context context = getApplicationContext();
           CharSequence text = "Motivasyon seçildi!";
           int duration = Toast.LENGTH_SHORT;

           Toast toast = Toast.makeText(context, text, duration);
           toast.show();
       }
    }

    private void subscribe(String motivasyon) {
        try {

            HmsMessaging.getInstance(this.getApplicationContext()).subscribe(motivasyon)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(Task<Void> task) {
                            if (task.isSuccessful()) {
                                Log.i(TAG, "subscribe Complete");

                            } else {
                                Log.e(TAG, "subscribe failed: ret=" + task.getException().getMessage());
                            }
                        }
                    });
        } catch (Exception e) {
            Log.e(TAG, "subscribe failed: exception=" + e.getMessage());
        }

        HmsMessaging.getInstance(this.getApplicationContext()).turnOnPush()
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(Task<Void> task) {
                        if (task.isSuccessful()) {
                            Log.i(TAG, "turnOnPush Complete");
                        } else {
                            Log.e(TAG, "turnOnPush failed: cause=" + task.getException().getMessage());
                        }
                    }
                });
    }


}

