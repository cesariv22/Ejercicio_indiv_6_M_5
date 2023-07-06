package com.example.ejercicio_indiv_6_m_5;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.ejercicio_indiv_6_m_5.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}