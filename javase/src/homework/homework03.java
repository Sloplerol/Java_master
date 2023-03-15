package homework;

public class homework03 {
    public static void main(String[] args) {
        Person p = new Person("zjj",18);
        p.display();
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("姓名为:"+this.getName()+"年龄为:"+this.getAge());
    }

}