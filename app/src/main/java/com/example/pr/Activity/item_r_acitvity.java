package com.example.pr.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.pr.Adapter.RecyclerViewReadingAdapter;
import com.example.pr.Item;
import com.example.pr.R;

import java.util.ArrayList;
import java.util.List;

public class item_r_acitvity extends AppCompatActivity {

    private TextView tv_title;
    List<Item> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_r_acitvity);
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
        listItem.add(new Item("Part 5: Answer question", R.drawable.ic_part1));
        listItem.add(new Item("Part 6: Question Respone", R.drawable.ic_part3));
        listItem.add(new Item("Part 7: Short conversation", R.drawable.ic_part3));

        RecyclerView myrv  = (RecyclerView) findViewById(R.id.recycleview_id);
        RecyclerViewReadingAdapter myAdapter = new RecyclerViewReadingAdapter(this, listItem);

        myrv.setLayoutManager(new GridLayoutManager(this, 1));
        myrv.setAdapter(myAdapter);
    }

}
