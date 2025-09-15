package br.com.mariojp.figureeditor;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;

public class RectangleFactory implements ShapeFactory {
    @Override
    public Shape createShape(Point center, int size) {
        double x = center.x - size / 2.0;
        double y = center.y - size / 2.0;
        return new Rectangle2D.Double(x, y, size, size);
    }
}