package com.fyld.gamifyldation.ui.players;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.fyld.gamifyldation.data.Player;

import java.util.ArrayList;

public class PlayersAdapter extends BaseAdapter {
    Activity context;
    ArrayList<Player> playerList;
    protected static LayoutInflater inflater = null;

    public PlayersAdapter(Activity context, ArrayList<Player> players){
        this.context = context;
        this.playerList = players;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return playerList.size();
    }

    @Override
    public Object getItem(int position) {
        return playerList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView;
        return null;
    }
}