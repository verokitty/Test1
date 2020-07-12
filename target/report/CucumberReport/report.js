$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestHome.feature");
formatter.feature({
  "line": 2,
  "name": "verify HomePage",
  "description": "",
  "id": "verify-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Home_Test1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Verify the Icon-HomePage",
  "description": "",
  "id": "verify-homepage;verify-the-icon-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Check the logo Redirects to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Page_Home_Stepdef.Home_Page()"
});
formatter.result({
  "duration": 17852261036,
  "status": "passed"
});
formatter.match({
  "location": "Page_Home_Stepdef.Check_the_logo_Redirects_to_Home_page()"
});
formatter.result({
  "duration": 5555526106,
  "status": "passed"
});
});