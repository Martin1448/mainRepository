package ru.stqa.pft.sandbox;

public class Point {
    public double p1;
    public double p2;

    public Point(double p1, double p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double distance() {
        this.p1 = Math.abs(this.p1);
        this.p2 = Math.abs(this.p2);
        return this.p1 + this.p2;
    }

}