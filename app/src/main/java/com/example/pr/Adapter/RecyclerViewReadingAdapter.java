package com.example.pr.Adapter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pr.Item;
import com.example.pr.R;
import com.example.pr.practice_part5;

import java.util.List;

public class RecyclerViewReadingAdapter  extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder>{

    private Context mContext;
    private List<Item> mData;

    public RecyclerViewReadingAdapter(Context mContext, List<Item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public RecycleViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view ;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate((R.layout.cardview_item_menu), viewGroup, false);

        return new RecycleViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecycleViewAdapter.MyViewHolder myViewHolder, final int i) {

        myViewHolder.tv_item_title.setText(mData.get(i).getTitle());
        myViewHolder.iv_item_img.setImageResource(mData.get(i).getAvatar());

        // set click listener
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (i) {
                    case 0:
                        Intent intent = new Intent(mContext, practice_part5.class);
                        intent.putExtra("title", mData.get(i).getTitle());
                        mContext.startActivity(intent);
                        break;
                    case 1:
                        break;
                    case 2:
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
