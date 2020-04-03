package com.github.AbouOpenSource.Model;

public class Device {
    Position position;

    public Device(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Device{" +
                "position=" + position +
                '}';
    }
}
