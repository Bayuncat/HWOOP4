package org.example;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return Integer.compare(o1.getNum(), o2.getNum());
    }
}
