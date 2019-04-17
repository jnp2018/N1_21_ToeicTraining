package com.example.pr.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.pr.Adapter.RecyclerViewListeningAdapter;
import com.example.pr.Item;
import com.example.pr.R;

import java.util.ArrayList;
import java.util.List;

public class Item_Acitivity extends AppCompatActivity {

    private TextView tv_title;
    List<Item> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item__acitivity);
        init();


//        tv_title = findViewById(R.id.tv_title_item_activity);
//
//        // Recevie data
//        Intent intent = getIntent();
//        String  title = intent.getExtras().getString("title");
//
//        tv_title.setText(title);
    }

    private void init() {
        listItem = new ArrayList<>();
        listItem.add(new Item("Part 1: Photo", R.drawable.ic_part1));
        listItem.add(new Item("Part 2: Question Respone", R.drawable.ic_part3));
        listItem.add(new Item("Part 3: Short conversation", R.drawable.ic_part3));
        listItem.add(new Item("Part4: Short talk", R.drawable.ic_part1));

        RecyclerView myrv  = (RecyclerView) findViewById(R.id.recycleview_id);
        RecyclerViewListeningAdapter myAdapter = new RecyclerViewListeningAdapter(this, listItem);

        myrv.setLayoutManager(new GridLayoutManager(this, 1));
        myrv.setAdapter(myAdapter);
    }

}
