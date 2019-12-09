package com.spicejet.Utilities;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.spicejet.TestBase.BaseTest;

public class Eventlistner extends BaseTest implements WebDriverEventListener{

	public void beforeAlertAccept(WebDriver driver) {
		System.out.println("beforeAlertAccept");
		
	}

	public void afterAlertAccept(WebDriver driver) {
		System.out.println("afterAlertAccept");
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		System.out.println("afterAlertDismiss");
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		System.out.println("beforeAlertDismiss");
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigating to URL : " +url);
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigated to URL: " +url);
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Navigating backwards");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("Navigated back");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Navigating Forward");
		
	}

	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigated Forward");
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Before Refresh");
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("After Refresh");
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Finding : "+element.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Found : "+element.toString());
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("ready to click on : "+element.toString());
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("Clicked on "+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Going to swith window to "+windowName);
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occured: " + error);
		try {
			Screenhothelper.takeScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("Before get Text from element" +element.toString());
		
	}

	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("After get text from elemrnt: "+element.toString());
		
	}
	

}
