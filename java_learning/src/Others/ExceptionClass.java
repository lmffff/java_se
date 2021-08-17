package Others;

//自定义异常
public class ExceptionClass extends Throwable {
    public ExceptionClass(){}
    public ExceptionClass(String message){
        super(message);

    }
}
