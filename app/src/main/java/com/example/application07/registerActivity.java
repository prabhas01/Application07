package com.example.application07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class registerActivity extends AppCompatActivity {
    EditText etName,etEmail, etPassword,etconfirmation;
    Button etRegister;
    String Name,Email, Password,  confirmation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        getSupportActionBar().setTitle("Register");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);



        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword =(EditText) findViewById(R.id.etPassword);
        etconfirmation = (EditText) findViewById(R.id.etconfirmation);
        etRegister=  findViewById(R.id.etRegister);

        etRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkRegister();
            }
        });

    }

    private void checkRegister() {

        Name = etName.getText().toString();
        Email=etEmail.getText().toString();
        Password=etPassword.getText().toString();
        confirmation=etconfirmation.getText().toString();

        if(Name.isEmpty()||Email.isEmpty()||Password.isEmpty()){

            alertfail("Name , Email, Password is required");
        }
        else if(! Password.equals(confirmation)){
            alertfail("Password doesn't match");
        }
        else{
            sendRegister();
        }

    }

    private void sendRegister() {
        alertsuccess("register is compelete");
    }

    private void alertsuccess(String register_is_compelete) {
        new AlertDialog.Builder(this)
                .setTitle("Success")
                .setMessage(register_is_compelete)
                .setPositiveButton("Login", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    private void alertfail(String s) {
       new AlertDialog.Builder(this)
               .setTitle("Failed")
               .setMessage(s)
               .setPositiveButton("Register", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {
                       dialog.dismiss();
                   }
               })
               .show();

    }
}