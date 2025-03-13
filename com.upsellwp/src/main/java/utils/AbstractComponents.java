package utils;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

public class AbstractComponents {
	
	protected WebDriver driver;
	
	public void handleSecurityPopup() {
		try {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER); //Please Enter to close the popup
		robot.keyRelease(KeyEvent.VK_ENTER);
		System.out.println("Security popup handled successfully");
		} catch(AWTException e) {
			e.printStackTrace();
		}
	}
	
	
}
