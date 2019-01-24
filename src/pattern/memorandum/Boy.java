package pattern.memorandum;

public class Boy {
    private String state = "";
    public void changeState(){
        this.state = "心情可能很不好";
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }


    public Memonto createMemento(){
        return new Memonto(this.state);
    }

    public void restoreMemento(Memonto memonto){
        this.setState(memonto.getState());
    }
}
