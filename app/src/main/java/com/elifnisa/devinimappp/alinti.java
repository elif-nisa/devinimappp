package com.elifnisa.devinimappp;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

//import com.google.firebase.messaging.FirebaseMessaging;

public class alinti extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button alintiSecBtn;
    private static final String TAG = "alinti";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alinti);
        baslik=(TextView) findViewById(R.id.baslik);
        aciklamaa=(TextView) findViewById(R.id.aciklamaa);
        alintiSecBtn=(Button) findViewById(R.id.alintiSecBtn);
        alintiSecBtn.setOnClickListener(this);

        // HUAWEI Ads SDK başlatmak için
        HwAds.init(this);

        // Obtain BannerView based on the configuration in layout/ad_fragment.xml.
        BannerView bottomBannerView = findViewById(R.id.hw_banner_view);
        AdParam adParam = new AdParam.Builder().build();
        bottomBannerView.loadAd(adParam);

        // Call new BannerView(Context context) to create a BannerView class.
        BannerView topBannerView = new BannerView(this);
        topBannerView.setAdId("testw6vs28auh3");
        topBannerView.setBannerAdSize(BannerAdSize.BANNER_SIZE_360_57);
        topBannerView.loadAd(adParam);

        RelativeLayout rootView = findViewById(R.id.root_view);
        rootView.addView(topBannerView);
    }

    @Override
    public void onClick(View v) {
       /* FirebaseMessaging.getInstance().subscribeToTopic("alinti" )
                .addOnCompleteListener((com.google.android.gms.tasks.OnCompleteListener<Void>) task -> {
                    String msg = getString(R.string.msg_subscribed);
                    if (!task.isSuccessful()) {
                        msg = getString(R.string.msg_subscribe_failed);
                    }
                    Log.d(TAG, msg);
                    Toast.makeText(alinti.this, msg, Toast.LENGTH_SHORT).show();
                });*/
    }
}