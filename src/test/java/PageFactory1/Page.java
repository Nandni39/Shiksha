package PageFactory1;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.messages.types.Duration;
 
public class Page {
	
	static WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//a[text()=\"Login\"]") 
	WebElement login;
	@FindBy(xpath="//input[@placeholder=\"Email address\"]") 
	WebElement email;
	@FindBy(xpath="//input[@class=\"input password\"]") 
	WebElement password;
	@FindBy(xpath="//button[text()=\"Login\"]") 
	WebElement submit;
	
	@FindBy(xpath="//strong[@class=\"gnbY21UserName\"]") 
	WebElement userprofile;
	@FindBy(xpath="//a[@href=\"/userprofile/edit\"]")
	WebElement profile;
	
	@FindBy(xpath="//*[@id=\"main-wrapper\"]/div[1]/div/div[2]/div[3]/div[2]/div/div/div/div[2]/button")
	WebElement add;
	@FindBy(xpath="//div[@class=\"chip chip--outlined chip--secondary\"][1]")
	WebElement companyOption;
	
	@FindBy(xpath="(//div[@class=\"text-field\"]/input)[1]")
	WebElement companyName;
	@FindBy(xpath="(//div[@class=\"text-field\"]/input)[2]")
	
	WebElement designation;
	@FindBy(xpath="(//div[@class=\"text-field\"]/input)[3]")
	WebElement department;
	@FindBy(xpath="//input[@class=\"_9ad5\"]")
	WebElement join;
	@FindBy(xpath="(//div[@class=\"f5fe\"]/div[@class=\"FieldWrapper _2225\"])[5]/div/input")
	WebElement end;

	@FindBy(xpath="//button[@class=\"custom-button custom-button--primary _0df6\"]")
	WebElement save;
	@FindBy(xpath="//button[@class=\"custom-button custom-button--link _95b6\"]")
	WebElement addExperience;
	
	
	
	
		public Page (WebDriver driver)
		{
	    	this.driver=driver;
	    	PageFactory.initElements(driver, this);
 
	    }
		//LOGIN
		public void background() throws InterruptedException, AWTException
		{
			login.click();
			Thread.sleep(2000);
			email.sendKeys("bhardwajnandni063@gmail.com");
			Robot robot = new Robot();
			int xCoordinate = 500;
		    int yCoordinate = 500;
		    robot.mouseMove(xCoordinate, yCoordinate);
		    Thread.sleep(2000);
		    password.sendKeys("Nandni@12345");
		    Thread.sleep(2000);
			submit.click();
			Thread.sleep(1000);
		}
	
//------------------------------------------------@WorkExperience----------------------------------------------------------
		
		public void Profile() throws InterruptedException
		{
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", userprofile);
		}
		public void UserProfile() throws AWTException, InterruptedException 
		{
			Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", profile);
			
			
		}
		
		public void scroll() throws AWTException, InterruptedException {
			
			Thread.sleep(100);
			Robot r1 = new Robot();
			r1.mouseMove(60, 600);
			Thread.sleep(1000);
			r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
			Thread.sleep(1000);
			
		}
		
		public void add() throws InterruptedException {
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(add));
		    js.executeScript("arguments[0].scrollIntoView(true);", add);
		    add.click();
		    
		
		}
      public void currentCompany() throws InterruptedException {
    	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(companyOption));
    	  companyOption.click();
      }
      
         
      public void userCredentials(String name, String desg, String depart,String Join,String End) throws InterruptedException {
    	  
    	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(companyName));
    	  companyName.click();
    	  companyName.sendKeys(name);
    	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(designation));
    	  designation.click();
    	  designation.sendKeys(desg);
    	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(department));
    	  department.click();
    	  department.sendKeys(depart);
    	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(join));
    	  join.sendKeys(Join);
    	  end.sendKeys(End);
    	  
    	  
    	  
    	 
      }
      
   public void savebutton() {
	    save.click(); 
	   
   }
   
   
   
 //---------------------------------------------@workExperienceFails---------------------------------------------
 //button[@class="custom-button custom-button--link _95b6"]
   public void userCredentials1(String name, String desg, String depart,String Join) throws InterruptedException {
 	  
	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(companyName));
 	  companyName.click();
 	  companyName.sendKeys(name);
 	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(designation));
 	  designation.click();
 	  designation.sendKeys(desg);
 	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(department));
 	  department.click();
 	  department.sendKeys(depart);
 	  wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(join));
 	  join.sendKeys(Join);
 	 
   }
   
   public void values(String Joining) {
	   WebElement e1 = driver.findElement(By.xpath("//input[@class=\\\"_9ad5\\\"]"));
		String res = e1.getText();
		Assert.assertEquals(Joining,res);
   }
 //---------------------------------------------@AddPreferredCity-----------------------------------------------
   
   @FindBy(xpath="(//button[@class=\"custom-button custom-button--primary\"])[4]") 
   WebElement scleft;
	 
	 @FindBy(xpath="(//div[@class=\"text-field\"]/input)[1]") 
	 WebElement year;
	 @FindBy(xpath="//ul[@class=\"_69be\"]/li[1]/span") 
	 WebElement year1;
	 @FindBy(xpath="(//div[@class=\"text-field\"]/input)[2]") 
	 WebElement city;
	 @FindBy(xpath="//ul[@class=\"_69be _0bd8\"]/li[1]/span") 
	 WebElement city1;
	 @FindBy(xpath="//div[@class=\"_7010\"]/button[@class=\"custom-button custom-button--primary\"]") 
	 WebElement saveoption;
	 @FindBy(xpath="//div[@class=\"paper-card section-form__section-card\"][2]/div[@class=\"_0e47 _2225\"][3]/div[@class=\"FieldWrapper\"]") WebElement Budget;
	 @FindBy(xpath="//ul[@class=\"_69be\"]/li[3]/span") 
	 WebElement Budget1;
	
	 @FindBy(xpath="//button[@class=\"custom-button custom-button--primary _0df6\"]") 
	 WebElement save1;
	
	 
	 @FindBy(xpath="//div[@class=\"FieldWrapper\"]/div[@class=\"text-field isError\"]/input") 
	 WebElement click11;
	 @FindBy(xpath="(//ul[@class=\"_69be _0bd8\"]/li)[1]") 
	 WebElement click22;
	 @FindBy(xpath="(//button[@class=\"custom-button custom-button--primary\"])[8]") 
	 WebElement click33;
	
	public void scrollLeft() throws AWTException, InterruptedException {
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView({block: 'nearest', inline: 'start'});", scleft);
		
		
	}
	
	public void clickAddPreferred() {
		scleft.click();
	}
	
	public void scrolldown() throws AWTException, InterruptedException {
		Robot r1 = new Robot();
		r1.mouseMove(600, 600);
		Thread.sleep(1000);
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(1000);
			}
	
	public void admissionYear() throws AWTException, InterruptedException{
		
		Thread.sleep(1000);
		year.click();
		year1.click();
	}
	
	public void city() throws InterruptedException, AWTException {
		
		Thread.sleep(1000);
		city.click();
		city1.click();
		Thread.sleep(1000);
		saveoption.click();
		Thread.sleep(0);
	}
	
	public void budget() throws InterruptedException, AWTException {
		Thread.sleep(1000);
		
		Budget.click();
		Budget1.click();
		Thread.sleep(1000);
	}
	
	public void save() throws InterruptedException {
		
		Thread.sleep(1000);
		save1.click();
		
	}
 
 //----------------------------------------ChangePassword--------------------------------------------------------
   
	@FindBy(xpath="//div[@class=\"menu-button__wrapper\"]")
	WebElement navigation;
	@FindBy(xpath="//div[@class=\"personal-info__menu-wrapper\"]/div[text()=\"Settings\"]")
	WebElement settings;
	@FindBy(xpath="//div[@class=\"paper-card c963\"]/div[@class=\"cb10\"][1]")
	WebElement changePassword;
	
	@FindBy(xpath="//input[@type='password']")
	
	WebElement Password;
	@FindBy(xpath="(//input[@type='password'])[2]")
	
	WebElement NewPassword;
	@FindBy(xpath="(//input[@type='password'])[3]")WebElement RePassword;
	
	@FindBy(xpath="//button[@class=\"custom-button custom-button--primary\"]")
	WebElement saveButton;
	
	public void navigationButton() throws InterruptedException, AWTException {
		Robot r1 = new Robot();
		r1.mouseMove(10, 500);
		Thread.sleep(1000);
		r1.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		navigation.click();
	}
	
	public void settingButton() throws InterruptedException {
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(settings));
		settings.click();
	}
	public void changePasswordButton() throws InterruptedException {
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(changePassword));
		changePassword.click();
	}
	
	public void currentPassword(String Pass) throws InterruptedException {
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(Password));
		Password.click();
		Password.sendKeys(Pass);
		
	}
	
	public void NewPassword(String newPass) throws InterruptedException {
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(NewPassword));
		NewPassword.click();
		NewPassword.sendKeys(newPass);
		
	}
	
	public void RetypePassword(String rePass) throws InterruptedException {
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(RePassword));
		RePassword.click();
		RePassword.sendKeys(rePass);
		
	}
	
	public void save1() throws InterruptedException {
		wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(saveButton));
		saveButton.click();
		
	}
	

	
 //----------------------------------------CompareColleges--------------------------------------------------------
	 @FindBy(xpath="//div[@class=\"pwadesktop-srchbox\"]")
	 WebElement searchBar;
	 @FindBy(xpath="(//span[@class=\"getName mainTuple\"])[1]")
	 WebElement dropdown1;
	 @FindBy(xpath="//div[@class=\"inputDiv\"]/input") 
	 WebElement college11;
	 @FindBy(xpath="//button[@class=\"b41b dfb4 _2782 _45b356\"]")
	 WebElement compare;
	 @FindBy(xpath=" (//div[@class=\"flexColumnCenterMiddle dotbox\"])[4]") 
	 WebElement addcollege22;
	 @FindBy(xpath="//div[@class=\"search-TextField ce230a\"]/input") 
	 WebElement college22;
	 @FindBy(xpath="//ul[@class=\"c53873\"]/div[1]") 
	 WebElement selectcollege2;
	 @FindBy(xpath="//div[@class=\"e0bf5d\"]") 
	 
	 WebElement select1;
	 @FindBy(xpath="//div[@class=\"_3780fd\"][1]") 
	 WebElement select2;
	 @FindBy(xpath="(//div[@class=\"_63138a \"])[2]") 
	 WebElement select3;
	 @FindBy(xpath="//div[@class=\"_8fb0a9  bba51f\"]/div[@class=\"_3780fd\"][1]") 
	 WebElement select4;
	 @FindBy(xpath=" (//div[@class=\"btnBox\"]/button)[1]") 
	 WebElement apply;
	
   public void clickSearchBar() throws InterruptedException {
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(searchBar));
	   searchBar.click();
	   
   }
   
   public void collegename1(String college1) throws InterruptedException {
	   Thread.sleep(1000);
	   college11.sendKeys(college1);
	   
   }

   public void drop1() throws InterruptedException {
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(dropdown1));
	   dropdown1.click();
	  
   }
   public void compare() throws InterruptedException {
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(compare));
	   compare.click();
   }
   public void compareCollege() throws InterruptedException {
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(addcollege22));
	   addcollege22.click();
   }
   public void collegename2(String college2) throws InterruptedException {
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(college22));
	   college22.sendKeys(college2);
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(selectcollege2));
	   selectcollege2.click();
   }
  
   public void selectDegree() throws InterruptedException {
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(select1));
	   select1.click();
	   select2.click();
   }
   public void selectCourse() throws InterruptedException {
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(select3));
	   select3.click();
	   select4.click();
   }
   
   public void applyButton() {
	   wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));wait.until(ExpectedConditions.elementToBeClickable(apply));
	   apply.click();
   }
   
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
 