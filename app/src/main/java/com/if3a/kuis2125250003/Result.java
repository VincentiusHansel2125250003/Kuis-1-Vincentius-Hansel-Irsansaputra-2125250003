package com.if3a.kuis2125250003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {
    private Button btnLogOut;
    private TextView tvNama, tvCountry, tvEmail, tvPassword, tvPasswordConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        btnLogOut = findViewById(R.id.btn_logOut);

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(Result.this, MainActivity.class);
                startActivity(logout);
            }
        });

        tvNama = findViewById(R.id.tv_nama);
        tvCountry = findViewById(R.id.tv_country);
        tvEmail = findViewById(R.id.tv_email);

        //tangkap intent dari register
        Intent intent = getIntent();
        tvNama.setText(intent.getStringExtra("varNama"));
        tvCountry.setText(intent.getStringExtra("varCountry"));
        tvEmail.setText(intent.getStringExtra("varEmail"));


    }
}