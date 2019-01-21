package pattern.decoration;

public class Decorator implements SchoolReport{

    private SchoolReport sr;

    public Decorator(SchoolReport sr){
        this.sr = sr;
    }


    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
