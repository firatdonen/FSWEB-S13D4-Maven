package org.example;

import org.apache.http.io.SessionOutputBuffer;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");



        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        // first noktasının  sıfır noktasına uzaklığı
        System.out.println("distance(0,0)= " + first.distance());
        // first noktasının second noktasına uzaklığı
        System.out.println("distance(second)= " +first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2,2));

        System.out.println("*********************new point*************");
        Point point= new Point(0,0);
        // point noktasının sıfır noktasına uzaklığı
        System.out.println("distance()=" + point.distance());


    }




}
