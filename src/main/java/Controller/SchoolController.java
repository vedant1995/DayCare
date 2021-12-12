/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.List;
import Model.FileUtil;
import Model.RatioRule;
import Model.School;
import Model.Student;
import Model.StudentFactory;
import Model.Vax;
import java.util.ArrayList;

/**
 *
 * @author vedan
 */
public class SchoolController {

    public School loadSchoolData() {
        List<String> CSVList = FileUtil.readFileToString("Student.txt");
//        for (String s : CSVList) {
//            System.out.println(s);
//        }
        List<String> VaxList = FileUtil.readFileToString("Vax.txt");
        List<Vax> vaxes = new ArrayList<>();
        for (String s : VaxList) {
            vaxes.add(new Vax(s));
        }
        List<String> RatioList = FileUtil.readFileToString("Ratio.txt");
        List<RatioRule> ratioRules = new ArrayList<>();
        for (String s : RatioList) {
            ratioRules.add(new RatioRule((s)));
        }
        School neu = new School();
        for (RatioRule r : ratioRules) {
            neu.addRatioRule(r);
        }
        for (String s : CSVList) {
            Student student = StudentFactory.getInstance().getObject(s);
            for (Vax v : vaxes) {
                student.addVax(v);
            }
            neu.addStudent(student);
        }
        // neu.showAll();
        return neu;
    }
}
