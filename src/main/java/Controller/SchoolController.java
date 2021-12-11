/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import Model.FileUtil;
import Model.School;
import Model.StudentFactory;

/**
 *
 * @author vedan
 */
public class SchoolController {

    public School loadSchoolData() {
        List<String> CSVList = FileUtil.readFileToString("Student.txt");
        School neu = new School();
        for (String s : CSVList) {
            neu.addStudent(StudentFactory.getInstance().getObject(s));
        }
        return neu;
    }
}
