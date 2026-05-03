package Practic01.Task7;

public class Main {

    public static void main(String[] args) {

        Response <Integer> response = new Response<>(135,"Success", 500);

        System.out.println(response.getData());
        System.out.println(response.getMessage());
        System.out.println(response.getCode());
    }
}
