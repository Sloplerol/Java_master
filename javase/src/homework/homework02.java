package homework;

public class homework02 {
    public static void main(String[] args) {
        Number n = new Number(10,20);
        n.addition();
    }
}

class Number{
    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public int getN1() {
        return n1;
    }


    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    public void addition(){
        System.out.println(n1 + "+" + n2 + "=" + (n1+n2));
    }

    public void subition(){
        System.out.println(n1 + "-" + n2 + "=" + (n1-n2));
    }

    public void multiply(){
        System.out.println(n1 + "*" + n2 + "=" + n1*n2);
    }
    public void chu(){
        System.out.println(n1 + "/" + n2 + "=" + n1/n2);
    }

}
