package pattern.decoration;

public class HighScoreDecorator extends Decorator{

    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore(){
        System.out.println("这次考试最高分 语文 75 数学 78 体育93 自然80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
