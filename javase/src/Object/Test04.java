package Object;

public class Test04 {
    public static void main(String[] args) {
        Student s1 = new Student(1,"hello world");
        Student s2 = new Student(1,"hello world");
        System.out.println(s1.equals(s2));
    }
}

class Student{
    private int no;
    private String name;

    public Student() {
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return "学号" + no + "姓名" + name;
    }

    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Student)) return false;
        if(this == obj) return true;
        Student s = (Student)obj;
        return name.equals(s.name) && s.no == no;

    }
}
