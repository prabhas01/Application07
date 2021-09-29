package com.example.application07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginactivity extends AppCompatActivity {
    EditText etEmail,etPassword;
    Button btnLogin,btnR;
    String Email, Password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setTitle("Login");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);


        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin =findViewById(R.id.btnLogin);
        btnR= findViewById(R.id.btnR);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkLogin();
            }
        });

        btnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(loginactivity.this ,registerActivity.class);
                startActivity(intent);
            }
        });


    }

    private void checkLogin() {
        Email= etEmail.getText().toString();
        Password=etPassword.getText().toString();
        if(Email.isEmpty()||Password.isEmpty()) {
            alertfail("email and password is required");
        }
        else{
            sendLogin();
        }

    }

    private void sendLogin() {
        Intent intent=new Intent(loginactivity.this, UserActivity.class);
        startActivity(intent);
        finish();
    }

    private void alertfail(String email_and_password_is_required) {
        new AlertDialog.Builder(this)
                .setTitle("failed")
                .setMessage(email_and_password_is_required)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

}