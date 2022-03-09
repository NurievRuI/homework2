package com.company.lesson5;

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize (int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.height = height;
        this.width = width;
    }

    public void initialize (int top, int left) {
        this.top = top;
        this.left = left;
        width = 0;
        height = 0;

    }

    public void initialize (int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    Rectangle (int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    Rectangle (int left, int top) {
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;

    }

    Rectangle (int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = width;
    }

    Rectangle (Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

}
