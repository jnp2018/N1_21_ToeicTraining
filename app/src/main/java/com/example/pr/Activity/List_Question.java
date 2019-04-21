package com.example.pr.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.pr.Adapter.RecyclerViewListeningAdapter;
import com.example.pr.Adapter.RecyclerViewQuestionAdapter;
import com.example.pr.Item;
import com.example.pr.R;

import java.util.ArrayList;
import java.util.List;

public class List_Question extends AppCompatActivity {
    private TextView tv_title;
    List<Item> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_question);
        init();
    }

    private void init() {
        listItem = new ArrayList<>();
        listItem.add(new Item("Question 1", R.drawable.ic_part1));
        listItem.add(new Item("Question 1", R.drawable.ic_part1));
        listItem.add(new Item("Question 1", R.drawable.ic_part1));
        listItem.add(new Item("Question 1", R.drawable.ic_part1));

        RecyclerView myrv  = (RecyclerView) findViewById(R.id.question_id);
        RecyclerViewQuestionAdapter myAdapter = new RecyclerViewQuestionAdapter(this, listItem);
        myrv.setLayoutManager(new GridLayoutManager(this, 1));
        myrv.setAdapter(myAdapter);
    }
}
