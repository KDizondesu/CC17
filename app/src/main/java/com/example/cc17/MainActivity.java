package com.example.cc17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] jobTitles = {
            "Software Engineer",
            "Data Analyst",
            "Product Manager",
            "UX Designer",
            "Project Coordinator"
    };

    private String[] jobDescriptions = {
            "Develop and maintain software applications.",
            "Analyze and interpret complex data to support decision-making.",
            "Manage the product lifecycle from conception to launch.",
            "Design user interfaces for software products.",
            "Coordinate project tasks and milestones."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        // Set up adapter for the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, jobTitles);
        listView.setAdapter(adapter);

        // Set up item click listener for the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, JobDetailActivity.class);
                intent.putExtra("job_title", jobTitles[position]);
                intent.putExtra("job_description", jobDescriptions[position]);
                startActivity(intent);
            }
        });
    }
}
