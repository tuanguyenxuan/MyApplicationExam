package com.example.toi_tieu_de.myapplicationexam;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.test_life_activity.Activity2;
import com.example.test_life_activity.Activity3;
import com.example.toi_tieu_de.myapplicationexam.R;

/**
 * Created by Toi_Tieu_De on 2/24/2016.
 */
public class Main_Test_Activity_Life extends Activity {
    Button btn_next_activity2, btn_next_activity3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test_life);
        Toast.makeText(getApplicationContext(), "onCreate1()", Toast.LENGTH_LONG).show();
        btn_next_activity2 = (Button) findViewById(R.id.btn_activity2);
        btn_next_activity3 = (Button) findViewById(R.id.btn_activity3);
        btn_next_activity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Goi den thang Activity2 de hien thi no len
                Intent intent = new Intent(getApplicationContext(), Activity2.class);
                startActivity(intent);
            }
        });
        btn_next_activity3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent _intent = new Intent(getApplicationContext(), Activity3.class);
                startActivity(_intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this.getApplicationContext(), "onStart1()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this.getApplicationContext(), "onResume1()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this.getApplicationContext(), "onPause1()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this.getApplicationContext(), "onStop1()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this.getApplicationContext(), "onRestart1()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this.getApplicationContext(), "onDestroy1()", Toast.LENGTH_LONG).show();
    }
}
