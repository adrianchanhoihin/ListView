package com.example.sdg.listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] name = {"Chan Chak Long", "Chan Chun Hin", "Chan Hoi Hin", "Chan Hoi Ming", "Char Yuk Hay"};
        String[] status = {"Hi", "Bye", "#Dioceasan", "123", "000"};
        String[] DOB = {"5/6", "2/7", "24/5", "1/4", "7/7"};
        int[] grade = {7, 8, 9, 10, 11};
        boolean[] sex = {true, true, true, false, true};

        Student students[] = new Student[5];

        Student stemp;
        for (int i = 0; i < 5; i++) {
            stemp = new Student();


            stemp.setName(name[i]);
            stemp.setDOB(DOB[i]);
            stemp.setGrade(grade[i]);
            stemp.setBoy(sex[i]);
            stemp.setStatus(status[i]);

            students[i] = stemp;
        }


        ListView view_list = (ListView) findViewById(R.id.view_list);
        view_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
            }
        });
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, students);


        view_list.setAdapter(adapter);


    }
}
