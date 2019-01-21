package pattern.decoration;

public class SortScoreDecorator extends Decorator{

    public SortScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort(){
        System.out.println("我的排名第38名");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
