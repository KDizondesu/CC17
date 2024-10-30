package com.example.cc17;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedViewHolder> {

    private List<Post> postList;

    public FeedAdapter(List<Post> postList) {
        this.postList = postList;
    }

    @NonNull
    @Override
    public FeedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new FeedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FeedViewHolder holder, int position) {
        Post post = postList.get(position);
        holder.title.setText(post.getTitle());
        holder.author.setText(post.getAuthor());
        holder.description.setText(post.getDescription());
        holder.image.setImageResource(post.getImageResource());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    class FeedViewHolder extends RecyclerView.ViewHolder {
        TextView title, author, description;
        ImageView image;

        FeedViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.postTitle);
            author = itemView.findViewById(R.id.authorName);
            description = itemView.findViewById(R.id.postDescription);
            image = itemView.findViewById(R.id.postImage);
        }
    }
}
