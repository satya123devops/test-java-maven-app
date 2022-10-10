package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        String msg = "${{ secrets.API_TOKEN }}";
        System.out.println(new App().getMessage());
        System.out.println(msg);
    }

    private final String getMessage() {
        return message;
    }
   

}
