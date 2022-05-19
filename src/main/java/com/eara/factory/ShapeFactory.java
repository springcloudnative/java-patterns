package com.eara.factory;

import com.eara.domain.Circle;
import com.eara.domain.Rectangle;
import com.eara.domain.Shape;
import lombok.Data;
import lombok.Getter;

import java.util.Properties;

@Data
public class ShapeFactory implements AbstractFactory<Shape> {
    @Getter
    private static ShapeFactory instance;
//    private Rectangle rectangle;
//    private Circle circle;
//    private Shape shape;

    private Properties properties;

/*    private ShapeFactory() {
        try {
            properties = new Properties();
            properties.load(this.getClass().getResourceAsStream("/application.properties"));

            rectangle = (Rectangle) Class.forName(properties.getProperty("rectangle"))
                    .getDeclaredConstructor().newInstance();

            circle = (Circle) Class.forName(properties.getProperty("circle"))
                    .getDeclaredConstructor().newInstance();
        } catch(Exception e) {
            System.err.println("Unable to create the context");
        }
    }*/

    static {
        instance = new ShapeFactory();
    }

    @Override
    public Shape create(String objectType) {
        Shape shape = null;

        try {
            properties = new Properties();
            properties.load(this.getClass().getResourceAsStream("/application.properties"));

            switch (objectType) {
                case "rectangle":
                    shape = (Rectangle) Class.forName(properties.getProperty("rectangle"))
                            .getDeclaredConstructor().newInstance();
                case "circle":
                    shape = (Circle) Class.forName(properties.getProperty("circle"))
                            .getDeclaredConstructor().newInstance();

            }
        } catch(Exception e) {
            System.err.println("Unable to create the context");
        }

        return shape;
    }
}
