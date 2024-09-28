package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализируем данные
        setInitialData();

        // Находим RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        // Устанавливаем LayoutManager и адаптер
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerAdapter adapter = new RecyclerAdapter(this, states);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        // Добавляем данные городов (страны, флаги)
        states.add(new State("Бразилия", "Бразилия", R.drawable.brazilia));
        states.add(new State("Аргентина", "Буэнос-Айрес", R.drawable.arg));
        states.add(new State("Россия", "Москва", R.drawable.russia));
    }
}
