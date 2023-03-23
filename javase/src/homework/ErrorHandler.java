package homework;

public class ErrorHandler extends Exception{
    public ErrorHandler(){

    }

    public ErrorHandler(String str){
        super(str);
    }
}
