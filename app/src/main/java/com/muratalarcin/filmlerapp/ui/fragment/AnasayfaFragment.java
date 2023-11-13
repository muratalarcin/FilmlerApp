package com.muratalarcin.filmlerapp.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.muratalarcin.filmlerapp.R;
import com.muratalarcin.filmlerapp.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container,false);



        return binding.getRoot();
    }
}