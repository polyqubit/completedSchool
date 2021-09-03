import pkg.*;
import java.util.ArrayList;

public class starter implements InputControl, InputKeyControl {

	public static void main(String args[]) {
		// please leave following line alone, necessary for keyboard/mouse input
		//KeyController kC = new KeyController(Canvas.getInstance(),new starter());
		//MouseController mC = new MouseController(Canvas.getInstance(),new starter());
		
		System.out.println("Enter your name:");
		
		EasyReader input = new EasyReader();
		String name = input.readWord();
		System.out.print("Happy Birthday, to you. \nHappy Birthday, to you. \nHappy Birthday dear "+name+", \nHappy Birthday, to you.");
	}

	public void onMouseClick(double x, double y) {
		// enter code here

	}

	public void keyPress(String s) {
		// enter code here

	}
}
