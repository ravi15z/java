package com.java.java_git.java9;

public class ter_Private_Method_Impl implements Inter_Private_Method {

    @Override
    public void abstMethod() {
        privateMethod();
    }

    // Only allowed in Interface
    // default void defaultMethod() {
    // System.out.println("Default Method");
    // }

    private void privateMethod() {
        System.out.println("Private Method form Impl");
    }

    public static void staticMethod() {
        System.out.println(
                "staticMethod : Define Access Modifire, in Interface byDeafult is Public but in Impl we need to define");
    }
}
