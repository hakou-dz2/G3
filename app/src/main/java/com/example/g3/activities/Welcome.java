package com.example.g3.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.g3.R;
import com.example.g3.adapters.StudentAdapter;
import com.example.g3.structure.Student;

import java.util.ArrayList;
import java.util.List;

public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_welcome);

        TextView welcome = findViewById(R.id.tv_welcome);

        Intent intent = getIntent();

        welcome.setText(" Welcome "+ intent.getStringExtra("username"));

        RecyclerView rvStudent = findViewById(R.id.rvStudent);

        List<Student> students = new ArrayList<>();
        for(int i = 0 ; i < 10; i++){
            Student s = new Student("Student"+i,"Lastname"+i,"Group"+i);
            students.add(s);
        }

        StudentAdapter adapter = new StudentAdapter(students);

        rvStudent.setAdapter(adapter);
        rvStudent.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this));
    }
}