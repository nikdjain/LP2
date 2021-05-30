package snjb1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mouthshut {

	WebDriver driver;
	
	public Mouthshut()
	{
		
			Map<String, Object> prefs = new HashMap<String, Object>();
        
        // Set the notification setting it will override the default setting
			prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create object of ChromeOption class
			ChromeOptions options = new ChromeOptions();

        // Set the experimental option
			options.setExperimentalOption("prefs", prefs);

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\anshp\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			driver = new ChromeDriver();
		
			driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

	}
	
	//-----------------How to fetch Data code
	public void fetchdata(String kk) throws InterruptedException, FileNotFoundException, UnsupportedEncodingException
	{
		
		driver.get(kk);
		
		driver.manage().window().maximize();
		
		List<WebElement> po=driver.findElements(By.xpath("//div[@class=\"more reviewdata\"]"));
		
		List<WebElement> re=driver.findElements(By.linkText("Read More"));  //xpath("//*[@id=\"ctl00_ctl00_ContentPlaceHolderFooter_ContentPlaceHolderBody_rptreviews_ctl02_lireviewdetails\"]/div[2]/a"));
		
		System.out.println("total :"+po.size());  //po indicate post size
		
		System.out.println("total :"+re.size());
		
		for(int i=0;i<po.size();i++)
		{
			re.get(i).click();
	
			String title=po.get(i).getText();
			
			System.out.println("Post :"+title+"\n");
		} 
		
	}
		
	public void fetchdata_justdial(String kk, int pages) throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			driver.get(kk);
			
			for(int j=0;j<pages;j++)
				{
		            List<WebElement> post=driver.findElements(By.xpath("//p[@class=\"rwopinion2 thr lng_commn\"]"));
			        
		            System.out.println("size "+post.size());
			
			for(int i=2;i<post.size();i++)
			    {
				
				   String title=post.get(i).getText();
				
			       System.out.println("Post :"+title+"\n");
				} 
		   
			 Thread.sleep(2000);
			// driver.findElement(By.xpath("//a[text()='Next']"));
			
			 String s="//a[text()='subrat('po','','','','3','020PXX20.XX20.170713130727.D5A6,020PXX20.XX20.170908182730.Q7E5,020PXX20.XX20.140925201503.R3Z5,020P5021542,020PXX20.XX20.140724163507.V7T9','','');']'";
					 
			 js.executeScript("document.getElement(By.xpath(s).click()");
					 
		       }
		
     	}
 		
 public void f_just(String url, int no_page) throws FileNotFoundException, UnsupportedEncodingException
 {   //span[@class="rName"]
	//div[@class="vew_opn"]
	 driver.get(url);
	 
	 PrintWriter writer = new PrintWriter("PICT.txt", "UTF-8");
	
	 writer.println("url : "+url);

 for(int j=0;j<no_page;j++)
 {
	 List<WebElement> name=driver.findElements(By.xpath("//span[@class=\"rName\"]"));
	 
	 List<WebElement> post=driver.findElements(By.xpath("//div[@class=\"vew_opn\"]"));
	 
	 for(int i=0;i<post.size();i++)
	 {
		    String na=name.get(i).getText();
			System.out.println("\n Name: "+na+"\n");
			writer.println("Name: "+na);
		    String title=post.get(i).getText();
			System.out.println("Post :"+title+"\n"); 
			 
			 writer.println("Post :"+title);
			 
	 }//i
	 
	 driver.get(url+"/page-"+(j+2));
 }//j
 writer.close();
 }
		
  public void best_h(String url) throws FileNotFoundException, UnsupportedEncodingException, InterruptedException {
	//h4[@class="rev-heading"]
	//p[@class="rev-body"]
	 driver.get(url);
	 PrintWriter writer = new PrintWriter("PICT.txt", "UTF-8");
	 writer.println("Website :"+url);
	 Thread.sleep(10000);
	 List<WebElement> name=driver.findElements(By.xpath("//h4[@class=\"rev-heading\"]"));
	 List<WebElement> post=driver.findElements(By.xpath("//p[@class=\"rev-body\"]"));
	 //WebElement we=driver.findElement(By.xpath("//h4[@class=\"rev-heading\"]"));
	
	// WebElement po=driver.findElement(By.xpath("//p[@class=\"rev-body\"]"));
	//while(we!= null)
  for(int i=0;i<post.size();i++)
	 {
		    Thread.sleep(1000);
      /*
		    if(driver.findElement(By.id("scroll-more-link"))!= null){
		    	driver.findElement(By.id("scroll-more-link")).click();
		    	Thread.sleep(1000);	
		    }
		    */
		    String na=name.get(i).getText();
		    //String na=we.getText();
			System.out.println("Heading: "+na+"\n");
			writer.println("Heading: "+na);
		    String title=post.get(i).getText();
			// title=po.getText();
			System.out.println("Post :"+title+"\n"); 
			 writer.println("Post :"+title);
			 
	 }//i
	 
	 
  writer.close();
 }
	public static void main(String[] args) throws InterruptedException, FileNotFoundException, UnsupportedEncodingException {
		// TODO Auto-generated method stub
		
       
		String k= "https://www.justdial.com/Pune/Pune-Institute-Of-Computer-Technology-Behind-Bharati-Vidyapeeth-College-Dhankawadi/020PXX20-XX20-170919135655-H5C3_BZDET/reviews";
		Mouthshut M= new Mouthshut();
		M.f_just(k, 1);

	     
	}

}
