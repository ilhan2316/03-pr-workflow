package com.neueda.leap;

public class Main {
    public static void main(String[] args) {
        System.out.println(greetingForArgs(args));
    }

    static String greetingForArgs(String[] args) {
        String name = (args != null && args.length > 0 && !args[0].isBlank()) ? args[0] : "team";
        return "Hello " + name + " from Sprint 1";
    }
}
