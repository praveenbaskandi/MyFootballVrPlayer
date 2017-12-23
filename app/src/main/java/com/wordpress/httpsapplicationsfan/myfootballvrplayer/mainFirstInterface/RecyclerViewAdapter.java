package com.wordpress.httpsapplicationsfan.myfootballvrplayer.mainFirstInterface;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.wordpress.httpsapplicationsfan.myfootballvrplayer.HelloArActivity;
import com.wordpress.httpsapplicationsfan.myfootballvrplayer.R;

import java.util.ArrayList;

/**
 * Created by Praveen Baskandi on 22-12-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context context;
    Activity activity;
    ArrayList<ModelPlayerData> modelPlayerArray;

    public RecyclerViewAdapter(ArrayList<ModelPlayerData> playerArrayList, Context applicationContext, Activity activity) {
        this.modelPlayerArray = playerArrayList;
        this.context = applicationContext;
        this.activity = activity;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final ModelPlayerData modelPlayerData = modelPlayerArray.get(position);
        holder.playerImage.setImageResource(activity.getResources().getIdentifier(modelPlayerData.getPlayerImage(), "drawable",activity.getPackageName()));
        holder.playerName.setText(modelPlayerData.getPlayerName());
        holder.playerClub.setText(modelPlayerData.getPlayerClub());
        holder.playerCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAR=new Intent(context, HelloArActivity.class);
                intentAR.putExtra("intent_player_name",modelPlayerData.getPlayerName());
                context.startActivity(intentAR);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelPlayerArray.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView playerImage;
        TextView playerName, playerClub;
        CardView playerCard;

        public MyViewHolder(View itemView) {
            super(itemView);
            playerImage = (ImageView) itemView.findViewById(R.id.id_player_image);
            playerName = (TextView) itemView.findViewById(R.id.id_player_name);
            playerClub = (TextView) itemView.findViewById(R.id.id_player_club);
            playerCard=(CardView)itemView.findViewById(R.id.id_player_card);
        }
    }
}
