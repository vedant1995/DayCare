package Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teacher extends AbstractPerson {

    private int Id;
    private int Age;
    //private String Name;
    private String LastName;
    private String FirstName;
    private Double Wage;
    private List<Student> StudentList = new ArrayList<>();
    private int count = 0;
    private int size;

    public Double getWage() {
        return Wage;
    }

    public void setWage(Double Wage) {
        this.Wage = Wage;
    }

    public List<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(List<Student> StudentList) {
        this.StudentList = StudentList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Teacher(int id, int size, String firstName, String lastName, int age) {
        this.Id = id;
        this.size = size;
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Age = age;

    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return Id;
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        this.Id = id;
    }

    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub
        this.Age = age;
    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return Age;
    }

    @Override
    public String getFirstName() {
        return FirstName;
    }

    @Override
    public String getLastName() {
        return LastName;
    }

//    @Override
//    public void setName(String name) {
//        // TODO Auto-generated method stub
//
//    }
//    @Override
//    public String getName() {
//        // TODO Auto-generated method stub
//        return null;
//    }
//
    public void addStudent(Student s) {
        StudentList.add(s);
        s.setTid(this.Id);
        count++;
    }

    public boolean isEmpty() {
        return count < size;
    }

    public void showStudents() {
        if (!StudentList.isEmpty()) {
            for (Student s : StudentList) {
                System.out.println(s.getFirstName());
            }

        }

    }

    @Override
    public String toString() {
        return "Teacher{" + "Id=" + Id + ", Age=" + Age + ", LastName=" + LastName + ", FirstName=" + FirstName + ", Wage=" + Wage + ", count=" + count + ", size=" + size + '}';
    }
}
