package com.example.samplereels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button  btn_listen = (Button)findViewById(R.id.btn_movie);
//        btn_listen.setOnClickListener(new ButtonListener());
//
//
//        Button btn_shares = (Button)findViewById(R.id.btn_shares);
//        btn_shares.setOnClickListener(new ButtonListener());
//
//
//        Button btn_reader = (Button)findViewById(R.id.btn_reader);
//        btn_reader.setOnClickListener(new ButtonListener() );
//
//        Button btn_news = (Button)findViewById(R.id.btn_news);
//        btn_news.setOnClickListener(new ButtonListener());
//
//
//        Button btn_graduation = (Button)findViewById(R.id.btn_graduation);
//        btn_graduation.setOnClickListener(new ButtonListener());
    }

//    public class ButtonListener implements View.OnClickListener{
//        @Override
//            public void onClick(View view) {
//                switch(view.getId()){
//                    case R.id.btn_movie:
//                        Toast.makeText(MainActivity.this, "热门电影", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.btn_news:
//                        Toast.makeText(MainActivity.this, "最新闻", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.btn_reader:
//                        Toast.makeText(MainActivity.this, "XYZ阅读器", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.btn_shares:
//                        Toast.makeText(MainActivity.this, "股票雄鹰", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.btn_graduation:
//                        Toast.makeText(MainActivity.this, "毕业设计", Toast.LENGTH_SHORT).show();
//                        break;
//                    default:
//                        break;
//                }
//            }
//        }

        public void ListenButtonSelf(View view){
          switch(view.getId()){
              case R.id.btn_reader:
                  Toast.makeText(MainActivity.this, "XYZ阅读器", Toast.LENGTH_SHORT).show();
                  break;
              case R.id.btn_movie:
                  Toast.makeText(MainActivity.this, "热门电影", Toast.LENGTH_SHORT).show();
                  break;
              case R.id.btn_news:
                  Toast.makeText(MainActivity.this, "最新闻", Toast.LENGTH_SHORT).show();
                  break;
              case R.id.btn_shares:
                  Toast.makeText(MainActivity.this, "股票雄鹰", Toast.LENGTH_SHORT).show();
                  break;
              case R.id.btn_graduation:
                  Toast.makeText(MainActivity.this, "毕业设计", Toast.LENGTH_SHORT).show();
                  break;
              default:
                  break;

          }
        }
    }
