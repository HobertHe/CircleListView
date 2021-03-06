package com.example.circlelistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.circlelistview.Adapter;
import com.example.circlelistview.CircleListView;

public class MainActivity extends AppCompatActivity {

    CircleListView circle_list_view;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        circle_list_view = findViewById(R.id.circle_list_view);
        adapter = new Adapter(circle_list_view) {
            @Override
            public View getView(int position) {
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_test,null);
                TextView text = view.findViewById(R.id.text);
                text.setText(position + "");
                return view;
            }

            @Override
            public int getCount() {
                return 10;
            }
        };
        circle_list_view.setAdapter(adapter);

        adapter.setPosition(5);
    }
}
