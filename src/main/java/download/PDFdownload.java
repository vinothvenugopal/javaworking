package download;

import java.util.HashMap;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class PDFdownload {
	@Test
	public void downloadPDF()
	{
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("plugins.plugins_disabled", new String[] {"Chrome PDF Viewer"});
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("plugins.always_open_pdf_externally", true);
		
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability("download.default_directory","C:");
		cap.setCapability("download.prompt_for_download","false");
		cap.setCapability("directory_upgrade","true");
		cap.setCapability("plugins.plugins_disabled","Chrome PDF Viewer");
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);

        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(cap);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN);
		action.build().perform();;
		driver.get("https://file-examples.com/index.php/sample-documents-download/sample-pdf-download/");
		driver.findElementByXPath("(//a[text()='Download sample pdf file'])[1]").click();
	}
}
