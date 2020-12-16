package com.elifnisa.devinimappp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText name;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText) findViewById(R.id.edtName);
        send=(Button) findViewById(R.id.btnSend);
        send.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(isValidName(name.getText().toString()))
            goToWelcome(name.getText().toString());
        else
            Toast.makeText(this, "Lütfen bir isim girin", Toast.LENGTH_SHORT).show();

    }


    private boolean isValidName(String toString) {
        if(name.length() >=3 && name.length()<=20)
            return true;
        else
            return false;
    }

    private void goToWelcome(String toString) {
        Bundle bundle = new Bundle();
        bundle.putString("NAME", String.valueOf(name));

        Intent intent = new Intent(this, welcome.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }


}