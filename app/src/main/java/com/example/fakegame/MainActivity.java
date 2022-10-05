package com.example.fakegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.GameOneActivity;
import com.example.fakegame.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.btnGame.setOnClickListener(view -> {
            initNav();
        });


    }

    private void initNav() {
        Intent intent = new Intent(this, GameOneActivity.class);
        startActivity(intent);
        finish();
    }
}
