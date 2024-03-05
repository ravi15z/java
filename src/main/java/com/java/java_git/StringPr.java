package com.java.java_git;

public class StringPr {

    public void show() {
        String str1 = " abc";
        String str2 = str1;
        str1 = "ABC";
        System.out.println("str1 =" + str1 + "" + "str2 =" + str2);
        String str3 = new String("xyz");
        String str4 = str3;
        str3 = "asd";
        System.out.println(str3);
    }
}
