package pattern.prototype;

import java.util.ArrayList;

public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    private String appellation;
    private String context;
    private String tail;
    private ArrayList<String> list = new ArrayList<>();

    public Mail(AdvTemplate advTemplate){
        this.context = advTemplate.advContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Mail clone(){
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
            this.list = (ArrayList<String>)this.list.clone();
        }catch (CloneNotSupportedException e){

        }
        return mail;
    }
}
