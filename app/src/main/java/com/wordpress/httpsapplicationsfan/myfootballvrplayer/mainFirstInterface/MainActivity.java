package com.wordpress.httpsapplicationsfan.myfootballvrplayer.mainFirstInterface;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.wordpress.httpsapplicationsfan.myfootballvrplayer.ConstantUse;
import com.wordpress.httpsapplicationsfan.myfootballvrplayer.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<ModelPlayerData> playerArrayList;
    private RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        playerArrayList=new ArrayList<>();
        playerData();
        recyclerView = (RecyclerView) findViewById(R.id.id_main_recycler_view);
        adapter = new RecyclerViewAdapter(playerArrayList,getApplicationContext(),MainActivity.this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }

    private void playerData() {
        ModelPlayerData modelPlayerData;
        modelPlayerData = new ModelPlayerData("image_messi", ConstantUse.NAME_MESSI,"Barcelona");
        playerArrayList.add(modelPlayerData);

        modelPlayerData=new ModelPlayerData("image_ronaldo",ConstantUse.NAME_RONALDO,"Real Madrid");
        playerArrayList.add(modelPlayerData);

        modelPlayerData=new ModelPlayerData("image_neymr",ConstantUse.NAME_NEYMAR,"Paris Saint Germain FC");
        playerArrayList.add(modelPlayerData);

        modelPlayerData=new ModelPlayerData("image_bekkhem",ConstantUse.NAME_BECKHAM,"Retired");
        playerArrayList.add(modelPlayerData);
    }
}
