package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TeacherService {

    private List<Teacher> teacherList;

    public TeacherService() {
        teacherList = new ArrayList<Teacher>();
    }

    public void createTeacher (String firstName, String lastName, String middleName){
        Teacher teacher = new Teacher(firstName, lastName, middleName);
        teacherList.add(teacher);

    }

    public void editTeacher (int index, String firstName, String lastName, String middleName){
        Teacher teacher = teacherList.get(index);
        teacher.setFirstName(firstName);
        teacher.setLastName(lastName);
        teacher.setMiddleName(middleName);

    }



    public List<Teacher> printTeacherList(){
        return teacherList;
    }


}