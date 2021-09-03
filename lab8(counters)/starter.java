import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {
	static Rectangle m;
	static int counter = 0;

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		m = new Rectangle(50,100,300,300);
		Color newColor = new Color(255,200,50);
		m.setColor(newColor);
		m.draw();
		m.fill();
		Rectangle a = new Rectangle(297,0,5,500);
		a.draw();
		a.fill();
		Rectangle b = new Rectangle(0,297,500,5);
		b.draw();
		b.fill();

	}

	public void onMouseClick(double x, double y) {
		// enter code here
		if(counter<10){
			if(x<300){
				m.translate(-5.0,0.0);
			}
			else if(x>=300){
				m.translate(5.0,0.0);
			}
			if(y<300){
				m.translate(0.0,-5.0);
			}
			else if(y>=300){
				m.translate(0.0,5.0);
			}
			counter++;
		}
	}

	public void keyPress(String s) {
		// enter code here

	}
}
