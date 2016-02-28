package com.example.test_life_activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.toi_tieu_de.myapplicationexam.R;

/**
 * Created by Toi_Tieu_De on 2/24/2016.
 */
public class Activity2 extends Activity {
    Button btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aactivity2_test_life);
        Toast.makeText(this.getApplicationContext(), "onCreate2()", Toast.LENGTH_LONG).show();
        btn_Back = (Button) findViewById(R.id.btn_Back);
        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder b = new AlertDialog.Builder(Activity2.this);
                //b.setIcon(R.drawable.anh_3);
                b.setTitle("Exist");
                b.setMessage("Ban co muon thoat khong?");
                b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                });
                b.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                b.create().show();


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this.getApplicationContext(), "onStart2()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this.getApplicationContext(), "onResume2()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this.getApplicationContext(), "onPause2()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this.getApplicationContext(), "onStop2()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this.getApplicationContext(), "onRestart2()", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this.getApplicationContext(), "onDestroy2()", Toast.LENGTH_LONG).show();
    }
}
