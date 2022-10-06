package com.if3a.kuis2125250003;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    private EditText etNama, etCountry, etEmail, etPassword;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnSignUp = findViewById(R.id.btn_signUp);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent signup3 = new Intent(Register.this, Result.class);
                startActivity(signup3);

                String nama = etNama.getText().toString();
                String negara = etCountry.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();

                if (nama.trim().isEmpty()) {
                    etNama.setError("Nama tidak boleh kosong");
                } else if (negara.trim().isEmpty()) {
                    etCountry.setError("Negara tidak boleh kosong");
                } else if (email.trim().isEmpty()) {
                    etEmail.setError("Alamat tidak boleh kosong");
                } else if (password.trim().isEmpty()) {
                    etPassword.setError("Password tidak boleh kosong");
                } else {
                    Intent intent = new Intent(Register.this, Result.class);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varNegara", negara);
                    intent.putExtra("varEmail", email);
                    startActivity(intent);
                }

            }
        });

    }
}