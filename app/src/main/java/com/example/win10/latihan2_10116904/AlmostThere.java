package com.example.win10.latihan2_10116904;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }

    public void keverify (View view) {
        Intent intent= new Intent (AlmostThere.this, VerifyAccount.class);
        startActivity(intent);
    }
}
