package com.demoblaze.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ScreenShot {

    public static void takeScreenShot(WebDriver driver, String fileName)
    {
        try {
            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File dest =new File("test-output/screenshots/"+fileName+".png");
            FileUtils.copyFile(src,dest);
        }
       catch (Exception e)
       {
           System.out.println("Error: " + e.getMessage());
       }
    }

}
