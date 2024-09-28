package com.example.recyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        // Получение данных из Intent
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String capital = intent.getStringExtra("capital");
        int flag = intent.getIntExtra("flag", 0);

        // Установка данных на элементы интерфейса
        TextView nameTextView = findViewById(R.id.nameTextView);
        TextView capitalTextView = findViewById(R.id.capitalTextView);
        ImageView flagImageView = findViewById(R.id.flagImageView);

        nameTextView.setText(name);
        capitalTextView.setText(capital);
        flagImageView.setImageResource(flag);
    }
}
