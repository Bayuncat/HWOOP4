package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{

    private List<StudentGroup> stream;

    public void addGroup(StudentGroup studentGroup){
        stream.add(studentGroup);
    }

    public List<StudentGroup> getStudentGroupList() {
        return stream;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return stream.iterator();
    }

}
