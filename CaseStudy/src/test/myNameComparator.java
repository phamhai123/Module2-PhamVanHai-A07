package test;

import java.util.Comparator;

public class myNameComparator implements Comparator<students> {
    @Override
    public int compare(students o1, students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
