package com.java.java_git.java9;

public interface Inter_Private_Method {

    void abstMethod();

    default void defaultMethod() {
        System.out.println("Default Method");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private Method");
    }

    static void staticMethod() {
        System.out.println("Static Method");
    }
}
