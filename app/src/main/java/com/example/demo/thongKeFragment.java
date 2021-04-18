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

import java.util.Calendar;
import java.util.Date;

public class thongKeFragment extends Fragment {

    Date currentTime = Calendar.getInstance().getTime();

    SearchView searchView;
    ListView listView;


    ArrayAdapter<String> arrayAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thong_ke, container, false);

        String[] menuItems = {"Tổng số đơn hàng", "Tổng số hàng hóa bán được", "Tiền vào", "Tiền vốn","Tiền lời"};


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
