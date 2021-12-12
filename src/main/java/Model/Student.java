package Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends AbstractPerson {

    private int Id;
    private int Age;
    private String FirstName;
    private String LastName;
    private int TeacherId;
    private LocalDate LastRegDate;
    private LocalDate ExpectReNewDate;
    private double GPA;
    private boolean NeedRenew;
    private int ClassId;
    private List<Vax> VaxList = new ArrayList<>();

    public Student(String csv) {
        String[] item = csv.split(",");
        this.Id = Integer.parseInt(item[0]);
        this.Age = Integer.parseInt(item[1]);
        this.FirstName = item[2];
        this.LastName = item[3];
        this.LastRegDate = LocalDate.parse(item[4]);
        ExpectReNewDate = LastRegDate.plusYears(1L);
        this.GPA = Double.parseDouble(item[5]);
//        Scanner sc = new Scanner(csv);
//        sc.useDelimiter(",");
//        try {
//            this.Id = sc.nextInt();
//            this.Age = sc.nextInt();
//            this.FirstName = sc.next();
//            this.LastName = sc.next();
//            this.ImuDate = LocalDate.parse(sc.next());
//
//
//
//
//        }catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//            System.out.println(csv);
//        }
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return this.Id;
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        this.Id = id;
    }

    public void setAge(int age) {
        // TODO Auto-generated method stub
        this.Age = age;
    }

    public int getAge() {
        // TODO Auto-generated method stub
        return this.Age;
    }

//    @Override
//    public void setName(String name) {
//
//    }
    public void setClassId(int cid) {
        this.ClassId = cid;
    }

    public void setFirstName(String firstName) {
        // TODO Auto-generated method stub
        this.FirstName = firstName;

    }

    public String getFirstName() {
        // TODO Auto-generated method stub
        return this.FirstName;
    }

    @Override
    public String getLastName() {
        return this.LastName;
    }

    public void setTid(int tid) {
        this.TeacherId = tid;
    }

    public void checkRenew() {
        NeedRenew = LastRegDate.isBefore(LocalDate.now().minusYears(1L));
    }

    public void addVax(Vax v) {
        VaxList.add(v);
    }

    public int getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(int TeacherId) {
        this.TeacherId = TeacherId;
    }

    public LocalDate getLastRegDate() {
        return LastRegDate;
    }

    public void setLastRegDate(LocalDate LastRegDate) {
        this.LastRegDate = LastRegDate;
    }

    public LocalDate getExpectReNewDate() {
        return ExpectReNewDate;
    }

    public void setExpectReNewDate(LocalDate ExpectReNewDate) {
        this.ExpectReNewDate = ExpectReNewDate;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public boolean isNeedRenew() {
        return NeedRenew;
    }

    public void setNeedRenew(boolean NeedRenew) {
        this.NeedRenew = NeedRenew;
    }

    public List<Vax> getVaxList() {
        return VaxList;
    }

    public void setVaxList(List<Vax> VaxList) {
        this.VaxList = VaxList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Age=" + Age +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", GPA=" + GPA +
                ", TeacherId=" + TeacherId +
                ", ClassRoomId=" + ClassId +
                ", RegDate=" + LastRegDate +
                ", NextRenewDate" + ExpectReNewDate+
                ", NeedRenew=" + NeedRenew +
                ", Vax=" + VaxList +
                '}';
    }


}
