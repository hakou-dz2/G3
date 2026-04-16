package com.example.g3.structure;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Teacher {
    @PrimaryKey(autoGenerate = true)
    int id;
    String name;
    String course;

    public Teacher(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
