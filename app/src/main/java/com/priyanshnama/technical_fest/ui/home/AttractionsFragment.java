package com.priyanshnama.technical_fest.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.priyanshnama.technical_fest.R;

public class AttractionsFragment extends Fragment {

    private AttractionsViewModel attractionsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        attractionsViewModel =
                ViewModelProviders.of(this).get(AttractionsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_attractions, container, false);
        final TextView textView = root.findViewById(R.id.text_attractions);
        attractionsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}