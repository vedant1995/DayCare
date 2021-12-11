package neu.edu.csye6200;

import com.github.javafaker.Faker;

import java.util.Random;

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

    public Teacher getObject(int tid,int size){
        Faker faker = new Faker();
        Random rand = new Random();
        return new Teacher(tid,size,faker.name().firstName(),faker.name().lastName(),rand.nextInt(20)+20);
    }

}
