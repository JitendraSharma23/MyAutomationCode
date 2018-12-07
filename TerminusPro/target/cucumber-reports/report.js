$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Verify Login functionality",
  "description": "",
  "id": "verify-login-functionality",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login_steps_definations.user_is_on_login_page()"
});
formatter.result({
  "duration": 22057971437,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Verify user should not be able to login with invalid credentials",
  "description": "",
  "id": "verify-login-functionality;verify-user-should-not-be-able-to-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user enter invalid username and password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "login unsucessful",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "login_steps_definations.user_enter_invalid_username_and_password()"
});
formatter.result({
  "duration": 55616633,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id \u003d \u0027logintxtUserName\u0027]\"}\n  (Session info: chrome\u003d70.0.3538.110)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.2\u0027, revision: \u002710229a9\u0027, time: \u00272017-08-21T17:29:55.15Z\u0027\nSystem info: host: \u0027INNOPHLT10QA013\u0027, ip: \u002710.1.30.102\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_191\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab), userDataDir\u003dC:\\Users\\jksharma\\AppData\\Local\\Temp\\scoped_dir3704_27012}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003d, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d70.0.3538.110, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 3529714aaddd00b64700dd847ee484c0\n*** Element info: {Using\u003dxpath, value\u003d//input[@id \u003d \u0027logintxtUserName\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:414)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:513)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:406)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.sendKeys(Unknown Source)\r\n\tat com.terminus.pageHelper.LoginPageHelper.Enter_Invalid_UserNamePassword(LoginPageHelper.java:15)\r\n\tat com.terminus.pageStepDefinations.login_steps_definations.user_enter_invalid_username_and_password(login_steps_definations.java:19)\r\n\tat ✽.And user enter invalid username and password(Login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "login_steps_definations.login_unsucessful()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "login_steps_definations.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login_steps_definations.user_is_on_login_page()"
});
formatter.result({
  "duration": 18995436953,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Verify user should able to login with valid credentials",
  "description": "",
  "id": "verify-login-functionality;verify-user-should-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user enter valid username and password",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "login sucessful",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "login_steps_definations.user_enter_valid_username_and_password()"
});
formatter.result({
  "duration": 5291977575,
  "status": "passed"
});
formatter.match({
  "location": "login_steps_definations.login_sucessful()"
});
formatter.result({
  "duration": 2198802,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat com.terminus.pageStepDefinations.login_steps_definations.login_sucessful(login_steps_definations.java:43)\r\n\tat ✽.Then login sucessful(Login.feature:14)\r\n",
  "status": "pending"
});
formatter.match({
  "location": "login_steps_definations.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
});