package com.usa.festecolreto2.ui.productos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.usa.festecolreto2.databinding.FragmentProductosBinding;

public class ProductosFragment extends Fragment {


    private FragmentProductosBinding binding;
    private ImageView tp1, tp2, tp3, tp4, tp5;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentProductosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        tp1 = (ImageView) binding.imgp1;
        tp2 = (ImageView) binding.imgp2;
        tp3 = (ImageView) binding.imgp3;
        tp4 = (ImageView) binding.imgp4;
        tp5 = (ImageView) binding.imgp5;

        tp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 1 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        tp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 2 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        tp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 3 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        tp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 4 en Construcción", Toast.LENGTH_SHORT).show();
            }
        });
        tp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "app 5 en Construcción", Toast.LENGTH_SHORT).show();
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