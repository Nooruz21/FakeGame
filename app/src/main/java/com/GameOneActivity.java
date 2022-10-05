package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.fakegame.MainActivity;
import com.example.fakegame.R;
import com.example.fakegame.databinding.ActivityGameOneBinding;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class GameOneActivity extends AppCompatActivity {
    private ActivityGameOneBinding binding;
    private static final String CORRECT_WORD = "АНИМЕ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGameOneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initBtnCheck();

    }

    private void initBtnCheck() {
        binding.btnCheck.setOnClickListener(view -> {
            if (binding.edLetter.getText().toString().equals("")){
                alertDialog();
            }
        });
    }

    private void alertDialog() {
        MaterialAlertDialogBuilder alertDialog=new MaterialAlertDialogBuilder(this);
        alertDialog.setTitle("Вы угадали слово");
        alertDialog.setMessage("Переходим на следующий экран");
        alertDialog.setPositiveButton("Дальше",(dialogInterface, i) -> {
            Intent intent=new Intent(this,);
            startActivity(intent);
            finish();
        });
        alertDialog.setNegativeButton("В главное меню",(dialogInterface, i) -> {
            Intent intent=new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();
        });


    }
}