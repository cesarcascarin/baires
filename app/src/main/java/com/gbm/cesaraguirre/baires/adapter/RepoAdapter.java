package com.gbm.cesaraguirre.baires.adapter;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.gbm.cesaraguirre.baires.R;
import com.gbm.cesaraguirre.baires.Repo;

import java.util.List;

public class RepoAdapter extends RecyclerView.Adapter<RepoAdapter.MyViewHolder> {

    List<Repo> myDataset;

    public RepoAdapter(List<Repo> repo) {
        myDataset = repo;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, final int i) {
        TextView v = new TextView(parent.getContext());
        v.setText(myDataset.get(i).getName());

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int i) {
        myViewHolder.mTextView.setText(myDataset.get(i).getName());

        myViewHolder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String url = myDataset.get(i).getHtml_url();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                myViewHolder.mTextView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return myDataset.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView mTextView;
        public MyViewHolder(TextView v) {
            super(v);
            mTextView = v;
        }
    }

}
