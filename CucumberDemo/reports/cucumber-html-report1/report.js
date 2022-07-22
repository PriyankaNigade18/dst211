$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Orangehrm.feature");
formatter.feature({
  "line": 1,
  "name": "Orangehrm application login feature",
  "description": "",
  "id": "orangehrm-application-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Login of orangehrm application",
  "description": "",
  "id": "orangehrm-application-login-feature;test-login-of-orangehrm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open Orangehrm application in chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User enters valid username \u0026 valid Password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangehrmTest.open_Orangehrm_application_in_chrome()"
});
formatter.result({
  "duration": 15978475600,
  "status": "passed"
});
formatter.match({
  "location": "OrangehrmTest.user_enters_valid_username_valid_Password()"
});
formatter.result({
  "duration": 823105299,
  "status": "passed"
});
formatter.match({
  "location": "OrangehrmTest.user_click_on_Login_button()"
});
formatter.result({
  "duration": 7080600899,
  "status": "passed"
});
formatter.match({
  "location": "OrangehrmTest.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 28680900,
  "status": "passed"
});
});