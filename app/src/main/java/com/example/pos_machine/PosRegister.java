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
        code = fragmentPosRegisterBinding.codeEditText;
        item = fragmentPosRegisterBinding.itemEditText;
        unit = fragmentPosRegisterBinding.unitEditText;
        unit_price = fragmentPosRegisterBinding.unitPriceEditText;
        BtnSave = fragmentPosRegisterBinding.BtnSave;
        resetBtn=fragmentPosRegisterBinding.resetBtn;
         DB db;
        db = new DB(getContext());
        BtnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(code.getText().toString().isEmpty() || item.getText().toString().isEmpty() || unit.getText().toString().isEmpty() || unit_price.getText().toString().isEmpty()){
                        Toast.makeText(getActivity(), "please fill all values", Toast.LENGTH_SHORT).show();
                    }else {
                        Boolean isInserted = db.insertInfo(code.getText().toString(), item.getText().toString(), Integer.parseInt(unit.getText().toString()), unit_price.getText().toString());
                        if (isInserted == true) {
                           Toast.makeText(getActivity(), "New Data is Saved", Toast.LENGTH_SHORT).show();
                       } else
                            Toast.makeText(getActivity(), "Code already exist", Toast.LENGTH_SHORT).show();
                }
            }
        });


        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code.setText("");
                item.setText("");
                unit.setText("");
                unit_price.setText("");
            }
        });


        // Inflate the layout for this fragment
        return n;
    }



}

