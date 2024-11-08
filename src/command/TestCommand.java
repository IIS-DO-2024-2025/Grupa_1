package command;

import java.awt.Color;

import mvc.DrawingModel;
import mvc.Line;
import mvc.Point;

public class TestCommand {

	public static void main(String[] args) {
		DrawingModel model = new DrawingModel();
		Point p1 = new Point(10, 10, Color.BLACK);
		
		System.out.println("1. Dužina liste: " + model.getShapes().size());

		// Testiranje dodavanja
		// model.add(p1);    ---> menjamo jer implementiramo undo/redo
		AddPointCmd addPointCmd = new AddPointCmd(model, p1);
		
		addPointCmd.execute();
		System.out.println("2. Dužina liste: " + model.getShapes().size());
		
		addPointCmd.unexecute();
		System.out.println("3. Dužina liste: " + model.getShapes().size());
		
		addPointCmd.execute();
		System.out.println("4. Dužina liste: " + model.getShapes().size());
		
		// Testiranje brisanje
		Command removePointCmd = new RemovePointCmd(model, p1);
		
		removePointCmd.execute();
		System.out.println("5. Dužina liste: " + model.getShapes().size());
		
		removePointCmd.unexecute();
		System.out.println("6. Lista: " + model.getShapes());
		
		// Testiranje modifikacije
		Point p2 = new Point(20, 20, Color.BLACK);
		
		UpdatePointCmd updatePointCmd = new UpdatePointCmd(p1, p2);
		
		updatePointCmd.execute();
		System.out.println(model.getShapes());
		
		updatePointCmd.unexecute();
		System.out.println(model.getShapes());
		
		Line l1 = new Line(p1, p2, Color.BLACK);
		Line l2 = new Line(new Point(30, 30, Color.BLACK), new Point(40, 40, Color.BLACK), Color.BLACK);
		
		UpdateLineCmd updateLineCmd = new UpdateLineCmd(l1, l2);
		updateLineCmd.execute();
		
		System.out.println(l1);
	}

}
