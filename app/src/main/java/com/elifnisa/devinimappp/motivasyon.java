package com.elifnisa.devinimappp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class motivasyon extends AppCompatActivity implements View.OnClickListener {
    private TextView baslik,aciklamaa;
    private Button motivasyonSecBtn;
    private static final String TAG = "motivasyon";
    private static final String TOPIC = "motivasyon";

   /* private static final List<String> REG_TOKEN = new ArrayList() {{
        add("RegTokenOfDeviceOne"); // Pixel Token
        add("RegTokenOfDeviceTwo"); // Nexus Token
    }};*/

  /*  private static void initializeFirebase() throws Exception {
        String keyPath = "path/to/service_key.json";
        FileInputStream serviceAccount =
                new FileInputStream(keyPath);

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
               // .setCredentials(GoogleCredentials)
                .setDatabaseUrl("https://<DATABASE_NAME>.firebaseio.com")
                .build();

        FirebaseApp firebaseApp = FirebaseApp.initializeApp(options);
    }

    private void subscribeTopic() throws Exception {
         TopicManagementResponse response = FirebaseMessaging.getInstance().subscribeToTopic(REG_TOKEN,TOPIC);
        System.out.println("Subscribed : " + response.getSuccessCount());
        Toast.makeText(motivasyon.this, R.string.msg_subscribed, Toast.LENGTH_LONG).show();
    }*/

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
     /*  try {
            initializeFirebase();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            subscribeTopic();
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }
}