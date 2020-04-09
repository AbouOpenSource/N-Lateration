package com.github.AbouOpenSource.core.Interface;

import com.github.AbouOpenSource.Model.Position.Position3D;

public interface Position {
    public double distanceFromToPosition(Position3D position);
    public int getDimension();
}
