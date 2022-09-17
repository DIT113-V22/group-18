package com.example.icar13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.DialogTitle;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Start_activity extends AppCompatActivity {


    private static final String TAG = "Start_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        Log.d(TAG, "onCreate: Starting.");


        Button btdNavToSecond = findViewById(R.id.login_button);

        btdNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: Clicked btdNavToSecond");

                Intent intent =new Intent(Start_activity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}
