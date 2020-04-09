package com.github.AbouOpenSource.Model;

import com.github.AbouOpenSource.Model.Position.Position3D;

public class Device {
    Position3D position;

    public Device(Position3D position) {
        this.position = position;
    }

    public Position3D getPosition() {
        return position;
    }

    public void setPosition(Position3D position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Device{" +
                "position=" + position +
                '}';
    }
}
