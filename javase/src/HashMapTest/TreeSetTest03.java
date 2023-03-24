package HashMapTest;

import java.util.TreeSet;

public class TreeSetTest03 {
    public static void main(String[] args) {
        TreeSet<Car> car = new TreeSet<>();
        car.add(new Car("benchi",209));
        car.add(new Car("baoma",309));
        car.add(new Car("fengtian",200));
        car.add(new Car("changcheng",200));
        for(Car car1 : car){
            System.out.println(car1);
        }
    }
}

class Car implements Comparable<Car>{
    String name;
    int time;

    public Car() {
    }

    public Car(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public int compareTo(Car car){
        //当多个对象的名字相同时，比对的就是字典
        if(this.time == car.time){
            return this.name.compareTo(car.name);
        }else {
            //按照从大到小的顺序进行排序
            return car.time - this.time;
        }
    }

    public String toString(){
        return this.name + " " + this.time;
    }
}
