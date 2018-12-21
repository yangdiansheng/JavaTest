package link;

public enum  Control {
    INSTANCE;

    public void check(){
        IDCheck idCheck = new IDCheck();
        ContactCheck contactCheck = new ContactCheck();
        YunYingShangCheck yunYInShangCheck = new YunYingShangCheck();
        BaseInfoCheck baseInfoCheck = new BaseInfoCheck();
        BankBindCheck bankBindCheck = new BankBindCheck();
        LoanPage loanPage = new LoanPage();
        idCheck.setSuccessor(contactCheck);
        contactCheck.setSuccessor(yunYInShangCheck);
        yunYInShangCheck.setSuccessor(baseInfoCheck);
        baseInfoCheck.setSuccessor(bankBindCheck);
        bankBindCheck.setSuccessor(loanPage);
        boolean flag = idCheck.handle();
        System.out.println("flag = " + flag);
    }

    public void chechCallBack(ProcessCallBack.CallBack callBack){
        IDCheck idCheck = new IDCheck();
        ContactCheck contactCheck = new ContactCheck();
        YunYingShangCheck yunYInShangCheck = new YunYingShangCheck();
        BaseInfoCheck baseInfoCheck = new BaseInfoCheck();
        BankBindCheck bankBindCheck = new BankBindCheck();
        ProcessCallBack processCallBack = new ProcessCallBack(callBack);
        idCheck.setSuccessor(contactCheck);
        contactCheck.setSuccessor(yunYInShangCheck);
        yunYInShangCheck.setSuccessor(baseInfoCheck);
        baseInfoCheck.setSuccessor(bankBindCheck);
        bankBindCheck.setSuccessor(processCallBack);
        boolean flag = idCheck.handle();
        System.out.println("flag = " + flag);
    }
}
