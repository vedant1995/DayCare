package neu.edu.csye6200;

import java.util.List;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> CSVList = FileUtil.readFileToString("Student.txt");
		for(String s: CSVList){
			System.out.println(s);
		}

		School neu = new School();
		for(String s: CSVList){
			neu.addStudent(StudentFactory.getInstance().getObject(s));
		}
		//neu.sortStudentByFirstName();
		neu.showStudent();

                
	}

}
