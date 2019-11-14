package algorithm.queue;

import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

/**
 * 猫狗队列
 * cat队列只放cat
 * dog队列只放dog
 *
 * pollAll弹出所有猫狗
 * pollDog 弹出狗的
 * pollCat 弹出猫的
 * isEmpty 队列中是否还有猫 狗
 * isDogEmpty 狗队列是否为空
 * isCatEmpty 猫队列是否为空
 */
public class DogCatQueue {

    public static class Pet{
        private String type;

        public Pet(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }

    public static class Cat extends Pet{

        public Cat(String type) {
            super(type);
        }
    }

    public static class Dog extends Pet{

        public Dog(String type) {
            super(type);
        }
    }

    //结题思路 创建一个带有时间戳的包装类
    public static class PetEnter{
        private Pet pet;
        private long count;//记录入队的次数

        public PetEnter(Pet pet, long count) {
            this.pet = pet;
            this.count = count;
        }

        public Pet getPet() {
            return pet;
        }

        public long getCount() {
            return count;
        }

        public String getType(){
            return pet.getType();
        }
    }

    private static Queue<PetEnter> dogQ = new LinkedList<>();
    private static Queue<PetEnter> catQ = new LinkedList<>();
    private static int count = 0;

    public void add(Pet pet){
        if ("dog".equals(pet.getType())){
            dogQ.add(new PetEnter(pet,count++));
        } else if ("cat".equals(pet.getType())){
            catQ.add(new PetEnter(pet,count++));
        } else {
            throw new RuntimeException("err,not dog or cat");
        }
    }

    public static Pet pollAll(){
        if (!dogQ.isEmpty() && !catQ.isEmpty()){
            if (dogQ.peek().getCount() < catQ.peek().getCount()){
                return dogQ.poll().getPet();
            } else {
                return catQ.poll().getPet();
            }
        } else if (!dogQ.isEmpty()){
            return dogQ.poll().getPet();
        }else if (!catQ.isEmpty()){
            return catQ.poll().getPet();
        } else {
            throw new RuntimeException("err,queue is empty");
        }
    }

    public static Pet pollDog(){
        if (!dogQ.isEmpty()){
            return dogQ.poll().getPet();
        } else {
            throw new RuntimeException("err,queue is empty");
        }
    }

    public static Pet pollCat(){
        if (!catQ.isEmpty()){
            return catQ.poll().getPet();
        } else {
            throw new RuntimeException("err,queue is empty");
        }
    }

    public static boolean isEmpty(){
        return dogQ.isEmpty() && catQ.isEmpty();
    }

    public static boolean isDogEmpty(){
        return dogQ.isEmpty();
    }

    public static boolean isCatEmpty(){
        return catQ.isEmpty();
    }
}
