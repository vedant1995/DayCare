package neu.edu.csye6200;

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






    public Teacher(int id ){
        this.Id = id;

    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub

    }

    @Override
    public void setAge(int age) {
        // TODO Auto-generated method stub

    }

    @Override
    public int getAge() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
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
    public void addStudent(Student s){
        StudentList.add(s);
        s.setTid(this.Id);
        count++;
    }

    public boolean isEmpty(){
        return count < size;
    }
}

