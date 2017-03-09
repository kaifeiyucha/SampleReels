package com.example.samplereels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_movie = (Button)findViewById(R.id.btn_movie);
        btn_movie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "热门电影", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_shares = (Button)findViewById(R.id.btn_shares);
        btn_shares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "股票雄鹰", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_reader = (Button)findViewById(R.id.btn_reader);
        btn_reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "XYZ 阅读器", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_news = (Button)findViewById(R.id.btn_news);
        btn_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "最新闻", Toast.LENGTH_SHORT).show();
            }
        });

        Button btn_graduation = (Button)findViewById(R.id.btn_graduation);
        btn_graduation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "毕业设计", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
