package com.elifnisa.devinimappp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.huawei.agconnect.auth.AGConnectAuth;
import com.huawei.hms.ads.AdParam;
import com.huawei.hms.ads.BannerAdSize;
import com.huawei.hms.ads.HwAds;
import com.huawei.hms.ads.banner.BannerView;

public class welcome extends AppCompatActivity implements View.OnClickListener {
   private TextView tvHello,tvName,aciklama;
   private Button motivasyonBtn,alintiBtn,dusunurlerBtn,sarkilarBtn,burclarBtn,cikisBtn,ego_btn;
   private String strName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
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
        Intent intent = new Intent(this, alinti.class);
        startActivity(intent);
    }

    private void onClickThird(View view) {
        Intent intent = new Intent(this, dusunurler.class);
        startActivity(intent);
    }

    private void onClickFourth(View view) {
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