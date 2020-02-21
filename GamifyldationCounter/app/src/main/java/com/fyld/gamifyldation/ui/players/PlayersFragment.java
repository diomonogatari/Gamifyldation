package com.fyld.gamifyldation.ui.players;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.fyld.gamifyldation.R;
import com.fyld.gamifyldation.data.DatabaseHelper;

public class PlayersFragment extends Fragment {

    private PlayersViewModel playersViewModel;



    protected DatabaseHelper model;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        playersViewModel = ViewModelProviders.of(this).get(PlayersViewModel.class);

        View root = inflater.inflate(R.layout.fragment_players, container, false);

        final ListView textView = root.findViewById(R.id.listView_players);

/*        playersViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.;
            }
        });*/

        // when app starts, create the database and use it as a singleton for the rest of the process
        model = DatabaseHelper.getInstance(this.getContext());

        return root;
    }


    @Override
    public void onDestroy(){
        model.close(); //close model
        super.onDestroy();
    }
}