package neu.edu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> CSVList = FileUtil.readFileToString("Student.txt");
		for(String s: CSVList){
			System.out.println(s);
		}
		List<String> VaxList = FileUtil.readFileToString("Vax.txt");
		List<Vax> vaxes = new ArrayList<>();
		for(String s:VaxList){
			vaxes.add(new Vax(s));
		}
		School neu = new School();
		for(String s: CSVList){
			Student student = StudentFactory.getInstance().getObject(s);
			for(Vax v:vaxes){
				student.addVax(v);
			}
			neu.addStudent(student);
		}
		//neu.sortStudentByFirstName();
		neu.showStudent();


                
	}

}
