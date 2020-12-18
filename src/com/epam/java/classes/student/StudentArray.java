package com.epam.java.classes.student;

import java.util.Date;

public class StudentArray {

    private final Student[] studentArr;

    public StudentArray(Student[] studentArr) {
        this.studentArr = studentArr;
    }

    public Student[] filterByFaculty(String faculty) {
        Student[] facultyStudents = new Student[studentArr.length];
        int index = 0;
        for (Student s : studentArr) {
            if (s.getFaculty().equals(faculty)) {
                facultyStudents[index] = s;
            }
            index++;
        }
        return facultyStudents;
    }

    public Student[] filterByFacultyAndCourse(String faculty, int course) {
        Student[] facultyCourseStudents = new Student[studentArr.length];
        int index = 0;
        for (Student s : studentArr) {
            if (s.getFaculty().equals(faculty) && s.getCourse() == course) {
                facultyCourseStudents[index] = s;
            }
            index++;
        }
        return facultyCourseStudents;
    }

    public Student[] filterByDate(Date date) {
        Student[] facultyCourseStudents = new Student[studentArr.length];
        int index = 0;
        for (Student s : studentArr) {
            if (s.getBirthDate().after(date)) {
                facultyCourseStudents[index] = s;
            }
            index++;
        }
        return facultyCourseStudents;
    }

    public Student[] filterByGroup(String group) {
        Student[] facultyCourseStudents = new Student[studentArr.length];
        int index = 0;
        for (Student s : studentArr) {
            if (s.getGroup().equals(group)) {
                facultyCourseStudents[index] = s;
            }
            index++;
        }
        return facultyCourseStudents;
    }
}
