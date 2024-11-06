package com.pool;

public class Cuboid extends Rectangle{

    int height;


    public Cuboid(int width, int length, int height) {
        super(width, length);
        this.height=height;
        if(height<0){
            this.height=0;
        }
    }
    public int getHeight(){
        return height;
    }
    public int getVolume(){
        return super.getArea()*height;
    }
}
