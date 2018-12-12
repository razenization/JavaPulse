package hw02.student;

import java.util.Arrays;

public class StudentListList {

    private StudentList[] studentlists;
    private int counter;

    public StudentListList() {
        studentlists = new StudentList[3];
        counter = -1;
    }

    public void add(StudentList studs) {
        if (counter == studentlists.length - 1) {
            StudentList[] temp = Arrays.copyOf(studentlists, studentlists.length * 2);
            studentlists = temp;
        }
        studentlists[++counter] = studs;
    }

    public StudentList get(int i) {
        if (i < size())
            return studentlists[i];
        else return null;
    }

    public int size() {
        return counter + 1;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(studentlists[i]);
        }
    }

    public void update(int i, StudentList c) {
        if (i < size())
            studentlists[i] = c;
    }
}