package hw02.student;

public class Program {
    public static void main(String[] args) {
        StudentList students = new StudentList();
        students.add(new Student(1, "Mysak", "Alex", "K", 26, 12, 2000, "Bul-K 11-A", "099-380-22-52", "FICT", 1, "IB-81"));
        students.add(new Student(2, "Parfeniuk", "Andrew", "A", 6, 4, 2001, "Artema 52", "068-768-04-16", "EAA", 1, "W-21"));
        students.add(new Student(3, "YEA", "BITCH", "F", 9, 9, 2000, "Bul-K 11-A", "099-380-22-52", "FICT", 2, "IB-81"));
        students.allStudents();
        System.out.println(students.bornAfter(2000));
        System.out.println(students.getByGroup("IB-81"));
        System.out.println(students.getByFac("EAA"));
        System.out.println(students.getByYear(2));
    }
}