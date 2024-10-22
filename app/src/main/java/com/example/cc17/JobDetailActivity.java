package com.example.cc17;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class JobDetailActivity extends AppCompatActivity {

    private TextView jobTitle, jobDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_detail);

        jobTitle = findViewById(R.id.jobTitle);
        jobDescription = findViewById(R.id.jobDescription);

        String title = getIntent().getStringExtra("job_title");
        String description = getIntent().getStringExtra("job_description");

        jobTitle.setText(title);
        jobDescription.setText(description);
    }
}