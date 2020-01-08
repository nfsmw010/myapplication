package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String Tag = "MainActivity";
    private Call<Weather> call;
    private Weather mData;
    private RecyclerViewAdapter mRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetAPI mGetAPI = RetrofitManager.getInstance().getAPI();
        call = mGetAPI.getWeatherInfo();

        call.enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                mData = response.body();
                initView();
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

                Log.d(Tag, t.toString());
            }
        });
    }

    private void initView() {
        RecyclerView mRecyclerView = findViewById(R.id.recycler_view);

        mRecyclerViewAdapter = new RecyclerViewAdapter(this, mData);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(mRecyclerViewAdapter);


        if (getSharedPreferences("RETURN", MODE_PRIVATE).getBoolean("BACK", false)) {
            Toast.makeText(this, "歡迎回來", Toast.LENGTH_SHORT).show();
            getSharedPreferences("RETURN", MODE_PRIVATE).edit().putBoolean("BACK", false).apply();
        } else {
            getSharedPreferences("RETURN", MODE_PRIVATE).edit().putBoolean("BACK", true).apply();
        }

    }
}
