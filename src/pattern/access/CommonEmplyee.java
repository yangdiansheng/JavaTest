package pattern.access;

public class CommonEmplyee extends Employee{

    private String job;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
