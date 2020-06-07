package com.ashart.mobileprogrammingjava;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ashart.mobileprogrammingjava.list.ListActivity;
import com.ashart.mobileprogrammingjava.maps.MapsActivity;
import com.ashart.mobileprogrammingjava.sharedpref.SharedPreferencesActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnActivity = findViewById(R.id.btn_activity);
        Button btnAlert = findViewById(R.id.btn_alert);
        Button btnList = findViewById(R.id.btn_list);
        Button btnTabView = findViewById(R.id.btn_tab_view);
        Button btnMap = findViewById(R.id.btn_map);
        Button btnSharedPref = findViewById(R.id.btn_shared_preferences);
        Button btnNetwork = findViewById(R.id.btn_network);

        btnActivity.setOnClickListener(this);
        btnAlert.setOnClickListener(this);
        btnList.setOnClickListener(this);
        btnTabView.setOnClickListener(this);
        btnMap.setOnClickListener(this);
        btnSharedPref.setOnClickListener(this);
        btnNetwork.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_alert:
                Intent alertIntent = new Intent(MainActivity.this, NotificationActivity.class);
                startActivity(alertIntent);
                break;
            case R.id.btn_list:
                Intent listIntent = new Intent(MainActivity.this, ListActivity.class);
                startActivity(listIntent);
                break;
            case R.id.btn_tab_view:
                Intent tabIntent = new Intent(MainActivity.this, TabViewActivity.class);
                startActivity(tabIntent);
                break;
            case R.id.btn_map:
                Intent mapIntent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(mapIntent);
                break;
            case R.id.btn_shared_preferences:
                Intent sharedIntent = new Intent(MainActivity.this, SharedPreferencesActivity.class);
                startActivity(sharedIntent);
                break;
            case R.id.btn_network:
                showAlert();
//                Intent networkIntent = new Intent(MainActivity.this, NetworkActivity.class);
//                startActivity(networkIntent);
        }
    }

    private void showAlert(){
        final CharSequence[] items = { "Latihan", "Tugas"};
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Pertemuan 10");
        alert.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                Intent latihanIntent = new Intent(MainActivity.this, NetworkActivity.class);
                startActivity(latihanIntent);
                Toast.makeText(MainActivity.this, items[0], Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        }).show();
    }
}
