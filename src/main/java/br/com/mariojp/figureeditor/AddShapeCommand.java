package br.com.mariojp.figureeditor;

import java.awt.Shape;
import java.util.List;

public class AddShapeCommand implements Command {
    private final Shape shape;
    private final List<Shape> shapes;

    public AddShapeCommand(Shape shape, List<Shape> shapes) {
        this.shape = shape;
        this.shapes = shapes;
    }

    @Override
    public void execute() {
        shapes.add(shape);
    }

    @Override
    public void undo() {
        shapes.remove(shape);
    }
}