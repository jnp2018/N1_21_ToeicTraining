package com.example.pr.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.pr.R;

public class Item_Acitivity extends AppCompatActivity {

    private TextView tv_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__acitivity);

        tv_title = findViewById(R.id.tv_title_item_activity);

        // Recevie data
        Intent intent = getIntent();
        String  title = intent.getExtras().getString("title");

        tv_title.setText(title);
    }
}
