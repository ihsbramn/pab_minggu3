package com.rab.pab_minggu2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegisActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);
    }

    public void SubmitClick(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Register Completed !";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }

    public void ToLoginClick(View view) {
        Intent main = new Intent(this, MainActivity.class);
        startActivity(main);
    }
}