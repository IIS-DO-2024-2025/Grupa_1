package mvc;

import java.awt.Color;
import java.awt.event.MouseEvent;

import composite.SremBanatBacka;

public class DrawingController {

	private DrawingModel model;
	private DrawingFrame frame;
	
	public DrawingController(DrawingModel model, DrawingFrame frame) {
		super();
		this.model = model;
		this.frame = frame;
	}

	public void mouseClicked(MouseEvent e) {
		/*   MVC materijal
	 	Point p = new Point(e.getX(), e.getY(), Color.BLUE);
		model.add(p);
		frame.repaint(); */ 
		
		// Testiranje composite obrasca
		SremBanatBacka vojvodina = new SremBanatBacka();
		Point srem = new Point(20, 20, Color.BLUE);
		Point backa = new Point(30, 20, Color.BLUE);
		Point banat = new Point(25, 12, Color.BLUE);
		
		vojvodina.add(srem);
		vojvodina.add(backa);
		vojvodina.add(banat);
		
		model.add(vojvodina);
		
		frame.repaint();
	}
	
	
	
}
