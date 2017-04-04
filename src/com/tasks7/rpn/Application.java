package com.tasks7.rpn;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Application {
    public static double parse(String rpnString) {
        LinkedList<Double> list = new LinkedList<Double>();
        double result=0;
        Double a, b, c;
        String[] temp = rpnString.split(" ");

        for (int i = 0; i < temp.length; i++) {
            try {
                list.push(Double.parseDouble(temp[i]));
            }
            catch (NumberFormatException e) {
                a = list.pop();
                b = list.pop();
                switch (temp[i]){
                    case "+":
                        c = a + b;
                        break;
                    case "-":
                        c = b - a;
                        break;
                    case "*":
                        c = a * b;
                        break;
                    case "/":
                        if (a != 0)
                            c = b / a;
                        else
                            throw new ArithmeticException();
                        break;
                    default:
                        throw new RPNParserException();
                }
                list.push(c);
            }
        }
        return list.pop();
    }

    public static void main(String[] args) {
//        System.out.println(parse(args[0]));
        System.out.println(parse("0 0 /"));
    }

}

