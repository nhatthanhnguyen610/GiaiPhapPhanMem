package com.example.demo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SearchFragment extends Fragment {

    SearchView searchView;
    ListView listView;



    ArrayAdapter<String> arrayAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        String[] menuItems = {"Ha Noi", "Ho Chi Minh", "Da Nang", "Gia Lai", "Kon Tum", "An Giang", "Lang Son", "Lao Cai",
        "Yen Bai", "Ha Tinh", "Hai Phong", "Hai Duong", "Dien Biwn", "Dak Lak","Phu Yen", "Ninh Thuan" };

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
