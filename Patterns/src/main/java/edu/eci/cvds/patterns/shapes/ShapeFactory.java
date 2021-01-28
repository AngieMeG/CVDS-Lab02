package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;

public class ShapeFactory {
	public static Shape create(RegularShapeType type) throws IllegalArgumentException{
		Shape shape;
		switch (type){
			case Triangle:
				shape = new Triangle();
				break;
			case Quadrilateral:
				shape = new Quadrilateral();
				break;
			case Pentagon:
				shape = new Pentagon();
				break;
			case Hexagon:
				shape = new Hexagon();
				break;
			default:
				throw new IllegalArgumentException();
		}
		return shape;	
	}

}