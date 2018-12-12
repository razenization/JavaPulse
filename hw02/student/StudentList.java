package hw02.student;

import java.util.Arrays;

public class StudentList {

    private Student[] students;
    private int counter;

    public StudentList() {
        students = new Student[3];
        counter = -1;
    }

    public void add(Student stud) {
        if (counter == students.length - 1) {
            Student[] temp = Arrays.copyOf(students, students.length * 2);
            students = temp;
        }
        students[++counter] = stud;
    }

    public Student get(int i) {
        if (i < size())
            return students[i];
        else return null;
    }

    public int size() {
        return counter + 1;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(students[i]);
        }
    }

    public void update(int i, Student stud) {
        if (i < size())
            students[i] = stud;
    }

    /*public boolean isUniqueFac(String fac) {
        for (int i = 0; i < size(); i++) {
            if (fac.equals(students[i].getFaculty())){
                counter++;
            }
            if (counter > 1){
                return false;
            }
        }
        return true;
    }*/

    public StudentList studsByFac(String faculty) {
        StudentList resStuds = new StudentList();
        for (int i = 0; i < size(); i++) {
            if (students[i].getFaculty().equals(faculty)) {
                resStuds.add(students[i]);
            }
        }
        return resStuds;
    }

    public StudentList bornAfter(int year) {
        StudentList bornList = new StudentList();
        for (int i = 0; i < size(); i++) {
            if (year < students[i].getBirthYear()){
                bornList.add(students[i]);
            }
        }
        return bornList;
    }

    public StudentList getByGroup(String group) {
        StudentList groupList = new StudentList();
        for (int i = 0; i < size(); i++) {
            if (group.equals(students[i].getGroup())){
                groupList.add(students[i]);
            }
        }
        return groupList;
    }

    public StudentList getByFac(String fac) {
        StudentList facList = new StudentList();
        for (int i = 0; i < size(); i++) {
            if (fac.equals(students[i].getFaculty())){
                facList.add(students[i]);
            }
        }
        return facList;
    }

    public StudentList getByYear(int currentYear) {
        StudentList yearList = new StudentList();
        for (int i = 0; i < size(); i++) {
            if (currentYear == students[i].getYearOfStudy()){
                yearList.add(students[i]);
            }
        }
        return yearList;
    }

    public void allStudents() {
        StudentListList resStuds = new StudentListList();
        int iteration = 0;
        boolean flag = true;
        String[] checkedFacs = new String[size()];
        for (int j = 0; j < size(); j++) {
            StudentList tempStuds = new StudentList();
            String currentFac = students[j].getFaculty();
            for (int i = 0; i < iteration; i++) {
                if (checkedFacs[i].equals(currentFac)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (int i = j; i < size(); i++) {
                    if (students[i].getFaculty().equals(currentFac)) {
                        tempStuds.add(students[i]);
                    }
                }
                resStuds.add(tempStuds);
                checkedFacs[iteration] = currentFac;
                iteration++;
            }
            flag = true;
        }
        for (int i = 0; i < resStuds.size(); i++) {
            System.out.println(resStuds.get(i).get(0).getFaculty());
            System.out.println(resStuds.get(i));
        }
    }

    @Override
    public String toString() {
        String out = "";
        for (Student stud : students) {
            if (stud != null)
                if (out.equals(""))
                    out = out + stud;
                else out = out + ", " + stud;
        }
        return out;
    }
}