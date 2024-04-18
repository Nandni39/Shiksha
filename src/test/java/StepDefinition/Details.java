package StepDefinition;
import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverSetup.SetupDriver;
import PageFactory1.Page;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Details {
	static WebDriver driver;
	Page lp;
	
    @Given("user is on homepage")
    public void user_is_on_homepage() throws InterruptedException, AWTException{
    	driver = SetupDriver.edgedriver();
 	   lp = new Page(driver);
 	  
 	   lp.background();
 	   
    }

 //------------------------------------------------@workExperience------------------------------------------------
    
    @When("user clicks on profile")
    public void user_clicks_on_profile() throws InterruptedException {
        lp.Profile();
    }

    @And("user clicks on userprofile")
    public void user_clicks_on_userprofile() throws AWTException, InterruptedException {
        lp.UserProfile();
    }

    @And("user will scroll down")
    public void user_will_scroll_down() throws AWTException, InterruptedException {
       lp.scroll();
    }

    @And("user clicks on add button")
    public void user_clicks_on_add_button() throws InterruptedException {
       lp.add();
    }

    @And("select current company option")
    public void select_current_company_option() throws InterruptedException {
        lp.currentCompany();
    }

    @And("user enters (.*), (.*), (.*), (.*), (.*)$")
    public void user_enters(String companyName, String Designation, String Department, String JoiningDate, String EndingDate) throws InterruptedException {
       lp.userCredentials(companyName, Designation, Department, JoiningDate, EndingDate);
    }

    @Then("user clicks on save option")
    public void user_clicks_on_save_option() throws InterruptedException {
       lp.savebutton();
       
       Thread.sleep(2000);
       Assert.assertEquals("https://www.shiksha.com/userprofile/edit", driver.getCurrentUrl());

    }
//    @AfterStep
//  	public static void takeScreendown(Scenario scenerio) {
//  		   TakesScreenshot ts= (TakesScreenshot) driver;
//  		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//  		   scenerio.attach(src, "image/png",scenerio.getName());
//  	}
//    


    
//------------------------------------------------WorkExperienceFail-------------------------------------------------------
    
    @When("user clicks on profile button")
    public void user_clicks_on_profile_button() throws InterruptedException {
    	 lp.Profile();
    }

    @And("user select userprofile")
    public void user_select_userprofile() throws AWTException, InterruptedException {
        lp.UserProfile();
    }

    @And("user moves down to work expwerience section")
    public void user_moves_down_to_work_expwerience_section() throws AWTException, InterruptedException {
       lp.scroll();
    }

    @And("clicks on add option to add credentials")
    public void clicks_on_add_option_to_add_credentials() throws InterruptedException {
        lp.add();
    }

    @And("user will enter details (.*), (.*), (.*), (.*)$")
    public void user_will_enter_details(String companyName, String Designation, String Department, String JoiningDate) throws InterruptedException {
    	 lp.userCredentials1(companyName, Designation, Department, JoiningDate);
    }

    @Then("Joining date feild is accepting the values ,(.*)")
    public void joining_date_feild_is_accepting_the_values(String Join) {
        lp.values(Join);
    }
//  @AfterStep
//	public static void takeScreendown(Scenario scenerio) {
//		   TakesScreenshot ts= (TakesScreenshot) driver;
//		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//		   scenerio.attach(src, "image/png",scenerio.getName());
//	}


//------------------------------------------------AddPreferredCity----------------------------------------------------------
    @When("user clicks on profile to explore profile interface")
    public void user_clicks_on_profile_to_explore_profile_interface() throws InterruptedException {
        lp.Profile();
    }

    @And("user clicks userprofile option")
    public void user_clicks_userprofile_option() throws AWTException, InterruptedException {
        lp.UserProfile();
    }

    @And("user scroll left")
    public void user_scroll_left() throws AWTException, InterruptedException {
        lp.scrollLeft();
    }

    @And("user clicks on add Preferred city option to oprn form")
    public void user_clicks_on_add_preferred_city_option_to_oprn_form() {
        lp.clickAddPreferred();
    }
    
    @And("user scroll down")
    public void user_scroll_down() throws AWTException, InterruptedException {
       lp.scrolldown();
    }

    @And("user enters year_of_admission")
    public void user_enters_year_of_admission() throws AWTException, InterruptedException {
       lp.admissionYear();
    }

    @And("user enters city")
    public void user_enters_city() throws InterruptedException, AWTException {
        lp.city();
    }

    @And("user enters Budget")
    public void user_enters_budget() throws InterruptedException, AWTException {
       lp.budget();
    }

    @Then("user clicks on save button")
    public void user_clicks_on_save_button() throws InterruptedException {
       
      
		lp.save();
		Thread.sleep(2000);
        Assert.assertEquals("https://www.shiksha.com/userprofile/edit", driver.getCurrentUrl());
		
    }
//    @AfterStep
//  	public static void takeScreendown(Scenario scenerio) {
//  		   TakesScreenshot ts= (TakesScreenshot) driver;
//  		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//  		   scenerio.attach(src, "image/png",scenerio.getName());
//  	}
    
//------------------------------------------ChangePassword-------------------------------------------------
    
    @When("user selects profile option")
    public void user_selects_profile_option() throws InterruptedException {
        lp.Profile();
    }

    @And("user selects userprofile option")
    public void user_selects_userprofile_option() throws AWTException, InterruptedException {
        lp.UserProfile();
    }

    @And("user clicks on navigation button")
    public void user_clicks_on_navigation_button() throws InterruptedException, AWTException {
        lp.navigationButton();
    }

    @And("user selects settings option")
    public void user_selects_settings_option() throws InterruptedException {
       lp.settingButton();
    }

    @And("user will clicks on change password option")
    public void user_will_clicks_on_change_password_option() throws InterruptedException {
        lp.changePasswordButton();
    }

    @And("user enters current password")
    public void user_enters_current_password(DataTable dataTable) throws InterruptedException {
    	List<String> answer = dataTable.asList(String.class);
    	for (String ans1 : answer) {
			lp.currentPassword(ans1);
		}
    }

    @And("user enters new password")
    public void user_enters_new_password(DataTable dataTable) throws InterruptedException {
    	List<String> answer = dataTable.asList(String.class);
    	for (String ans1 : answer) {
			lp.NewPassword(ans1);
		}
    }

    @And("user enters Re-type new password")
    public void user_enters_re_type_new_password(DataTable dataTable) throws InterruptedException {
    	List<String> answer = dataTable.asList(String.class);
    	for (String ans1 : answer) {
			lp.RetypePassword(ans1);
		}
    }

    @And("user clicks on save option to save new password")
    public void user_clicks_on_save_option_to_save_new_password() throws InterruptedException {
       lp.save1();
    }

    @Then("user re-login with new password")
    public void user_re_login_with_new_password() throws InterruptedException, AWTException {
    	
    		Thread.sleep(2000);
        Assert.assertEquals("https://www.shiksha.com/userprofile/edit/settings", driver.getCurrentUrl());
    }
//  @AfterStep
//  	public static void takeScreendown(Scenario scenerio) {
//  		   TakesScreenshot ts= (TakesScreenshot) driver;
//  		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//  		   scenerio.attach(src, "image/png",scenerio.getName());
//  	}
//    
 //------------------------------------------CompareColleges-------------------------------------------------------

    
  
    @When("user clicks on search bar")
    public void user_clicks_on_search_bar() throws InterruptedException {
        lp.clickSearchBar();
    }

    @And("user will enter any college name")
    public void user_will_enter_any_college_name(DataTable dataTable) throws InterruptedException {
    	List<String> answer = dataTable.asList(String.class);
    	for (String ans1 : answer) {
			lp.collegename1(ans1);
		}
    }

    @And("select name of that college from drop down menu bar")
    public void select_name_of_that_college_from_drop_down_menu_bar() throws InterruptedException {
        lp.drop1();
    }

    @And("user will select compare option")
    public void user_will_select_compare_option() throws InterruptedException {
        lp.compare();
    }

    @And("user will click on add college button")
    public void user_will_click_on_add_college_button() throws InterruptedException {
        lp.compareCollege();
    }

    @And("user will enter name of another college which will be compared with previous college")
    public void user_will_enter_name_of_another_college_which_will_be_compared_with_previous_college(DataTable dataTable) throws InterruptedException {
    	List<String> answer = dataTable.asList(String.class);
    	for (String ans1 : answer) {
			lp.collegename2(ans1);
		}
    }

    @And("user will select degree from drop down option")
    public void user_will_select_degree_from_drop_down_option() throws InterruptedException {
    	 lp.selectDegree();
    }

    @And("user will select specific course for it")
    public void user_will_select_specific_course_for_it() throws InterruptedException {
       lp.selectCourse();
    }

    @Then("user will click on apply option")
    public void user_will_click_on_apply_option() throws InterruptedException {
       lp.applyButton();
       Thread.sleep(2000);
       Assert.assertEquals("https://www.shiksha.com/compare-gndu-vs-parul-university-id-299690-257291", driver.getCurrentUrl());
    }

    //@AfterStep
	//public static void takeScreendown(Scenario scenerio) {
		//   TakesScreenshot ts= (TakesScreenshot) driver;
		  // final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   //scenerio.attach(src, "image/png",scenerio.getName());
	//}


}