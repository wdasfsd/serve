package com.wangyang.domain;

public class Position {
    String id;
    String position;
    String dest;

    public Position(String id, String position, String dest) {
        this.id = id;
        this.position = position;
        this.dest = dest;
    }

    public Position() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    @Override
    public String toString() {
        return "Position{" +
                "id='" + id + '\'' +
                ", position='" + position + '\'' +
                ", dest='" + dest + '\'' +
                '}';
    }
}
