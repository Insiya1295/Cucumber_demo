$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/training_h2a.06.15/Desktop/Selenium_workplace/Cucumber_Demo_Project/Feature456/mytest999.feature");
formatter.feature({
  "name": "Test validation for the git jenkins integration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "My demo report validation in jenkins today",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "TestMe is up and running",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginFunctionality.testme_is_up_and_running()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "registered user enters the valid creds",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFunctionality.registered_user_enters_the_valid_creds()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifies for the login status for cred",
  "keyword": "And "
});
formatter.match({
  "location": "LoginFunctionality.verifies_for_the_login_status_for_cred()"
});
formatter.result({
  "status": "passed"
});
});