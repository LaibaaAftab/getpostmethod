package com.example.assignmentgetpost;

public class Guest {
    private String firstName;
    private String id;
    private int age;
    Guest()
    {
        firstName = "";
        id="";
        age = 0;
    }

    Guest(String s,String i,int a)
    {
        firstName = s;
        id=i;
        age = a;
    }
    void setFirstName(String s)
    {
        firstName = s;
    }
    void setId(String i)
    {
        id = i;
    }
    void setAge(int a)
    {
        age = a;
    }
    String getFirstName()
    {
        return firstName;
    }
    String getId()
    {
        return id;
    }
    int getAge()
    {
        return age;
    }

    @Override
    public String toString()
    {
        return "Name: "+firstName+" Id: "+id+" Age: "+age;
    }
}
