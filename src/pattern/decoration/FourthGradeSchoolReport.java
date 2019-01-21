package pattern.decoration;

public class FourthGradeSchoolReport implements SchoolReport{
    @Override
    public void report() {
        System.out.println("尊敬的家长");
        System.out.println("``````````");
        System.out.println("语文 62 数学 65 体育89 自然63");
        System.out.println("``````````");
        System.out.println("家长签名：");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" +name);
    }
}
