package org.example;

public class Box {
    private double width;
    private double height;
    private double depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double getWidth() {
        return this.width;
    }


    @Override
    public String toString() {
        return width + "x" + height + "x" + depth + " см";
    }
}