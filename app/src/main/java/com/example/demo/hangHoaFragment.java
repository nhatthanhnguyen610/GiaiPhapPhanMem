package com.example.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class hangHoaFragment extends Fragment {

    SearchView searchView;
    ListView listView;



    ArrayAdapter<String> arrayAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hang_hoa, container, false);

        String[] menuItems = {"Bánh bắp", "Bánh khoai tây", "Kẹo bốn mùa", "Kem đánh răng", "Bàn chải đánh răng", "Khăn lau", "Ly uống nước",
                "Xà bông rửa chén", "Nước lau sàn",};


        ListView listView = view.findViewById(R.id.list);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                menuItems
        );

        listView.setAdapter(listViewAdapter);

        return view;


    }

}
