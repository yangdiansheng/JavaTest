package pattern.brige;


import pattern.template.AbstractClass;
import pattern.template.ConcreteClass1;
import pattern.template.ConcreteClass2;

public class Main {
    public static void main(String[] args){
        System.out.println("房地产公司是这样运行的");
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("山寨公司是这样运行的");
        IPod pod = new IPod();
        ShanZhaiCorp shanZhaiCorp = new ShanZhaiCorp(pod);
        shanZhaiCorp.makeMoney();
    }
}
