package com.fyld.gamiyldation.ui.players;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.fyld.gamiyldation.data.Player;

import java.util.ArrayList;

public class PlayersAdapter extends BaseAdapter {
    Activity context;
    ArrayList<Player> playerList;
    private static LayoutInflater inflater = null;

    public PlayersAdapter(Activity context, ArrayList<Player> players){
        this.context = context;
        this.playerList = players;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
