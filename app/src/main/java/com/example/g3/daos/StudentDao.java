package com.example.g3.daos;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.g3.structure.Student;

import java.util.List;

@Dao
public interface StudentDao {

    @Insert
    void insert(Student student);

    @Query("SELECT * FROM Student")
    List<Student> getAllStudents();
}
