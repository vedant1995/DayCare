package neu.edu.csye6200;

public class TeacherFactory extends AbstractFactory{
    private TeacherFactory(){

    }
    private static TeacherFactory instance = null;
    public static TeacherFactory getInstance(){
        if(instance == null){
            instance = new TeacherFactory();
        }
        return instance;
    }

    public Teacher getObject(int tid){
        return new Teacher(tid);
    }

}
