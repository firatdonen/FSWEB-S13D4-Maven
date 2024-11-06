package org.example;

public class Point {
    private int x;
    private  int y;

    //Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
    //get metodları
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }

    //set metodları
    public void setX(int x, int y){
        this.x=x;
        this.y=y;
    }
    // (0,0) noktasına göre
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
    // p nokasına göre
    public double distance(Point p){
       return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y)) ;
    } // a ve b parametrelerine göre
    public double distance(int a,  int b){
        return Math.sqrt((a-this.x)*(a-this.x)+(b-this.y)*(b-this.y));
    }

}
