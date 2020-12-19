package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;

import static com.huawei.hms.aaid.constant.AaidIdConstant.getToken;

public class motivasyon extends AppCompatActivity implements View.OnClickListener {
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

    }





}