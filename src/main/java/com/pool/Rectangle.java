package com.pool;

public class Rectangle {
    int width;
    int length;


    public Rectangle(int width,int length){
        this.width = width;
        this.length = length;
        if(width < 0){
            this.width = 0;
        }
        if(length < 0){
            this.length = 0;
        }
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
    public int getArea(){
        return width*length;
    }
}
