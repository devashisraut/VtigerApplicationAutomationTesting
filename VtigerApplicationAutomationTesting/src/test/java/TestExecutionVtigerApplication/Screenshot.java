package TestExecutionVtigerApplication;


import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		String time = LocalDateTime.now().toString().replace(":","-");
		driver.get("https://chat.qspiders.com/");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src=tss.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Devashis\\OneDrive\\Desktop\\New folder\\"+time+"dhs.png");
		FileUtils.copyFile(src,des);
				

	}

}
