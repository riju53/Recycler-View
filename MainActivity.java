package com.example.rijunath.recyclerviewdemo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String arr[]={"A","b","c","d","e"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager layoutManager=new LinearLayoutManager(MainActivity.this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(new Myadp());
    }
    public class Myholder extends RecyclerView.ViewHolder{
        TextView tv;
        public Myholder(View itemView) {
            super(itemView);
            tv=(TextView)itemView.findViewById(R.id.tv);
        }
    }
    public class Myadp extends RecyclerView.Adapter<Myholder>{

        @Override
        public Myholder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inf=getLayoutInflater();
            View v=inf.inflate(R.layout.row, parent, false);
            Myholder holder=new Myholder(v);
            return holder;
        }

        @Override
        public void onBindViewHolder(Myholder holder, int position) {
            holder.tv.setText(arr[position]);
        }

        @Override
        public int getItemCount() {
            return arr.length;
        }
    }
}
