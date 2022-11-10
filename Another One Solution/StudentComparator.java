import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



class StudentComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getCgpa() > s2.getCgpa()) {
            return -1;
        }
        if (s1.getCgpa() < s2.getCgpa()) {
            return 1;
        }
        if (s1.getFname().compareTo(s2.getFname()) < 0) {
            return -1;
        }
        if (s1.getFname().compareTo(s2.getFname()) > 0) {
            return 1;
        }
        if (s1.getToken() < s2.getToken()) {
            return -1;
        }
        if (s1.getToken() > s2.getToken()) {
            return 1;
        }
        return 0;
    }
}