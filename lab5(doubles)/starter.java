import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		//KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		//MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		System.out.println("Enter temperature in Fahrenheit:");
		
		EasyReader input = new EasyReader();
		double name = input.readDouble();
		
		double celc = (name-32)*5/9;
		System.out.print(celc+" degrees");
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
