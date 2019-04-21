package com.example.pr.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pr.Activity.List_Question;
import com.example.pr.Item;
import com.example.pr.R;
import com.example.pr.practice_part1;

import java.util.List;

public class RecyclerViewQuestionAdapter extends RecyclerView.Adapter<RecyclerViewListeningAdapter.MyViewHolder> {

private Context mContext;
private List<Item> mData;

public RecyclerViewQuestionAdapter(Context mContext, List<Item> mData) {
        this.mContext = mContext;
        this.mData = mData;
        }

@Override
public RecyclerViewListeningAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate((R.layout.cardview_item_listeing_menu), viewGroup, false);

        return new RecyclerViewListeningAdapter.MyViewHolder(view);
        }

    @Override
public void onBindViewHolder(RecyclerViewListeningAdapter.MyViewHolder myViewHolder, final int i) {

        myViewHolder.tv_item_title.setText(mData.get(i).getTitle());
        myViewHolder.iv_item_img.setImageResource(mData.get(i).getAvatar());

        // set click listener
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
            Toast.makeText(mContext, "position "+i, Toast.LENGTH_SHORT).show();
        switch (i) {
            case 0:
                Intent intent = new Intent(mContext, practice_part1.class);
                intent.putExtra("title", mData.get(i).getTitle());
                mContext.startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(mContext, practice_part1.class);
                intent1.putExtra("title", mData.get(i).getTitle());
                mContext.startActivity(intent1);
                break;
            case 2:
                break;
            case 3:
                break;
        }
            }
            });
            }

    @Override
    public int getItemCount() {
            return mData.size();
            }

    public static class MyViewHolder extends  RecyclerView.ViewHolder {

        TextView tv_item_title;
        ImageView iv_item_img;
        CardView cardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            tv_item_title = (TextView) itemView.findViewById(R.id.item_title_id);
            iv_item_img = (ImageView) itemView.findViewById(R.id.item_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);

        }
    }
    }