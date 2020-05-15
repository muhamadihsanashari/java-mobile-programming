package com.ashart.mobileprogrammingjava.maps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ashart.mobileprogrammingjava.R;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                Toast.makeText(this, "Membutuhkan Izin Lokasi", Toast.LENGTH_SHORT).show();
            }else {
                ActivityCompat.requestPermissions(this,
                        new String[]
                                {Manifest.permission.ACCESS_FINE_LOCATION,
                                Manifest.permission.ACCESS_COARSE_LOCATION}, 1);
            }
        } else {
            Toast.makeText(this, "Izin Lokasi Diberikan", Toast.LENGTH_SHORT).show();
        }

    }

    public void openAutoPlace(View view) {
        startActivity(new Intent(this, PlaceAutoCompleteActivity.class));
    }

    public void openDirectionMap(View view) {
        startActivity(new Intent(this, DirectionActivity.class));
    }

    public void openOjek(View view) {
        startActivity(new Intent(this, OjekActivity.class));
    }
}
