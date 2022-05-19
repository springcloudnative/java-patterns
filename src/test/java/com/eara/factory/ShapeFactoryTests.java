package com.eara.factory;

import com.eara.domain.Circle;
import com.eara.domain.Shape;
import org.junit.jupiter.api.Test;

class ShapeFactoryTests {

    @Test
    public void testingFactory() throws Exception {
        Shape circle = ShapeFactory.getInstance().create("circle");
        circle.draw();
    }

}