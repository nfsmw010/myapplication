package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private String TAG = "SecondActivity";
    private TextView second_temper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        second_temper = findViewById(R.id.second_temper);

        Weather.RecordsBean.LocationBean.WeatherElementBean.TimeBean timeBean = (Weather.RecordsBean.LocationBean.WeatherElementBean.TimeBean) getIntent().getSerializableExtra("data");

        Log.d(TAG, timeBean.getStartTime() + " got data");

        second_temper.setText(String.format(getResources().getString(R.string.temper)
                , timeBean.getStartTime(), timeBean.getEndTime()
                , timeBean.getParameter().getParameterName()
                , timeBean.getParameter().getParameterUnit()));
    }
}
