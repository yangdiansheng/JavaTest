package pattern.commond;

public class DeletePageCommand extends Command{
    @Override
    public void execute() {
        pg.find();
        pg.delete();
        pg.plan();
    }
}
