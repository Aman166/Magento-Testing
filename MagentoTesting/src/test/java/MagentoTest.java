import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagentoTest {
	@Test
	public void magentoTest()
	{
		WebDriver driver;
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.com");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		Welcome w=new Welcome(driver);
		w.clickonMyaccount();
		Login l=new Login(driver);
		l.typeEmail();
		l.typePassword();
		l.clickonLogin();
		Home h=new Home(driver);
		h.clickonLogout();
		driver.quit();
	}

}
