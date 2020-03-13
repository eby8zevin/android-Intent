package com.example.twoh;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle("Welcome to Rastafara");

        TextView tvData1 = (TextView) findViewById(R.id.tv_data1);
        TextView tvData2 = (TextView) findViewById(R.id.tv_data2);
        TextView tvData3 = (TextView) findViewById(R.id.tv_data3);
        TextView tvData4 = (TextView) findViewById(R.id.tv_data4);
        TextView tvData5 = (TextView) findViewById(R.id.tv_data5);
        TextView tvData6 = (TextView) findViewById(R.id.tv_data6);

        if(getIntent().getExtras()!=null){

            Bundle bundle = getIntent().getExtras();
            tvData1.setText(bundle.getString("data1"));
            tvData2.setText(bundle.getString("data2"));
            tvData3.setText(bundle.getString("data3"));
            tvData4.setText(bundle.getString("data4"));
            tvData5.setText(bundle.getString("data5"));
            tvData6.setText(bundle.getString("data6"));
        }else{

            tvData1.setText(getIntent().getStringExtra("data1"));
            tvData2.setText(getIntent().getStringExtra("data2"));
            tvData3.setText(getIntent().getStringExtra("data3"));
            tvData4.setText(getIntent().getStringExtra("data4"));
            tvData5.setText(getIntent().getStringExtra("data5"));
            tvData6.setText(getIntent().getStringExtra("data6"));
        }
    }
}
