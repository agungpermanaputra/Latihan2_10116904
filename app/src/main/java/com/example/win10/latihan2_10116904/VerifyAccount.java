package com.example.win10.latihan2_10116904;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class VerifyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
    }

    public void keuserhome (View view) {
        Intent intent = new Intent(VerifyAccount.this, UserHome.class);
        startActivity(intent);
    }
}
