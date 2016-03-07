package com.example.anjanagupta.happen2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
    }

    public void chatClick(View view) {
        String mUsername = getIntent().getExtras().getString("mUsername");
        Intent intent = new Intent(OptionActivity.this, ChatActivity.class);
        Bundle extras = new Bundle();
        extras.putString("mUsername", mUsername);
        intent.putExtras(extras);
        startActivity(intent);
    }
}
