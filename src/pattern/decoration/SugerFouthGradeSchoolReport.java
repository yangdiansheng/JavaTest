package pattern.decoration;

public class SugerFouthGradeSchoolReport extends FourthGradeSchoolReport{

    private void reportHighScore(){
        System.out.println("这次考试最高分 语文 75 数学 78 体育93 自然80");
    }

    private void reportSort(){
        System.out.println("我的排名第38名");
    }

    @Override
    public void report(){
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
