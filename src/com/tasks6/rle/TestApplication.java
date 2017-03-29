package com.tasks6.rle;

/**
 * Created by ahuryn on 29.03.2017.
 */
public class TestApplication {

    public static void main(String [] args){
        String[] testString = {"Hhhhhhhhhhhhhheeeellooooo"};
        System.out.println("test string - " + testString[0]);
        Application.main(testString);
        testString[0] = "";
        System.out.println("test string - " + testString[0]);
        Application.main(testString);
        testString[0] = "hh44tttti";
        System.out.println("test string - " + testString[0]);
        Application.main(testString);
        testString[0] = "hh44+ttti";
        System.out.println("test string - " + testString[0]);
        Application.main(testString);

    }
}
