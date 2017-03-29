package com.tasks6.rle;

public class Application
{
    public static void main( String[] args )
    {
        String result = "";
        if (args[0].length() != 0) {
            int count = 1;
            char currentChar = args[0].charAt(0);
            int i = 1;
            do {
                if (currentChar > '9') {
                    if (currentChar != args[0].charAt(i)){
                        if (count == 1)
                            result = result + currentChar;
                        else
                            result = result + currentChar + count;
                        count = 1;
                        currentChar = args[0].charAt(i);
                    }
                    else
                    if (count == 9) {
                        result = result + currentChar + count;
                        count = 1;
                    }
                    else
                        count += 1;
                }
                else {
                    result = result + currentChar;
                    currentChar = args[0].charAt(i);
                }

                i++;
            } while (i < args[0].length());
            if (count == 1)
                result = result + currentChar;
            else
                result = result + currentChar + count;
        }
        System.out.println(result);
    }
}