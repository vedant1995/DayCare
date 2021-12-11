package neu.edu.csye6200;

public class ClassroomFactory extends AbstractFactory{
    private ClassroomFactory(){

    }
    private static ClassroomFactory instance = null;
    public static ClassroomFactory getInstance(){
        if(instance == null){
            instance = new ClassroomFactory();
        }
        return instance;
    }

    public Classroom getObject(int cid,int low,int high){
        return new Classroom(cid,low,high);
    }

}
