package neu.edu.csye6200;

import java.time.LocalDate;
import java.util.Scanner;
import neu.edu.csye6200.AbstractPerson;

public class Student extends AbstractPerson {
    private int Id;
    private int Age;
    private String FirstName;
    private String LastName;
    private int TeacherId;
    private LocalDate ImuDate;
    private double GPA;
    private boolean NeedRenew;
    private int ClassId;



    public Student(String csv) {
        Scanner sc = new Scanner(csv);
        sc.useDelimiter(",");
        try {
            this.Id = sc.nextInt();
            this.Age = sc.nextInt();
            this.FirstName = sc.next();
            this.LastName = sc.next();
            this.ImuDate = LocalDate.parse(sc.next());




        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return this.Id;
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub

    }


    public void setAge(int age) {
        // TODO Auto-generated method stub
    }


    public int getAge() {
        // TODO Auto-generated method stub
        return this.Age;
    }

//    @Override
//    public void setName(String name) {
//
//    }

    public void setClassId(int cid){
        this.ClassId = cid;
    }

    public void setFirstName(String firstName) {
        // TODO Auto-generated method stub

    }


    public String getFirstName() {
        // TODO Auto-generated method stub
        return this.FirstName;
    }

    @Override
    public String getLastName() {
        return this.LastName;
    }

    public void setTid(int tid){
        this.TeacherId = tid;
    }

    public void checkRenew(){
        NeedRenew = ImuDate.isBefore(LocalDate.now().minusYears(1L));
    }
    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Age=" + Age +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", TeacherId=" + TeacherId +
                ", ClassRoomId=" + ClassId +
                ", ImuDate=" + ImuDate +
                ", NeedRenew=" + NeedRenew +
                '}';
    }
}
