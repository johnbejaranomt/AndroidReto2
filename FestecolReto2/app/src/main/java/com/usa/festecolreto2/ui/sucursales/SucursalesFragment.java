package com.usa.festecolreto2.ui.sucursales;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.usa.festecolreto2.R;
import com.usa.festecolreto2.databinding.FragmentSucursalesBinding;


public class SucursalesFragment extends Fragment {


    private FragmentSucursalesBinding binding;
    private ImageView tm1, tm2, tm3, tm4, tm5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentSucursalesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        tm1 = (ImageView) binding.imgm1;
        tm2 = (ImageView) binding.imgm2;
        tm3 = (ImageView) binding.imgm3;
        tm4 = (ImageView) binding.imgm4;

        tm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 1 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        tm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 2 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        tm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 3 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        tm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 4 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}