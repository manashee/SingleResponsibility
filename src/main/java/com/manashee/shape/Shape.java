package com.manashee.shape;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//////
// An example of a class that violates Single Responsibility Principle
//////
@Getter
@Setter
@AllArgsConstructor
public class Shape {
    SHAPES type;
    int l;

    public double area() throws UnknownShapeException {
        if ( type == SHAPES.SQUARE ) {
            return l * l;
        } else if ( type == SHAPES.CIRLCE ){
            return Math.PI * l * l ;
        }
        else {
            throw new UnknownShapeException(String.format("The shape %s, is not recognozied.",type ));
        }
    }

    enum SHAPES  {
        CIRLCE,
        SQUARE
    }
}