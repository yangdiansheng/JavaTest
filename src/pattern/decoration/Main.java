package pattern.decoration;

import pattern.factory.one.Human;

public class Main {
    public static void main(String[] args){
//        SchoolReport sr = new FourthGradeSchoolReport();
//        sr.report();

//        SchoolReport sr = new SugerFouthGradeSchoolReport();
//        sr.report();
//        sr.sign("老三");


        SchoolReport sr = new FourthGradeSchoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortScoreDecorator(sr);
        sr.report();
        sr.sign("张三");
    }
}
