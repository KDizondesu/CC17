package com.example.cc17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private JobAdapter jobAdapter;
    private List<Job> jobList;
    private LinearLayout jobListLayout, jobDetailLayout;
    private TextView jobTitle, jobDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        jobListLayout = findViewById(R.id.jobListLayout);
        jobDetailLayout = findViewById(R.id.jobDetailLayout);
        jobTitle = findViewById(R.id.jobTitle);
        jobDescription = findViewById(R.id.jobDescription);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        jobList = new ArrayList<>();
        populateJobList();

        jobAdapter = new JobAdapter(jobList, job -> showJobDetails(job));
        recyclerView.setAdapter(jobAdapter);
    }

    private void populateJobList() {
        jobList.add(new Job("Software Engineer", "Develop and maintain software applications."));
        jobList.add(new Job("Data Analyst", "Analyze and interpret complex data."));
        jobList.add(new Job("Product Manager", "Oversee product development and marketing."));
        // Add more job listings here
    }

    private void showJobDetails(Job job) {
        jobListLayout.setVisibility(View.GONE);
        jobDetailLayout.setVisibility(View.VISIBLE);
        jobTitle.setText(job.getTitle());
        jobDescription.setText(job.getDescription());
    }

    @Override
    public void onBackPressed() {
        if (jobDetailLayout.getVisibility() == View.VISIBLE) {
            jobDetailLayout.setVisibility(View.GONE);
            jobListLayout.setVisibility(View.VISIBLE);
        } else {
            super.onBackPressed();
        }
    }
}
