package ReflectTest;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test09 {
    public static void main(String[] args) throws Exception{
        //反编译
        StringBuilder sb = new StringBuilder();
        Class school = Class.forName("java.lang.String");
        sb.append(Modifier.toString(school.getModifiers()) + "class " + school.getSimpleName() + "{\n" );
        Field[] fields = school.getDeclaredFields();
        for(Field field : fields){
            sb.append("\t"+Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName() + "\n");
        }
        sb.append("}");
        System.out.println(sb);

    }
}

class School{
    private String name;
    double historyTime;
    protected String address;

    public int achievement;
}
