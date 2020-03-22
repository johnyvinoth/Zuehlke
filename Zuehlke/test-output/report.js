$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/ALogin.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sucessful Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SuccessfulLogin"
    },
    {
      "name": "@AllTests"
    }
  ]
});
formatter.step({
  "name": "user Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks SignIn link",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_SignIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"johnyvinoth@gmail.com\" and Password as \"ferrari\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"My account - My Store\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Success message should display \"Welcome to your account. Here you can manage all of your personal information and orders.\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.success_message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Sign out link",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_click_on_Sign_out_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Login - My Store\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "UnSucessful Login with InValid Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@FailLogin"
    },
    {
      "name": "@AllTests"
    }
  ]
});
formatter.step({
  "name": "user Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks SignIn link",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_SignIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"johny@gmail.com\" and Password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error message should display \"Invalid password.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.error_message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Login - My Store\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:Features/CartFeatures.feature");
formatter.feature({
  "name": "CartFeatures",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add a product to the Cart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AddToCard"
    },
    {
      "name": "@AllTests"
    },
    {
      "name": "@CartFeatures"
    }
  ]
});
formatter.step({
  "name": "user Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks SignIn link",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_clicks_SignIn_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"johnyvinoth@gmail.com\" and Password as \"ferrari\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as_and_Password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"My account - My Store\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Success message should display \"Welcome to your account. Here you can manage all of your personal information and orders.\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.success_message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Home button",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.user_click_on_Home_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add a product to the cart",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.add_a_product_to_the_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Proceed to Checkout button from Popup",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_Proceed_to_Checkout_button_from_Popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Order - My Store\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message should display \"Shopping-cart summary\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Proceed to Checkout button from Shopping Cart Summary page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_Proceed_to_Checkout_button_from_Shopping_Cart_Summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message should display \"Addresses\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Proceed to Checkout button from Addresses page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_Proceed_to_Checkout_button_from_Addresses_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message should display \"Shipping\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Agree Terms and conditions checkbox",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_Agree_Terms_and_conditions_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Proceed to Checkout button from Shipping page",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_Proceed_to_Checkout_button_from_Shipping_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message should display \"Please choose your payment method\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Payby wire from Payment page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_Payby_wire_from_Payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message should display \"Order summary\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click confirm order button from Order Summary page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.click_confirm_order_button_from_Order_Summary_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message should display \"Order confirmation\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message should display \"Your order on My Store is complete.\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.message_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Order confirmation - My Store\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.page_Title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});