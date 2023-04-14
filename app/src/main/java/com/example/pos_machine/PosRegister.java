package com.example.pos_machine;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pos_machine.databinding.FragmentPosRegisterBinding;

public class PosRegister extends Fragment {

    private EditText code, item , unit , unit_price;
    private Button BtnSave , resetBtn;
    private FragmentPosRegisterBinding fragmentPosRegisterBinding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        fragmentPosRegisterBinding = fragmentPosRegisterBinding.inflate(getLayoutInflater());
        View n = fragmentPosRegisterBinding.getRoot();


        // Inflate the layout for this fragment
        return n;
    }



}

