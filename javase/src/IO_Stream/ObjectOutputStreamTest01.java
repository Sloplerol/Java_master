package IO_Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
public class ObjectOutputStreamTest01 {
    public static void main(String[] args) throws IOException {
        Student student = new Student(11,"zjj");
        //参与序列化的对象必须实现Serializable接口
        //Serializable接口是提供给JVM虚拟机的一个参考接口，JVA会为其分配一个序列号
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));
        oos.writeObject(student);
        oos.flush();
        oos.close();

    }
}


class Student implements Serializable{
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
