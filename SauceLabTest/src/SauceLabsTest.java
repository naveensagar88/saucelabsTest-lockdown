import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.remote.RemoteWebDriver;


public class SauceLabsTest {

public static final String USERNAME = "12345nns";

  public static final String ACCESS_KEY = "c7b145c7-7602-4ec2-9f65-aa68114412a7";

  public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";


public static void main(String[] args) throws MalformedURLException {

// TODO Auto-generated method stub


DesiredCapabilities caps = DesiredCapabilities.chrome();

caps.setCapability("platform", "Windows 7");

caps.setCapability("version", "51.0");

WebDriver driver=new RemoteWebDriver(new URL(URL), caps);

driver.get("http://google.com");
driver.findElement(By.xpath("//input[@name='q']")).sendKeys("corona");
System.out.println(driver.getTitle());

}


}


