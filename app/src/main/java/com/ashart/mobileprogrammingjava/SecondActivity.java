package com.ashart.mobileprogrammingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_NIM = "extra_nim";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnBackToMenu = findViewById(R.id.btn_menu);
        btnBackToMenu.setOnClickListener(this);

        TextView tvNameReceived = findViewById(R.id.tv_name);
        TextView tvNimReceived = findViewById(R.id.tv_nim);
        TextView tvGreeting = findViewById(R.id.tv_greeting);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        String nim = getIntent().getStringExtra(EXTRA_NIM);

        tvNameReceived.setText(name);
        tvNimReceived.setText(nim);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_menu:
                finish();
                break;
        }
    }
}
