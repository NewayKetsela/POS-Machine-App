package com.example.pos_machine;

import android.annotation.SuppressLint;
import android.database.Cursor;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pos_machine.databinding.FragmentPosSaleBinding;

import java.util.ArrayList;
import java.util.List;


public class PosSale extends Fragment {

    private EditText sale_code, sale_item, quantity, sale_total, sale_tax , sale_quantity2;
    private Button searchBtn, addBtn, paidBtn , resetBtn;
    private TextView textView;
    private RecyclerView recycler_view_card;
    private FragmentPosSaleBinding fragmentPosSaleBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {



        fragmentPosSaleBinding=fragmentPosSaleBinding.inflate(getLayoutInflater());
        View nv = fragmentPosSaleBinding.getRoot();

        // Inflate the layout for this fragment
        return nv;
    }
}


