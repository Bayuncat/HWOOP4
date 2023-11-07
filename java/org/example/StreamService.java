package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {

    private Stream stream;

    public List<StudentGroup> getSortedStudentBySize() {
        List<StudentGroup> studentGroupList = new ArrayList<>(stream.getStudentGroupList());
        studentGroupList.sort(new StreamComparator());
        return studentGroupList;
    }
}
