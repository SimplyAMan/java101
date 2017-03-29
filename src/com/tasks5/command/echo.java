package com.tasks5.command;


public class echo {
    public static void main(String[] args){
        String str1="Hello";
        String str2="World";
        String str3=str1+str2;
        String str4="HelloWorld";
        str3 = str1.concat(str2);
        System.out.println(str3);
    }
}
