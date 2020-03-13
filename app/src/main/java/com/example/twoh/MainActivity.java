package com.example.twoh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Intent : Form");

        final EditText etData1 = (EditText) findViewById(R.id.et_data1);
        final EditText etData2 = (EditText) findViewById(R.id.et_data2);
        final EditText etData3 = (EditText) findViewById(R.id.et_data3);
        final EditText etData4 = (EditText) findViewById(R.id.et_data4);
        final RadioGroup etData5 = (RadioGroup) findViewById(R.id.jk);
        final Spinner agm = (Spinner) findViewById(R.id.agama);

        Button btSubmit = (Button) findViewById(R.id.bt_submit);
        ImageButton btProfile = (ImageButton) findViewById(R.id.bt_tentang);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String jeniskelamin;

                int pilih = etData5.getCheckedRadioButtonId();
                RadioButton radioBut = findViewById(pilih);
                jeniskelamin = radioBut.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("data1", etData1.getText().toString());
                bundle.putString("data2", etData2.getText().toString());
                bundle.putString("data3", etData3.getText().toString());
                bundle.putString("data4", etData4.getText().toString());
                bundle.putString("data5", jeniskelamin);
                bundle.putString("data6", agm.getSelectedItem().toString());

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        btProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Profile.class);
                startActivity(intent);
            }
        });
/*       btSubmitIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                 *Passing data via Intent


                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("data1", etData1.getText().toString());
                intent.putExtra("data2", etData2.getText().toString());
                intent.putExtra("data3", etData3.getText().toString());
                intent.putExtra("data4", etData4.getText().toString());
                intent.putExtra("data5", etData5.getText().toString());
                intent.putExtra("data6", agm.getSelectedItem().toString());
                startActivity(intent);
            }
        }); */
    }
}
