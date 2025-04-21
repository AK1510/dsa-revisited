package com.kourouma.training.datastructure.codingame;

public  abstract class Shape {
private int surface;
public Shape() {
this.surface = computeSurface();
}
protected abstract int computeSurface();
public int getSurface() {
return surface;
}


    public static void main(String[] args) {
        SquareShape squareShape = new SquareShape(10);

        System.out.println(squareShape.getSurface());
    }
}
 class SquareShape extends Shape {
private final int size;
public SquareShape(int size) {
this.size = size;
}
@Override
protected int computeSurface() {
return size * size;
}
}