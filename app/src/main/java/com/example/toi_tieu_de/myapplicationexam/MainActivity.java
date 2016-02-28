package com.example.toi_tieu_de.myapplicationexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView list_view_comic;
    int[] arr_img =new int[]{
            R.drawable.anh_1,R.drawable.anh_2,
            R.drawable.anh_3,R.drawable.anh_4,
            R.drawable.anh_5,R.drawable.anh_6,
            R.drawable.anh_7,R.drawable.anh_8,
            R.drawable.anh_9,R.drawable.anh_10,
    };
    String[] arr_title_comic;
    String[] arr_rating_comic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view_comic = (ListView)findViewById(R.id.list_view);
        arr_title_comic = getResources().getStringArray(R.array.name_title_comic);
        arr_rating_comic = getResources().getStringArray(R.array.comic_rating);
        for (int i = 0;i<arr_title_comic.length;i++) {
            System.out.println("ten "+arr_title_comic[i]);
        }

    }
}
