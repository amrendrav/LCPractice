package self;

public enum  EnumSingleton {

    INSTANCE("Hi from singleton Enum");

    private String message;

    EnumSingleton(String message) {
        this.message = message;
    }

    public EnumSingleton getInstance(){
        return INSTANCE;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
