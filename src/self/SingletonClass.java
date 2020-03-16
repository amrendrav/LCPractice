package self;

public class SingletonClass {

    private SingletonClass() {}
    private static volatile SingletonClass instance ;

    private String message = "Hello from Singleton Class";

    public static SingletonClass getINSTANCE(){
        if(instance == null ){
            synchronized (SingletonClass.class){
                instance = new SingletonClass();
            }
        }
        return instance;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
