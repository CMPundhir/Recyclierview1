package com.lovish.recyclierview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.lovish.recyclierview.model.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Data> list = new ArrayList<>();
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler);

        Data d1 = new Data("Facebook","time waste",R.drawable.fb);
        list.add(d1);
        Data d2 = new Data("Instagram","time waste",R.drawable.insta);
        list.add(d2);
        Data d3 = new Data("Snapchat","time waste",R.drawable.snap);
        list.add(d3);
        Data d4 = new Data("Twiter","time waste",R.drawable.twiter);
        list.add(d4);
        Data d5= new Data("youtube","useful",R.drawable.youtube);
        list.add(d5);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = getLayoutInflater().inflate(R.layout.design,parent,false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Data data = list.get(position);
            holder.title.setText(data.getTitle());
            holder.subTitle.setText(data.getSubtitle());
            holder.img.setImageDrawable(getDrawable(data.getImg()));
        }

        @Override
        public int getItemCount() {
            return list.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView title,subTitle;
            ImageView img;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                title = itemView.findViewById(R.id.titles);
                subTitle = itemView.findViewById(R.id.subtitles);
                img = itemView.findViewById(R.id.imageView);
            }
        }
    }
}
