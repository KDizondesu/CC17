package com.example.cc17;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerViewFeed;
    private List<Post> postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_home);

        recyclerViewFeed = findViewById(R.id.recyclerViewFeed);
        recyclerViewFeed.setLayoutManager(new LinearLayoutManager(this));

        // Sample Data
        postList = new ArrayList<>();
        postList.add(new Post("How to Make Money as a Voice Actor", "Steven Yeun", "Follow these tips...", R.drawable.ic_placeholder_image));
        postList.add(new Post("Tips on How To Get Hired on HYRE", "Mike Ehrmantraut", "Make your profile look professional...", R.drawable.ic_placeholder_image));
        postList.add(new Post("Becoming a Professional Chef", "Eduardo Salamanca", "Pursue culinary success...", R.drawable.ic_placeholder_image));

        FeedAdapter adapter = new FeedAdapter(postList);
        recyclerViewFeed.setAdapter(adapter);
    }
}
