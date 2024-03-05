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

    public void objectS() {
        String s1 = "Hello World"; // 1 object created in SCP.
        String s2 = "Hello World"; // no object created, s2 refer previous object.
        String s3 = s1; // no object created, s2 refer s1.

        String n1 = new String("Hello World"); // 1 object created in Heap, no Object created in SCP(already present)
        String n2 = new String("Hello World"); // 1 object created in Heap, no Object created in SCP(already present)

        System.out.println("True s1==s2: " + (s1 == s2));
        System.out.println("True s3==s2: " + (s3 == s2));
        System.out.println("False n1==n2: " + (n1 == n2));
        System.out.println("False s1==n1: " + (s1 == n1));
        System.out.println("True s1.equals(n1): " + s1.equals(n1));
    }
}
