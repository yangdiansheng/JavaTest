package pattern.prototype;


import java.util.Random;

public class Main {


    private static int MAX_COUNT = 6;

    public static void main(String[] args){
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("版权归xx公司所有");
        while (i < MAX_COUNT){
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + "先生（女士）");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8));
            sendMail(cloneMail);
            i++;
        }
    }

    public static void sendMail(Mail mail){
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t....发送成功");
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();
        for (int i=0;i< maxLength;i++){
            sb.append(source.charAt(rand.nextInt(source.length())));
        }
        return sb.toString();
    }
}
