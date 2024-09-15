package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // начальная инициализация списка
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){

        states.add(new State ("Россия", "Москва", R.drawable.negr));
        states.add(new State ("Армения", "Ереван", R.drawable.negr));
        states.add(new State ("Реп", "Хип-хоп", R.drawable.negr));
        states.add(new State ("Тимон", "Пумба", R.drawable.negr));
        states.add(new State ("Азербайджан", "Баку", R.drawable.negr));
        states.add(new State ("Грузия", "Тбилиси", R.drawable.negr));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.negr));
        states.add(new State ("Татарстан", "Уфа", R.drawable.negr));
        states.add(new State ("Курить", "Плохо", R.drawable.negr));
        states.add(new State ("Ставь", "Лайк", R.drawable.negr));
        states.add(new State ("", "Буэнос-Айрес", R.drawable.negr));

    }
}