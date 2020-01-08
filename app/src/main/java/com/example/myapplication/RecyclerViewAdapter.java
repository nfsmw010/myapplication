package com.example.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private Context mContext;
    private Weather mData;
    private Weather.RecordsBean.LocationBean.WeatherElementBean mydata;
    private List<Weather.RecordsBean.LocationBean.WeatherElementBean.TimeBean> time;

    RecyclerViewAdapter(Context context, Weather data) {
        mContext = context;
        mData = data;

        List<Weather.RecordsBean.LocationBean> location = mData.getRecords().getLocation();
        List<Weather.RecordsBean.LocationBean.WeatherElementBean> weatherElements = location.get(0).getWeatherElement();


        for (int i = 0; i < weatherElements.size(); i++) {
            if (weatherElements.get(i).getElementName().equals("MinT")) {
                mydata = weatherElements.get(i);
                break;
            }
        }

        time = mydata.getTime();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView minT;

        ViewHolder(View view) {
            super(view);
            img = view.findViewById(R.id.img);
            minT = view.findViewById(R.id.minT);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.recyclerview_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        if (position % 2 != 0) {
            holder.img.setVisibility(View.VISIBLE);
            holder.minT.setVisibility(View.GONE);
        } else {
            holder.minT.setText(String.format(mContext.getResources().getString(R.string.temper)
                    , time.get(position / 2).getStartTime(), time.get(position / 2).getEndTime()
                    , time.get(position / 2).getParameter().getParameterName()
                    , time.get(position / 2).getParameter().getParameterUnit()));
        }

        holder.minT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, SecondActivity.class);
                intent.putExtra("data", time.get(position / 2));
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return time.size() * 2;
    }
}
