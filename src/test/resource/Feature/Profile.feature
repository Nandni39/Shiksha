
Feature: To check work experience section is taking details of user
Background:
Given user is on homepage

@WorkExperience
  Scenario Outline: To validate work experience section with valid credentials
  
    
    When user clicks on profile
    And user clicks on userprofile
    And user will scroll down
    And user clicks on add button
    And select current company option
    And user enters <companyName>, <Designation>, <Department>, <JoiningDate>, <EndingDate>
    Then user clicks on save option

   Examples:
    |companyName||Designation||Department||JoiningDate||EndingDate|
    |"Capgemini"||"Analyst"||"Java"||"12122001"||"11112002"|
 
    
@WorkExperienceFail
  Scenario Outline: To check all the feilds of work experience section 
  
  When user clicks on profile button
  And user select userprofile
  And user moves down to work expwerience section
  And clicks on add option to add credentials
  And user will enter details <companyName>, <Designation>, <Department>, <JoiningDate>
  Then Joining date feild is accepting the values ,<Join>
  
  Examples:
   |companyName||Designation||Department||JoiningDate||Join|
   |"TCS"||"Software Engineer"||"Automation Testing"||"1212200001"||"12122001"|
    
 @AddPreferredCity
   Scenario Outline: To check functionality of preferred city form  
   
     When user clicks on profile to explore profile interface
     And user clicks userprofile option
     And user scroll left
     And user clicks on add Preferred city option to oprn form
     And user scroll down
     And user enters year_of_admission
     And user enters city
     And user enters Budget
     Then user clicks on save button
     
  @ChangePassword
    Scenario: To test the working of change password option
    
     When user selects profile option
     And user selects userprofile option
     And user clicks on navigation button
     And user selects settings option
     And user will clicks on change password option
     And user enters current password
     |Nandni@123|
     And user enters new password
     |Nandni@12345|
     And user enters Re-type new password
     |Nandni@12345|
     And user clicks on save option to save new password
     Then user re-login with new password
     
  @CompareColleges
     Scenario: To compare two different colleges
     
      When user clicks on search bar
      And user will enter any college name
      |GNDU|
      And select name of that college from drop down menu bar
      And user will select compare option 
      And user will click on add college button
      And user will enter name of another college which will be compared with previous college
      |PU|
      And user will select degree from drop down option
      And user will select specific course for it
      Then user will click on apply option
      
     
 

  
  
  
  
  
  
  