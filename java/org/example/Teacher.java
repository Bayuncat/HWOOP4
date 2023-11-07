package org.example;

public class Teacher extends User implements Comparable<Teacher>{


    private Long teacherId;

    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    public Long getStudentId() {
        return teacherId;
    }

    public void setStudentId(Long studentId) {
        this.teacherId = teacherId;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.teacherId.compareTo(o.teacherId);
    }
}
