package hw02.student;

public class Student {
    private int id;
    private String surname;
    private String name;
    private String midname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String address;
    private String phone;
    private String faculty;
    private int yearOfStudy;
    private String group;

    public Student(int id, String surname, String name, String midname, int birthDay, int birthMonth, int birthYear, String address, String phone, String faculty, int yearOfStudy, String group) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.midname = midname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMidname() {
        return midname;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + surname +
                ' ' + name +
                ' ' + group +
                '}';
    }
}
