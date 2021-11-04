package com.example.phamhaidang_ktgiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.phamhaidang_ktgiuaky.databinding.ActivityChonNhacBinding;

public class ChonNhac extends AppCompatActivity {
    private ActivityChonNhacBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChonNhacBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = new Intent(this,MainActivity.class);

        binding.button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("baihat","bai1");
                Toast.makeText(ChonNhac.this, "Bạn đã chọn bài hát Câu hẹn câu thề", Toast.LENGTH_SHORT).show();
            }
        });
        binding.button02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("baihat","bai2");
                Toast.makeText(ChonNhac.this, "Bạn đã chọn bài hát DramaQueen", Toast.LENGTH_SHORT).show();
            }
        });
        binding.button03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("baihat","bai3");
                Toast.makeText(ChonNhac.this, "Bạn đã chọn bài hát Hoa đã tàn phai", Toast.LENGTH_SHORT).show();
            }
        });
        binding.button04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("baihat","bai4");
                Toast.makeText(ChonNhac.this, "Bạn đã chọn bài hát Hương", Toast.LENGTH_SHORT).show();
            }
        });
        binding.button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("baihat","bai5");
                Toast.makeText(ChonNhac.this, "Bạn đã chọn bài hát Không xứng đáng", Toast.LENGTH_SHORT).show();
            }
        });
        binding.button06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("baihat","bai6");
                Toast.makeText(ChonNhac.this, "Bạn đã chọn bài hát Nằm ngủ em ru", Toast.LENGTH_SHORT).show();
            }
        });

        binding.buttonChon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
}