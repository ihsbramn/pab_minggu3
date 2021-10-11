package com.rab.pab_minggu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void RegisClick(View view) {
        Intent regis = new Intent(this, RegisActivity.class);
        startActivity(regis);
    }

    public void LoginClick(View view) {
        Intent login = new Intent(this, HomeActivity.class);
        startActivity(login);
    }
}