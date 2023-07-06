package com.example.ejercicio_indiv_6_m_5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejercicio_indiv_6_m_5.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment implements Adapter.OnItemClickListener{

    private FragmentFirstBinding binding;
    public RecyclerView recyclerView;
    private Adapter adapter;
    private List<DatosLista>dataList;
    public int indice;
    List<DatosLista> data=new ArrayList<>();

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        if(dataList!=null) {
            dataList.clear();
        }
        dataList=getData();
        recyclerView=binding.Rv;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        adapter=new Adapter(dataList);
        recyclerView.setAdapter(adapter);

        return binding.getRoot();
    }

    private List<DatosLista>getData(){
        DatosLista item1 = new DatosLista("https://unsplash.com/photos/UBvtBr_FmrY/download?force=true&w=640", "Zhuo Chengyou");
        data.add(item1);
        DatosLista item02 = new DatosLista("https://unsplash.com/photos/pNoP-qVwBFQ/download?force=true&w=640", "billow926");
        data.add(item02);
        DatosLista item03 = new DatosLista("https://unsplash.com/photos/LfJx0gqqiEc/download?force=true&w=640", "Philipp Deiß");
        data.add(item03);
        DatosLista item04 = new DatosLista("https://images.unsplash.com/photo-1664366095115-9b4882d0d3b7?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=774&q=80", "Huper by Joshua Earle");
        data.add(item04);
        DatosLista item05 = new DatosLista("https://unsplash.com/photos/rnPGCe7LsQo/download?force=true&w=640","Melnychuk Nataliya");
        data.add(item05);
        DatosLista item06 = new DatosLista("https://unsplash.com/photos/k2DbTXQ0yrQ/download?force=true&w=640", "Teagan Maddux");
        data.add(item06);
        DatosLista item07 = new DatosLista("https://unsplash.com/photos/kZH8X0q4Nvo/download?force=true&w=640", "Chen Liu");
        data.add(item07);
        DatosLista item08 = new DatosLista("https://unsplash.com/photos/iNqJx-VOceI/download?force=true&w=640", "John Fornander");
        data.add(item08);
        DatosLista item09 = new DatosLista("https://unsplash.com/photos/mNWrQ9O6KZw/download?force=true&w=640", "Parker Coffman");
        data.add(item09);
        DatosLista item10 = new DatosLista("https://unsplash.com/photos/8pb7Hq539Zw/download?force=true&w=640", "XPS");
        data.add(item10);
        DatosLista item11 = new DatosLista("https://unsplash.com/photos/l8BvDmt8Ac4/download?force=true&w=640", "Daniel J.Schwarz");
        data.add(item11);
        DatosLista item12 = new DatosLista("https://images.unsplash.com/photo-1688118274836-e287fafd57e1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHx0b3BpYy1mZWVkfDh8NnNNVmpUTFNrZVF8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=400&q=60", "Wesley Armstrong");
        data.add(item12);
        return data;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter.setOnClickListener(this);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    @Override
    public void onItemClick(int position) {
        indice =position;
        DatosLista eleccion= dataList.get(indice);
        Bundle bundle= new Bundle();
        bundle.putString("url", eleccion.getUrl());
        bundle.putString("datos",eleccion.getDato());
        NavController navController= Navigation.findNavController(requireActivity(),R.id.fragmentContainerView);
        navController.navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
    }

}