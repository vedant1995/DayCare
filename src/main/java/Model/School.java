package Model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {

    private List<Classroom> ClassroomList = new ArrayList<>();
    private List<AbstractPerson> TeacherList = new ArrayList<>();
    private List<AbstractPerson> StudentList = new ArrayList<>();
    private int tid;
    private int cid;

    public School() {

        tid = 0;
        cid = 0;
        //Classroom c = new Classroom();
        Classroom c = ClassroomFactory.getInstance().getObject(cid++, 0, 35);
        for (int i = 0; i < 3; i++) {
            c.addTeacher(generateTeacher(3));

        }
        ClassroomList.add(c);

    }

    public List<Classroom> getClassroomList() {
        return ClassroomList;
    }

    public void setClassroomList(List<Classroom> ClassroomList) {
        this.ClassroomList = ClassroomList;
    }
    
    

    public Teacher generateTeacher(int size) {
        //Teacher t = new Teacher(tid++);
        Teacher t = TeacherFactory.getInstance().getObject(tid++, size);
        return t;
    }

//    private void addTeacher(Teacher t){
//        TeacherList.add(t);
//        addToClassroom(t);
//
//
//
//    }
    public void addStudent(Student s) {
        StudentList.add(s);
        s.checkRenew();
        addToClassroom(s);

    }

    // To get student specific information in StudentInformationPanel.java
    public AbstractPerson findStudentById(int id) {
        for (AbstractPerson p : StudentList) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

//    private void addToClassroom(Teacher t){
//        for(Classroom c : ClassroomList){
//            if (c.isEmpty()){
//                c.addTeacher(t);
//            }
//            else{
//                Classroom c1 = new Classroom();
//                c1.addTeacher(t);
//                ClassroomList.add(c1);
//
//            }
//        }
//    }
    
    private void addToClassroom(Student s) {
        for (Classroom c : ClassroomList) {
            if (c.inRange(s.getAge())) {
                //System.out.println(s.getId()+"in range");
                for (Teacher t : c.getTeacherList()) {
                    if (t.isEmpty()) {
                        s.setClassId(c.getId());
                        t.addStudent(s);
                        return;
                    }

                }
            }

        }
        if (0 < s.getAge() && s.getAge() <= 35) {
            //Classroom c = new Classroom(cid++,0,35);
            Classroom c = ClassroomFactory.getInstance().getObject(cid++, 0, 35);
            Teacher t = generateTeacher(3);
            s.setClassId(c.getId());
            t.addStudent(s);
            for (int i = 0; i < 2; i++) {
                c.addTeacher(generateTeacher(3));

            }
            ClassroomList.add(c);
        } else if (35 <= s.getAge() && s.getAge() <= 60) {
            //Classroom c = new Classroom(cid++,35,60);
            Classroom c = ClassroomFactory.getInstance().getObject(cid++, 35, 60);
            Teacher t = generateTeacher(3);
            s.setClassId(c.getId());
            t.addStudent(s);
            for (int i = 0; i < 2; i++) {
                c.addTeacher(generateTeacher(3));

            }
            ClassroomList.add(c);
        } else {
            //Classroom c = new Classroom(cid++,60,9999);
            Classroom c = ClassroomFactory.getInstance().getObject(cid++, 60, 9999);
            Teacher t = generateTeacher(3);
            s.setClassId(c.getId());
            t.addStudent(s);
            for (int i = 0; i < 2; i++) {
                c.addTeacher(generateTeacher(3));

            }
            ClassroomList.add(c);
        }

    }

    public void showStudent() {
        for (AbstractPerson s : StudentList) {
            System.out.println(s);
        }
    }

    public List<AbstractPerson> getStudentList() {
        return StudentList;
    }

    public List<AbstractPerson> getTeachersList() {
        return TeacherList;
    }

    public void sortStudentByID() {
        StudentList.sort(new Comparator<AbstractPerson>() {
            @Override
            public int compare(AbstractPerson p1, AbstractPerson p2) {
                return (Integer.compare(p1.getId(), p2.getId()));
            }
        });

    }

    public void sortStudentByAge() {
        StudentList.sort(new Comparator<AbstractPerson>() {
            @Override
            public int compare(AbstractPerson p1, AbstractPerson p2) {
                return (Integer.compare(p1.getAge(), p2.getAge()));
            }
        });

    }

    public void sortStudentByLastName() {
        StudentList.sort(new Comparator<AbstractPerson>() {
            @Override
            public int compare(AbstractPerson p1, AbstractPerson p2) {
                return (p1.getLastName().compareTo(p2.getLastName()));
            }
        });
    }

    public void sortStudentByFirstName() {
        StudentList.sort(new Comparator<AbstractPerson>() {
            @Override
            public int compare(AbstractPerson p1, AbstractPerson p2) {
                return (p1.getFirstName().compareTo(p2.getFirstName()));
            }
        });
    }

    public void showAll() {
        for (Classroom c : ClassroomList) {
            c.showTeachers();
        }
    }

}
