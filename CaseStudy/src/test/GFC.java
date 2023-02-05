package test;

import java.util.TreeSet;

public class GFC {
    public static void main (String[] args){

        // Creating the TreeSet with Comparator object passed
        // as the parameter which will sort the user defined
        // objects of TreeSet
        TreeSet<students> set = new TreeSet<students>(new myMarksComparator());

        set.add(new students(450,"Sam"));
        set.add(new students(341,"Ronaldo"));
        set.add(new students(134,"Daniel"));
        set.add(new students(590,"George"));

        System.out.println("increasing Order with the Marks");

        // Printing the TreeSet elements
        for(students ele: set)
        {
            System.out.print(ele.getName()+" "+ele.getMarks());
            System.out.println();
        }


        TreeSet<students> mrks= new TreeSet<students>(new myNameComparator());

        mrks.add(new students(450,"Sam"));
        mrks.add(new students(341,"Ronaldo"));
        mrks.add(new students(134,"Daniel"));
        mrks.add(new students(590,"George"));

        System.out.println();

        for(students ele : mrks)
        {
            System.out.print(ele.getName() +" "+ ele.getMarks());
            System.out.println();
        }

    }
}
