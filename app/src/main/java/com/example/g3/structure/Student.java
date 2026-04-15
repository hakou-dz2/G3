package com.example.g3.structure;

public class Student {
    String Name, Lastname, Group;

    public Student(String name, String lastname, String group) {
        Name = name;
        Lastname = lastname;
        Group = group;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getGroup() {
        return Group;
    }

    public void setGroup(String group) {
        Group = group;
    }
}
