package practiceproject;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");   
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load - implicit
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		WebElement SearchFile = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchFile.sendKeys("Iphone 12");
		WebElement Btn = driver.findElement(By.xpath("//*[@class='nav-search-submit nav-sprite']"));
		
		Btn.click();
		
		
//		String Iphone12="//*[@class='a-size-medium a-color-base a-text-normal']";
//		String value ="//*[@class='a-offscreen']";
//
//		String text=driver.findElement(By.xpath(Iphone12)).getAttribute("title"));
//		//System.out.println(text);
//
//		String price=driver.findElement(By.xpath(value)).getText());
//		
		
			List<WebElement> P1 = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
			List<WebElement> Pp1 = driver.findElements(By.xpath("//*[@class='a-price-whole']"));
			System.out.println(P1.size());
			System.out.println(Pp1.size());
			
			for(int i=0 ;i<P1.size();i++)
			{
				System.out.println("Product Name = " +P1.get(i).getText()+ "price is "+Pp1.get(i).getText());
			}

			
			/*for(WebElement elm : P1) {
				
				System.out.println(elm.getText());
				
			}	
			for(WebElement price1 : Pp1) {
		
				System.out.println(price1.getText());
			}*/
			
	/*
	     HashMap<String,String> values= new HashMap<String,String>();
        
        
        System.out.println(text.size());
        for (int i=0;i<=price.size()-1;i++) {
            if (text.get(i).getText().contains("Apple iPhone 12")) {
            
            values.put(text.get(i).getText(), price.get(i).getText());
        }
        }
        
        for(Map.Entry<String, String> entry1 :values.entrySet()) {
	 */
	
			
			
		
		driver.close();	

}

}