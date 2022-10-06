package com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.fakegame.GameTwoActivity;
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
       initImage();

    }

    private void initImage() {
        Glide.with(this).load("https://dailystorm.ru/media/images/2020/09/29/843a1336-4b8d-412c-a97d-d1369d440730.jpg").centerCrop().into(binding.imageOne);
        Glide.with(this).load("https://dailystorm.ru/media/images/2020/09/29/843a1336-4b8d-412c-a97d-d1369d440730.jpg").centerCrop().into(binding.imageTwo);
        Glide.with(this).load("https://dailystorm.ru/media/images/2020/09/29/843a1336-4b8d-412c-a97d-d1369d440730.jpg").centerCrop().into(binding.imageThree);
        Glide.with(this).load("https://dailystorm.ru/media/images/2020/09/29/843a1336-4b8d-412c-a97d-d1369d440730.jpg").centerCrop().into(binding.imageFour);
    }

//    private void initBtnClear() {
//        binding.edLetter.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//                if (editable.length()>0){
//                    binding.btnClear.setVisibility(View.VISIBLE);
//                }else {
//                    binding.btnClear.setVisibility(View.GONE);
//                }
//
//            }
//        } );
//
//
//
//    }
//
//    private void initBtnCheck() {
//        binding.btnCheck.setOnClickListener(view -> {
//            if (binding.edLetter.getText().toString().equals(CORRECT_WORD)){
//                alertDialog();
//            }else if (binding.edLetter.getText().toString().equals("")){
//                Toast.makeText(this, "Поле пустое", Toast.LENGTH_SHORT).show();
//            }else{
//                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show();
//                binding.edLetter.setText("");
//                binding.letter1.setVisibility(View.VISIBLE);
//                binding.letter2.setVisibility(View.VISIBLE);
//                binding.letter3.setVisibility(View.VISIBLE);
//                binding.letter4.setVisibility(View.VISIBLE);
//                binding.letter5.setVisibility(View.VISIBLE);
//                binding.letter6.setVisibility(View.VISIBLE);
//                binding.letter7.setVisibility(View.VISIBLE);
//                binding.letter8.setVisibility(View.VISIBLE);
//                binding.letter9.setVisibility(View.VISIBLE);
//                binding.letter10.setVisibility(View.VISIBLE);
//                binding.letter11.setVisibility(View.VISIBLE);
//                binding.letter12.setVisibility(View.VISIBLE);
//            }
//        });
//    }
//
//    private void alertDialog() {
//        MaterialAlertDialogBuilder alertDialog=new MaterialAlertDialogBuilder(this);
//        alertDialog.setTitle("Вы угадали слово");
//        alertDialog.setMessage("Переходим на следующий экран");
//        alertDialog.setPositiveButton("Дальше",(dialogInterface, i) -> {
//            Intent intent=new Intent(this, GameTwoActivity.class);
//            startActivity(intent);
//            finish();
//        });
//        alertDialog.setNegativeButton("В главное меню",(dialogInterface, i) -> {
//            Intent intent=new Intent(this, MainActivity.class);
//            startActivity(intent);
//            finish();
//        });
//
//
//    }
}