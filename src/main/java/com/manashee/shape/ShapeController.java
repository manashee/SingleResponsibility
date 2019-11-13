package com.manashee.shape;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {

    @GetMapping(value = "/circle/{l}")
    public double circle(@PathVariable(name = "l") int l) throws UnknownShapeException {
        return new Shape(Shape.SHAPES.CIRLCE,l).area();
    }

    @GetMapping(value = "/square/{l}")
    public double square(@PathVariable(name = "l") int l) throws UnknownShapeException {
        return new Shape(Shape.SHAPES.SQUARE,l).area();
    }
}
