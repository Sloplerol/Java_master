package array;

public class Test05 {
    public static void main(String[] args) {
        School school1 = new School();
        School school2 = new School();
        School[] arr = {school1,school2};
        arr[0].sayName();
        //School数组中只能存放school的引用
//        arr[0] = new Student();
        //父类里面可以存储子类创建的对象
        arr[0] = new subject();
        subject s1 = new subject();
        student s2 = new student();
        School[] s = {s1,s2};
        for(int i = 0;i<s.length;i++){
            s[i].sayName();
            if(s[i] instanceof subject){
                subject sh = (subject)s[i];
                sh.study();
            }else {
                student st = (student)s[i];
                st.gotoclass();
            }
        }

    }
}

class School{
    public void sayName(){
        System.out.println("i am school");
    }
}

class subject extends School{
    public void sayName(){
        System.out.println("i am subject");
    }
    public void study(){
        System.out.println("我需要学习");
    }
}

class student extends School{
    public void sayName(){
        System.out.println("i am student");
    }
    public void gotoclass(){
        System.out.println("我需要去上课");
    }
}
