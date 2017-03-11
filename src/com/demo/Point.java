package com.demo;

/**
 * Created by ahuryn on 09.03.2017.
 */
public class Point {
    private int x;
    private int y;
    private int color = 10;

    public Point(){
        this(10,20,30);
    }

    public Point(int x, int y, int color){
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int GetX(){
        return x;
    }

    public int GetY(){
        return y;
    }

    public static void main (String [] argv){
        Point point = new Point();

        System.out.println(point.GetX());
    }
}
