package com.usa.festecolreto2.ui.servicios;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.usa.festecolreto2.databinding.FragmentServiciosBinding;

public class ServiciosFragment extends Fragment {


    private FragmentServiciosBinding binding;
    private ImageView ts1, ts2, ts3, ts4, ts5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentServiciosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ts1 = (ImageView) binding.imgs1;
        ts2 = (ImageView) binding.imgs2;
        ts3 = (ImageView) binding.imgs3;
        ts4 = (ImageView) binding.imgs4;

        ts1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 1 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        ts2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 2 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        ts3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 3 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        ts4.setOnClickListener(new View.OnClickListener() {
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