package pattern.memorandum;


import pattern.mediator.two.*;

public class Main {

    public static void main(String[] args){
//        Boy boy = new Boy();
//        boy.setState("心情很棒");
//        System.out.println("--------男孩现在的心情----------");
//        System.out.println(boy.getState());
//        Boy backup = new Boy();
//        backup.setState(boy.getState());
//        boy.changeState();
//        System.out.println("--------男孩追女孩子后的状态----------");
//        System.out.println(boy.getState());
//        boy.setState(backup.getState());
//        System.out.println("--------男孩恢复后状态----------");
//        System.out.println(boy.getState());


//        Boy boy = new Boy();
//        boy.setState("心情很棒");
//        System.out.println("--------男孩现在的心情----------");
//        System.out.println(boy.getState());
//        Memonto mem = boy.createMemento();
//        boy.changeState();
//        System.out.println("--------男孩追女孩子后的状态----------");
//        System.out.println(boy.getState());
//        boy.restoreMemento(mem);
//        System.out.println("--------男孩恢复后状态----------");
//        System.out.println(boy.getState());


        Boy boy = new Boy();
        Caretaker caretaker = new Caretaker();
        boy.setState("心情很棒");
        System.out.println("--------男孩现在的心情----------");
        System.out.println(boy.getState());
        caretaker.setMemonto(boy.createMemento());
        boy.changeState();
        System.out.println("--------男孩追女孩子后的状态----------");
        System.out.println(boy.getState());
        boy.restoreMemento(caretaker.getMemonto());
        System.out.println("--------男孩恢复后状态----------");
        System.out.println(boy.getState());
    }
}
