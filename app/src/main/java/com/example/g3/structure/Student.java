package com.example.g3.structure;


import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Student {
    @PrimaryKey(autoGenerate = true)
    int id;

    String name;
    String lastname;
    String group;
    @Embedded(prefix = "add_")
    Address address;

    public Student(int id, String name, String lastname, String group) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.group = group;
    }
@Ignore
    public Student(String name, String lastname, String group) {
        this.name = name;
        this.lastname = lastname;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}
