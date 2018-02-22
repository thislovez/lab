package com.example.com.alongkot;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Alongkot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alongkot);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
        Button btn_ans;   //ลิ้งคฺ์ ประกาศตัวแปลเป็นชนิด button ชื่อ btn_ans
        btn_ans = (Button) findViewById(R.id. btn_ans); //ให้ button ชี้ไปยัง id ของหน้า activity_alongkot
        btn_ans.setOnClickListener(new View.OnClickListener(){ //เมื่อคลิกที่ปุ่มก็ link ไปยังอีกหน้า
            @Override
            public void onClick(View v) {
                Intent t12 = new Intent(getApplicationContext(), AlongKot2.class);//ให้ link ไปยังหน้า AlongKot2.class
                startActivity(t12);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_alongkot, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

}
