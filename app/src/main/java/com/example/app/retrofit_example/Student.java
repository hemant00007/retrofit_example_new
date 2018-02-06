package com.example.app.retrofit_example;

public class Student {
    private int StudentId;
    private String StudentName;
    private String StudentMarks;

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public void setStudentMarks(String studentMarks) {
        StudentMarks = studentMarks;
    }

    public int getStudentId() {
        return StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public String getStudentMarks() {
        return StudentMarks;
    }
}
