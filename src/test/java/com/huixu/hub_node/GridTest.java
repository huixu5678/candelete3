package com.huixu.hub_node;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class GridTest {
    @Test
    public void testgrid()throws Exception
    {
        DesiredCapabilities dc=DesiredCapabilities.internetExplorer();
        WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.121:6666/wd/hub"),dc);
        driver.get("http://www.baidu.com");
        Thread.sleep(4000);
    }
}
