package com.example.phamhaidang_ktgiuaky;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.example.phamhaidang_ktgiuaky.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    String tenbai;
    MediaPlayer media;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        tenbai = intent.getStringExtra("baihat");

        switch (tenbai){
            case "bai1":
                media = MediaPlayer.create(this,R.raw.cauhencauthe);
                binding.tvTenBaiHat.setText("Câu hẹn câu thề");
                break;
            case "bai2":
                media = MediaPlayer.create(this,R.raw.dramaqueen);
                binding.tvTenBaiHat.setText("Drama Queen");
                break;
            case "bai3":
                media = MediaPlayer.create(this,R.raw.hoadatanphai);
                binding.tvTenBaiHat.setText("Hoa đã tàn phai");
                break;
            case "bai4":
                media = MediaPlayer.create(this,R.raw.huong);
                binding.tvTenBaiHat.setText("Hương");
                break;
            case "bai5":
                media = MediaPlayer.create(this,R.raw.khongxungdang);
                binding.tvTenBaiHat.setText("Không xứng đáng");
                break;
            case "bai6":
                media = MediaPlayer.create(this,R.raw.namnguemru);
                binding.tvTenBaiHat.setText("Nằm ngủ em ru");
                break;
            default:
                media = MediaPlayer.create(this,R.raw.namnguemru);
                binding.tvTenBaiHat.setText("Nằm ngủ em ru");
                break;
        }

        binding.buttonChonBai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                media.release();
                Intent chuyen = new Intent(MainActivity.this,ChonNhac.class);
                startActivity(chuyen);
            }
        });

        binding.buttonPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                media.start();
            }
        });

        binding.buttonPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                media.pause();
            }
        });


    }
}