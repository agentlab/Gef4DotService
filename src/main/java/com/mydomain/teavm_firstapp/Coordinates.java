package com.mydomain.teavm_firstapp;

public class Coordinates {

    private int x1coord;
    private int y1coord;
    private int x2coord;
    private int y2coord;

    public Coordinates(int x1coord, int y1coord, int x2coord, int y2coord) {
        this.x1coord = x1coord;
        this.y1coord = y1coord;
        this.x2coord = x2coord;
        this.y2coord = y2coord;
    }

    public int getX1Coord() {
        return x1coord;
    }

    public int getY1Coord() {
        return y1coord;
    }

    public int getX2Coord() {
        return x2coord;
    }

    public int getY2Coord() {
        return y2coord;
    }
}
