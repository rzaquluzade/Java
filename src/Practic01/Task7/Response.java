package Practic01.Task7;

public class Response <T> {

    private T data;
    private String message;
    private int code;

    public Response(T data, String message, int code) {
        this.data = data;
        this.message = message;
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public int getCode() {
        return code;
    }
}
