package com.example.g3.Databases;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.g3.daos.StudentDao;
import com.example.g3.daos.TeacherDao;
import com.example.g3.structure.Student;
import com.example.g3.structure.Teacher;

@Database(entities = {Student.class, Teacher.class}, version = 2)
public abstract class StudentDatabase extends RoomDatabase {
    public static StudentDatabase stDatabase;

    public abstract StudentDao stDao();
    public abstract TeacherDao thDao();

    public static synchronized StudentDatabase getInstance(Context context) {
        if (stDatabase == null) {
            stDatabase = Room.databaseBuilder(context.getApplicationContext(),
                            StudentDatabase.class, "Database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return stDatabase;
    }
}
