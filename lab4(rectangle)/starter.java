import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		Rectangle newRect = new Rectangle(0.0, 0.0, 200.0, 300.0);
		Color newColor = new Color(255,255,0);
		newRect.setColor(newColor);   //YESSS this took too long to figure out
		newRect.draw();
		newRect.fill(); //getting the rectangle to fill also took some time
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
