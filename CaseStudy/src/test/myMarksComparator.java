package test;

import java.util.Comparator;

public class myMarksComparator implements Comparator<students> {

    @Override
    public int compare(students o1, students o2) {
        return o1.getMarks()-o2.getMarks();
    }
}
