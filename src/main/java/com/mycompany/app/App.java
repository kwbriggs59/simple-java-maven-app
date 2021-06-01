package com.mycompany.app;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello Old World!";

    public App() {}

    public static void main(String[] args) {
        String htmlmessage = "<html><h1>" + new App().getMessage() + "</h1></html>";
        System.out.println(htmlmessage);
    }

    private final String getMessage() {
        return message;
    }

}
