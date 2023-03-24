package HashMapTest;

import java.util.TreeSet;

public class TreeSetTest02 {
    public static void main(String[] args) {
        TreeSet<Animal> treeSet = new TreeSet<>();


        //treeSet是无法比较自定义的大小的
        treeSet.add(new Animal(3));
        treeSet.add(new Animal(1));
        treeSet.add(new Animal(5));

        for(Animal animal : treeSet){
            System.out.println(animal);
        }
    }
}

//如果想要通过treeSet对自定义类的实例进行大小比较需要重写compareTo方法
class Animal implements Comparable<Animal>{
    int age;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public int compareTo(Animal animal){
        return this.age - animal.age;
    }

    public String toString(){
        return "--->" + age;
    }
}
