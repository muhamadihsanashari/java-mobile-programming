package com.ashart.mobileprogrammingjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MoveActivity extends AppCompatActivity implements View.OnClickListener {

    public static String txtName,  txtNim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);

        Button btnNext = findViewById(R.id.btn_next);
        Button btnCancel = findViewById(R.id.btn_cancel);
        EditText edtName = findViewById(R.id.edt_name);
        EditText edtNim = findViewById(R.id.edt_nim);

        btnNext.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_next:
                EditText edtName = findViewById(R.id.edt_name);
                EditText edtNim = findViewById(R.id.edt_nim);

                txtName = edtName.getText().toString();
                txtNim = edtNim.getText().toString();

                Intent moveWithData = new Intent(MoveActivity.this, SecondActivity.class);
                moveWithData.putExtra(SecondActivity.EXTRA_NAME, txtName);
                moveWithData.putExtra(SecondActivity.EXTRA_NIM, txtNim);
                startActivity(moveWithData);
                break;
            case R.id.btn_cancel:
                finish();
        }
    }
}
