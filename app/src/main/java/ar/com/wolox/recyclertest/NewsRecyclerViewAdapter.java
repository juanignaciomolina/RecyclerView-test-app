package ar.com.wolox.recyclertest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.android.wolox.woloxcommons.recycler.RecyclerAdapter;

public class NewsRecyclerViewAdapter extends RecyclerAdapter<RowNews> {

    private NewsRowViewHolder mNewsRowViewHolder;

    public NewsRecyclerViewAdapter(RowNews item) {
        super(item);
    }

    // Create new views (invoked by Wolox's RecyclerAdapter)
    public RecyclerView.ViewHolder recyclerOnCreateViewHolder(
            ViewGroup parent,
            int viewType) {

        View itemLayoutView;
        itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_news, null);
        return new NewsRowViewHolder(itemLayoutView);
    }

    // Replace the contents of a view (invoked by Wolox's RecyclerAdapter)
    public void recyclerOnBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        mNewsRowViewHolder = (NewsRowViewHolder) viewHolder;
        mNewsRowViewHolder.mTitle.setText(getItems().get(position).getTitle());
        mNewsRowViewHolder.mContent.setText(getItems().get(position).getContent());
        mNewsRowViewHolder.mDate.setText(getItems().get(position).getDate());
    }
}